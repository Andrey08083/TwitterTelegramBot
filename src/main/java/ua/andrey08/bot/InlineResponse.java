package ua.andrey08.bot;

import org.apache.commons.codec.digest.DigestUtils;
import org.telegram.telegrambots.meta.api.methods.AnswerInlineQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultVideo;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ua.andrey08.api.Requests;
import ua.andrey08.data.Reference;
import ua.andrey08.entities.Media;
import ua.andrey08.entities.Tweet;
import ua.andrey08.entities.Variant;
import ua.andrey08.parser.LinkParser;

import java.util.ArrayList;
import java.util.List;

public class InlineResponse {

    public static void responseToUpdate(Update update, long start) {
        Tweet tweet = Requests.makeRequest(LinkParser.getIdFromLink(update.getInlineQuery().getQuery()));
        if (tweet != null) {
            AnswerInlineQuery answerInlineQuery;
            List<InlineQueryResultVideo> videos = new ArrayList<>();
            for (Media media : tweet.extended_entities.media) {
                for (Variant variant : media.video_info.variants) {
                    if (!variant.content_type.equals("application/x-mpegURL") && variant.content_type.contains("video")) {
                        InlineQueryResultVideo video = InlineQueryResultVideo
                                .builder()
                                .title(LinkParser.getSizeFromLink(variant.url))
                                .mimeType(variant.content_type)
                                .id(DigestUtils.md5Hex(variant.url))
                                .videoUrl(variant.url)
                                .thumbUrl(media.media_url_https)
                                .build();
                        videos.add(video);
                    }
                }
            }
            answerInlineQuery = AnswerInlineQuery
                    .builder()
                    .inlineQueryId(update.getInlineQuery().getId())
                    .results(videos)
                    .build();

            try {
                Reference.bot.execute(answerInlineQuery);
                long end = System.currentTimeMillis();
                Reference.logger.info(String.format("Update processed in %s ms", end - start));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}

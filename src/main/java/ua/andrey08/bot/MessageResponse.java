package ua.andrey08.bot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ua.andrey08.api.Requests;
import ua.andrey08.data.Reference;
import ua.andrey08.entities.Media;
import ua.andrey08.entities.Tweet;
import ua.andrey08.entities.Variant;
import ua.andrey08.parser.LinkParser;

import java.util.Arrays;

public class MessageResponse {

    public static void responseToUpdate(Update update) {
        Tweet tweet = Requests.makeRequest(LinkParser.getIdFromLink(update.getMessage().getText()));
        SendMessage message;
        if (tweet != null) {
            String messageText = "";
            for (Media media : tweet.extended_entities.media) {
                for (Variant variant : media.video_info.variants) {
                    if (!variant.content_type.equals("application/x-mpegURL") && variant.content_type.contains("video")) {
                        messageText += String.format("Size: %s , URL: %s\n", LinkParser.getSizeFromLink(variant.url), variant.url);
                    }
                }
            }
            message = SendMessage
                    .builder()
                    .chatId(update.getMessage().getChatId().toString())
                    .replyToMessageId(update.getMessage().getMessageId())
                    .disableWebPagePreview(true)
                    .text(messageText)
                    .build();
            try {
                Reference.bot.execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}

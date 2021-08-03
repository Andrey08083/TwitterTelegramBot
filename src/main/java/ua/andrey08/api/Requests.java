package ua.andrey08.api;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import ua.andrey08.data.Reference;
import ua.andrey08.entities.Tweet;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Requests {

    public static Tweet makeRequest(String id) {
        HttpGet request = new HttpGet(String.format("https://api.twitter.com/1.1/statuses/show.json?id=%s&tweet_mode=extended", id));
        request.addHeader(new BasicHeader("Authorization", String.format("Bearer %s", Reference.botConfig.twitterToken)));

        CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setCookieSpec(CookieSpecs.STANDARD).build())
                .build();
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            String answer = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8);
            if (answer.startsWith("{\"errors\"")) {
                return null;
            }
            return Reference.mapper.readValue(answer, Tweet.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package ua.andrey08.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entities {
    public List<Object> hashtags;
    public List<Object> symbols;
    public List<Object> user_mentions;
    public List<Object> urls;
    public List<Media> media;
    public Description description;

    @Override
    public String toString() {
        return "Entities{" +
                "hashtags=" + hashtags +
                ", symbols=" + symbols +
                ", user_mentions=" + user_mentions +
                ", urls=" + urls +
                ", media=" + media +
                ", description=" + description +
                '}';
    }
}
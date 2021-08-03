package ua.andrey08.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoInfo {
    public List<Integer> aspect_ratio;
    public int duration_millis;
    public List<Variant> variants;

    @Override
    public String toString() {
        return "VideoInfo{" +
                "aspect_ratio=" + aspect_ratio +
                ", duration_millis=" + duration_millis +
                ", variants=" + variants +
                '}';
    }
}

package ua.andrey08.entities;

import java.util.List;

public class Media {
    public long id;
    public String id_str;
    public List<Integer> indices;
    public String media_url;
    public String media_url_https;
    public String url;
    public String display_url;
    public String expanded_url;
    public String type;
    public Sizes sizes;
    public VideoInfo video_info;
    public AdditionalMediaInfo additional_media_info;

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", id_str='" + id_str + '\'' +
                ", indices=" + indices +
                ", media_url='" + media_url + '\'' +
                ", media_url_https='" + media_url_https + '\'' +
                ", url='" + url + '\'' +
                ", display_url='" + display_url + '\'' +
                ", expanded_url='" + expanded_url + '\'' +
                ", type='" + type + '\'' +
                ", sizes=" + sizes +
                ", video_info=" + video_info +
                ", additional_media_info=" + additional_media_info +
                '}';
    }
}

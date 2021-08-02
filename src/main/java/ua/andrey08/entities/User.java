package ua.andrey08.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class User {
    public long id;
    public String id_str;
    public String name;
    public String screen_name;
    public String location;
    public String description;
    public String url;
    public Entities entities;

    @JsonProperty("protected")
    public boolean isProtected;

    public int followers_count;
    public int friends_count;
    public int listed_count;
    public String created_at;
    public int favourites_count;
    public String utc_offset;
    public String time_zone;
    public boolean geo_enabled;
    public boolean verified;
    public int statuses_count;
    public String lang;
    public boolean contributors_enabled;
    public boolean is_translator;
    public boolean is_translation_enabled;
    public String profile_background_color;
    public String profile_background_image_url;
    public String profile_background_image_url_https;
    public boolean profile_background_tile;
    public String profile_image_url;
    public String profile_image_url_https;
    public String profile_banner_url;
    public String profile_link_color;
    public String profile_sidebar_border_color;
    public String profile_sidebar_fill_color;
    public String profile_text_color;
    public boolean profile_use_background_image;
    public boolean has_extended_profile;
    public boolean default_profile;
    public boolean default_profile_image;
    public Object following;
    public Object follow_request_sent;
    public Object notifications;
    public String translator_type;
    public List<Object> withheld_in_countries;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", id_str='" + id_str + '\'' +
                ", name='" + name + '\'' +
                ", screen_name='" + screen_name + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", entities=" + entities +
                ", isProtected=" + isProtected +
                ", followers_count=" + followers_count +
                ", friends_count=" + friends_count +
                ", listed_count=" + listed_count +
                ", created_at='" + created_at + '\'' +
                ", favourites_count=" + favourites_count +
                ", utc_offset='" + utc_offset + '\'' +
                ", time_zone='" + time_zone + '\'' +
                ", geo_enabled=" + geo_enabled +
                ", verified=" + verified +
                ", statuses_count=" + statuses_count +
                ", lang='" + lang + '\'' +
                ", contributors_enabled=" + contributors_enabled +
                ", is_translator=" + is_translator +
                ", is_translation_enabled=" + is_translation_enabled +
                ", profile_background_color='" + profile_background_color + '\'' +
                ", profile_background_image_url='" + profile_background_image_url + '\'' +
                ", profile_background_image_url_https='" + profile_background_image_url_https + '\'' +
                ", profile_background_tile=" + profile_background_tile +
                ", profile_image_url='" + profile_image_url + '\'' +
                ", profile_image_url_https='" + profile_image_url_https + '\'' +
                ", profile_banner_url='" + profile_banner_url + '\'' +
                ", profile_link_color='" + profile_link_color + '\'' +
                ", profile_sidebar_border_color='" + profile_sidebar_border_color + '\'' +
                ", profile_sidebar_fill_color='" + profile_sidebar_fill_color + '\'' +
                ", profile_text_color='" + profile_text_color + '\'' +
                ", profile_use_background_image=" + profile_use_background_image +
                ", has_extended_profile=" + has_extended_profile +
                ", default_profile=" + default_profile +
                ", default_profile_image=" + default_profile_image +
                ", following=" + following +
                ", follow_request_sent=" + follow_request_sent +
                ", notifications=" + notifications +
                ", translator_type='" + translator_type + '\'' +
                ", withheld_in_countries=" + withheld_in_countries +
                '}';
    }
}

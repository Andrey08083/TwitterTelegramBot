package ua.andrey08.entities;

public class Tweet {
    public String created_at;
    public long id;
    public String id_str;
    public String text;
    public boolean truncated;
    public Entities entities;
    public ExtendedEntities extended_entities;
    public String source;
    public Object in_reply_to_status_id;
    public Object in_reply_to_status_id_str;
    public Object in_reply_to_user_id;
    public Object in_reply_to_user_id_str;
    public Object in_reply_to_screen_name;
    public User user;
    public Object geo;
    public Object coordinates;
    public Object place;
    public Object contributors;
    public boolean is_quote_status;
    public int retweet_count;
    public int favorite_count;
    public boolean favorited;
    public boolean retweeted;
    public boolean possibly_sensitive;
    public boolean possibly_sensitive_appealable;
    public String lang;

    @Override
    public String toString() {
        return "Tweet{" +
                "created_at='" + created_at + '\'' +
                ", id=" + id +
                ", id_str='" + id_str + '\'' +
                ", text='" + text + '\'' +
                ", truncated=" + truncated +
                ", entities=" + entities +
                ", extended_entities=" + extended_entities +
                ", source='" + source + '\'' +
                ", in_reply_to_status_id=" + in_reply_to_status_id +
                ", in_reply_to_status_id_str=" + in_reply_to_status_id_str +
                ", in_reply_to_user_id=" + in_reply_to_user_id +
                ", in_reply_to_user_id_str=" + in_reply_to_user_id_str +
                ", in_reply_to_screen_name=" + in_reply_to_screen_name +
                ", user=" + user +
                ", geo=" + geo +
                ", coordinates=" + coordinates +
                ", place=" + place +
                ", contributors=" + contributors +
                ", is_quote_status=" + is_quote_status +
                ", retweet_count=" + retweet_count +
                ", favorite_count=" + favorite_count +
                ", favorited=" + favorited +
                ", retweeted=" + retweeted +
                ", possibly_sensitive=" + possibly_sensitive +
                ", possibly_sensitive_appealable=" + possibly_sensitive_appealable +
                ", lang='" + lang + '\'' +
                '}';
    }
}




package ua.andrey08.entities;

public class Variant {
    public String content_type;

    public int bitrate;

    public String url;

    @Override
    public String toString() {
        return "Variant{" +
                "content_type='" + content_type + '\'' +
                ", bitrate=" + bitrate +
                ", url='" + url + '\'' +
                '}';
    }
}

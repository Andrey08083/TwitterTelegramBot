package ua.andrey08.parser;

public class LinkParser {

    public static String getIdFromLink(String link) {
        return link.split("/")[link.split("/").length - 1];
    }
    
    public static String getSizeFromLink(String link) {
        if (link.contains("tweet_video")) {
            return link.split("/")[4];
        } else if (link.contains("amplify_video")) {
            return link.split("/")[6];
        } else {
            return link.split("/")[7];
        }
    }
}

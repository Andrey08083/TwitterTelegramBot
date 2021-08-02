package ua.andrey08.parser;

import java.util.Arrays;
import java.util.Comparator;

public class LinkParser {

    public static String getIdFromLink(String link) {
        return Arrays.stream(link.replace("\\", "").split("/")).max(Comparator.comparingInt(String::length)).get();
    }
}

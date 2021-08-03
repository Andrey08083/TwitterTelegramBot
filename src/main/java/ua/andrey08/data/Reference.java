package ua.andrey08.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import ua.andrey08.bot.Bot;

public class Reference {

    public static ObjectMapper mapper = new ObjectMapper();
    public static Bot bot;
    public static BotConfig botConfig;
}

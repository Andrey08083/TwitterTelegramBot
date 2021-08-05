package ua.andrey08.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.andrey08.bot.Bot;

public class Reference {

    public static Logger logger = LoggerFactory.getLogger(Bot.class);
    public static ObjectMapper mapper = new ObjectMapper();
    public static Bot bot;
    public static BotConfig botConfig;
}

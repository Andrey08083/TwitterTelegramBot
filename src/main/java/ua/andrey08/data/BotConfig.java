package ua.andrey08.data;

import java.io.File;
import java.io.IOException;

public class BotConfig {

    public String botToken;
    public String botUsername;
    public String twitterToken;
    public long creatorId;

    public static void initConfig(File configFile) {
        try {
            Reference.botConfig = Reference.mapper.readValue(configFile, BotConfig.class);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}

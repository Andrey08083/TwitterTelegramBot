package ua.andrey08.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import ua.andrey08.data.Reference;

public class Bot extends TelegramLongPollingBot {

    public Bot() {
        Reference.bot = this;
    }

    @Override
    public void onUpdateReceived(Update update) {
        Reference.logger.info(String.format("Update: %s", update));
        long start = System.currentTimeMillis();
        if (update.hasInlineQuery()) {
            InlineResponse.responseToUpdate(update, start);
        }
        else if (update.hasMessage() && update.getMessage().isUserMessage() && update.getMessage().hasText()) {
            MessageResponse.responseToUpdate(update, start);
        }
    }

    @Override
    public void onRegister() {
        Reference.logger.info("Bot registered!");
        super.onRegister();
    }

    @Override
    public String getBotUsername() {
        return Reference.botConfig.botUsername;
    }

    @Override
    public String getBotToken() {
        return Reference.botConfig.botToken;
    }
}

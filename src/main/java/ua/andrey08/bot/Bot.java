package ua.andrey08.bot;

import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import ua.andrey08.data.Reference;

public class Bot extends AbilityBot {

    public Bot(String botToken, String botUsername) {
        super(botToken, botUsername);
        Reference.bot = this;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasInlineQuery()) {
            InlineResponse.responseToUpdate(update);
        }
        else if (update.hasMessage() && update.getMessage().isUserMessage() && update.getMessage().hasText()) {
            MessageResponse.responseToUpdate(update);
        }
        super.onUpdateReceived(update);
    }

    @Override
    public long creatorId() {
        return Reference.botConfig.creatorId;
    }
}

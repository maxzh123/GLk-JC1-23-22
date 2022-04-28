package telegramBot;

import org.telegram.telegrambots.extensions.bots.commandbot.TelegramLongPollingCommandBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.HashMap;

public class bot extends TelegramLongPollingCommandBot {
    private final String BOT_NAME="";
    private final String BOT_TOKEN="";

    //Настройки по умолчанию
    //@Getter


    //Класс для обработки сообщений, не являющихся командой
   // private final NonCommand nonCommand;

    /**
     * Настройки файла для разных пользователей. Ключ - уникальный id чата
     */
   // @Getter
    public static void main(String[] args) {
        new bot();
    }

    public bot() {
        super();
        //создаём вспомогательный класс для работы с сообщениями, не являющимися командами
//        this.nonCommand = new NonCommand();
//        //регистрируем команды
//        register(new StartCommand("start", "Старт"));
//        register(new PlusCommand("plus", "Сложение"));
//        register(new MinusCommand("minus", "Вычитание"));
//        register(new PlusMinusCommand("plusminus", "Сложение и вычитание"));
//        register(new HelpCommand("help","Помощь"));
//        register(new SettingsCommand("settings", "Мои настройки"));

    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    /**
     * Ответ на запрос, не являющийся командой
     */
    @Override
    public void processNonCommandUpdate(Update update) {
        Message msg = update.getMessage();
        Long chatId = msg.getChatId();
        String userName = getUserName(msg);

        //String answer = nonCommand.nonCommandExecute(chatId, userName, msg.getText());
        //setAnswer(chatId, userName, answer);
    }

    /**
     * Получение настроек по id чата. Если ранее для этого чата в ходе сеанса работы бота настройки не были установлены, используются настройки по умолчанию
     */


    /**
     * Формирование имени пользователя
     * @param msg сообщение
     */
    private String getUserName(Message msg) {
        User user = msg.getFrom();
        String userName = user.getUserName();
        return (userName != null) ? userName : String.format("%s %s", user.getLastName(), user.getFirstName());
    }

    /**
     * Отправка ответа
     * @param chatId id чата
     * @param userName имя пользователя
     * @param text текст ответа
     */
    private void setAnswer(Long chatId, String userName, String text) {
        SendMessage answer = new SendMessage();
        answer.setText(text);
        answer.setChatId(chatId.toString());
        try {
            execute(answer);
        } catch (TelegramApiException e) {
            //логируем сбой Telegram Bot API, используя userName
        }
    }
}

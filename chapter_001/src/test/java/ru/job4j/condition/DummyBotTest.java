package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sergey Belyj (sergiuszbelyj@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("\u041f\u0440\u0438\u0432\u0435\u0442, \u0411\u043e\u0442."),
                is("\u041f\u0440\u0438\u0432\u0435\u0442, \u0443\u043c\u043d\u0438\u043a.")
        );
    }

    @Test
    public void whenByuBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("\u041f\u043e\u043a\u0430."),
                is("\u0414\u043e \u0441\u043a\u043e\u0440\u043e\u0439 \u0432\u0441\u0442\u0440\u0435\u0447\u0438.")
        );
    }

    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("\u0421\u043a\u043e\u043b\u044c\u043a\u043e \u0431\u0443\u0434\u0435\u0442 2 + 2?"),
                is("\u042d\u0442\u043e \u0441\u0442\u0430\u0432\u0438\u0442 \u043c\u0435\u043d\u044f \u0432 \u0442\u0443\u043f\u0438\u043a. \u0421\u043f\u0440\u043e\u0441\u0438\u0442\u0435 \u0434\u0440\u0443\u0433\u043e\u0439 \u0432\u043e\u043f\u0440\u043e\u0441.")
        );
    }
}
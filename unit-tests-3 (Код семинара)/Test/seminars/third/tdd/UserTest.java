package seminars.third.tdd;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    MoodAnalyser moodAnalyser;
    User user;

    @BeforeEach
    void setUp(){
        moodAnalyser = new MoodAnalyser();
        user = new User();
    }

    @Test
    void testUserMood(){
        assertThat(moodAnalyser.analyseMood("Good")).
                isEqualTo("Good");
    }

    @Test
    void testCheckPass(){
        assertTrue(user.checkPass("admin", "admin"));
    }
    @Test
    void testCheckPassFalse(){
        assertFalse(user.checkPass("admi", "admin"));
    }

    /** Task 1
     * Напишите тесты, покрывающие на 100% метод evenOddNumber,
     * который проверяет, является ли переданное число четным или нечетным.
     */
    @Test
    void testEvenOddNumberTrue(){
        assertTrue(user.evenOddNumber(2));
    }
    @Test
    void testEvenOddNumberFalse(){
        assertFalse(user.evenOddNumber(3));
    }

    /**Task 2
     * Разработайте и протестируйте метод numberInInterval, который проверяет,
     * попадает ли переданное число в интервал (25;100).*/
    @Test
    void testNumberInIntervalTrue(){

        assertTrue(user.numberInInterval(50));
    }
    @Test
    void testNumberInIntervalFalse(){

        assertFalse(user.numberInInterval(2));
    }
    /**
     * Добрый вечер Роман, над третьим заданием сегодня занялся,
     * что-то я там запутался
     * В IntelliJ IDEA русские буквы в консоли у меня выводятся в виде символов
     * уже столько месяцев не могу решить эту проблему)) в интернете разные способы
     * предлагают ни один не помог))
     * Может Вы знаете)
     * */


}
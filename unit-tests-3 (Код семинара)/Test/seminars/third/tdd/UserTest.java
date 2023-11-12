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

    @Test
    void testEvenOddNumberTrue(){
        assertTrue(user.evenOddNumber(2));
    }
    @Test
    void testEvenOddNumberFalse(){
        assertFalse(user.evenOddNumber(3));
    }

    @Test
    void testNumberInIntervalTrue(){

        assertTrue(user.numberInInterval(50));
    }
    @Test
    void testNumberInIntervalFalse(){

        assertFalse(user.numberInInterval(2));
    }


}
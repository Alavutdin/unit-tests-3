package seminars.third.coverage;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//
//import static org.assertj.core.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    SomeService someService;
   // 3.1.

    @BeforeEach
    void setUp(){
        someService = new SomeService();
    }

    @Test
    void multipleThreeNotFiveReturnsFizz() {
        assertEquals("Fizz",someService.fizzBuzz(3));

        // assertEquals...
    }
    @Test
    void multipleThreeNotFiveReturnsBuzz() {
        assertEquals("Buzz",someService.fizzBuzz(5));
    }

    @Test
    void multipleThreeNotFiveReturnsFizzBuzz() {
        assertEquals("FizzBuzz",someService.fizzBuzz(15));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 7, 11, 22})
    void multipleThreeNotFiveReturnsNumber(int i) {
        assertEquals(String.valueOf(i),someService.fizzBuzz(i));
    }

    @Test
    void checkFirstLast6IsTrue(){
        assertTrue(someService.firstLast6(new int[]{6,2,3}));
        assertTrue(someService.firstLast6(new int[]{2,3,6}));
    }
    @Test
    void checkFirstLast6IsFarse(){
        assertFalse(someService.firstLast6(new int[]{2,6,3}));
        assertFalse(someService.firstLast6(new int[]{2,3}));
    }
    @Test
    void insufficientCoverageTest(){

        System.out.println(someService.calculatingDiscount(2000.0, 10));
        assertThat(someService.calculatingDiscount(2000.0, 50))
                .isEqualTo(1000); // обычная скидка
        assertThat(someService.calculatingDiscount(2000.0, 100))
                .isEqualTo(0); // обычная скидка
        assertThat(someService.calculatingDiscount(2000.0, 0))
                .isEqualTo(2000); // обычная скидка


        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%

        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
    }
    //@Test

    @Test
    void correctLuckySum(){
        assertThat(someService.luckySum(1,4,8)).isEqualTo(13);
    }
    @Test
    void correctLuckySumA(){
        assertThat(someService.luckySum(13,4,8)).isEqualTo(12);
    }




}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void shouldReturnOneForZeroFactorial() {
        //arrange
        Factorial factorial = new Factorial();
        //act
        int actualResult = factorial.calculateFactorial(0);
        //assert
        int expectedResult = 1;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnOneForOneFactorial() {
        //arrange
        Factorial factorial = new Factorial();
        //act
        int actualResult = factorial.calculateFactorial(1);
        //assert
        int expectedResult = 1;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnTwoForTwoFactorial() {
        //arrange
        Factorial factorial = new Factorial();
        //act
        int actualResult = factorial.calculateFactorial(2);
        //assert
        int expectedResult = 2;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnSixForThreeFactorial() {
        //arrange
        Factorial factorial = new Factorial();
        //act
        int actualResult = factorial.calculateFactorial(3);
        //assert
        int expectedResult = 6;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnTwentyFourForFourFactorial() {
        //arrange
        Factorial factorial = new Factorial();
        //act
        int actualResult = factorial.calculateFactorial(4);
        //assert
        int expectedResult = 24;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnOneHundredTwentyForFiveFactorial() {
        //arrange
        Factorial factorial = new Factorial();
        //act
        int actualResult = factorial.calculateFactorial(5);
        //assert
        int expectedResult = 120;
        assertEquals(expectedResult,actualResult);
    }
}

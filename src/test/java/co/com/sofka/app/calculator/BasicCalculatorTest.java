package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void suma() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing res: 4-1=3")
    public void resta() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 1L;
        Long expectedValue = 3L;

        // Act
        Long result = basicCalculator.res(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing div: 4/2=2")
    public void division() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.div(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing mup: 3*5=15")
    public void multi() {
        // Arrange
        Long number1 = 3L;
        Long number2 = 5L;
        Long expectedValue = 15L;

        // Act
        Long result = basicCalculator.mul(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }


    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101",
            "2,   2,    4"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);

    }

    @DisplayName("Testing several res")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "3,    2,   1",
            "20,   5,   15",
            "30,  20,   10",
            "100,  200, -100"
    })
    public void severalres(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.res(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);

    }

    @DisplayName("Testing several mul")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "3,    2,   6",
            "20,   2,   40",
            "30,   1,   30",
            "100,  4,  400"
    })
    public void severalmul(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.mul(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);

    }

    @DisplayName("Testing several div")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "4,    2,   2",
            "30,   3,   10",
            "30,   1,   30",
            "100,  5,   20"
    })
    public void severaldiv(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.div(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);


    }
}
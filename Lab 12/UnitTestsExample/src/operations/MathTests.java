package operations;

import org.junit.Assert;
import org.junit.Test;

public class MathTests {

    @Test
    public void add_TwoPlusTwo_ReturnsFour() {
        // Arrange
        final int expected = 4;

        // Act
        final int actual = MathOperations.add(2, 2);

        // Assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void divide_TenDividedByFive_ReturnsTwo() {
        final double expected = 2.0;

        final double actual = MathOperations.divide(10, 5);

        // 0.1f delta used for comparison
        Assert.assertEquals(actual, expected,0.1f);
    }


    @Test(expected  = IllegalArgumentException.class)
    public void divide_TenDividedByZero_ThrowsIllegalArgumentException() {
        MathOperations.divide(10, 0);
    }
}

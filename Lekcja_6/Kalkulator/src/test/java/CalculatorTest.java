import com.futurecollars.lesson6.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldAddTwoValues1and1() {
        double sum = Calculator.sum(1, 1);
        Assertions.assertEquals(2, sum);
    }
    @Test
    void shouldSubtractTwoValues1and1() {
        double sub = Calculator.sub(1, 1);
        Assertions.assertEquals(0, sub);
    }
    @Test
    void shouldMultiplyTwoValues1and1() {
        double mul = Calculator.mul(1, 1);
        Assertions.assertEquals(1, mul);
    }
    @Test
    void shouldDivideTwoValues1and1() {
        double div = Calculator.div(1, 1);
        Assertions.assertEquals(1, div);
    }
}
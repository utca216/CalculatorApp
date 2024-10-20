import com.example.calculatorapp.Calculator;
import org.junit.jupiter.api.Test;

import static com.example.calculatorapp.Calculator.calculate;
import static org.junit.jupiter.api.Assertions.*;

public class ScalculatorTest {
    @Test void CalculateTest(){
        assertEquals(15,calculate("5+10"));
    }

}

import java.math.*;
import java.util.ArrayList;

public class Multiplier {

    public static int multiply(int number1, int number2){
        return number1 * number2;
    }
    public static int multiply(int number1, int number2, int number3, int number4){
        return multiply(number1, number2) * multiply(number3, number4);
    }
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }
    public static BigDecimal multiply(BigDecimal number1, BigDecimal number2){
        return number1.multiply(number2);
    }
    public static int multiply(ArrayList<Integer> numbers){
        int result = 1;
        for (Integer number:numbers) {
            result = result * number;
        }
        return result;
    }

}

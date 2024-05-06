import java.math.BigDecimal;

public class Adder {
    public static int add(int number1, int number2){
        return number1 + number2;
    }
    public static BigDecimal add(BigDecimal number1, BigDecimal number2){
        return number1.add(number2);
    }

}

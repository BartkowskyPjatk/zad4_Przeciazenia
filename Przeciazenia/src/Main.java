import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Zad 1
            //Liczby
        int TestNumber1 = 2;
        int TestNumber2 = 2;
        int TestNumber3 = 2;
        int TestNumber4 = 2;
        double TestDouble1 = 4.5;
        double TestDouble2 = 5.6;
        BigDecimal BigDTest1 = new BigDecimal("5.24");
        BigDecimal BigDTest2 = new BigDecimal("3.54");
        ArrayList<Integer> numbersList= new ArrayList<Integer>();
        numbersList.add(6);
        numbersList.add(7);
            //wywoływanie
        System.out.println(Multiplier.multiply(TestNumber1, TestNumber2));
        System.out.println(Multiplier.multiply(TestNumber1, TestNumber2, TestNumber3, TestNumber4));
        System.out.println(Multiplier.multiply(TestDouble1, TestDouble2));
        System.out.println(Multiplier.multiply(BigDTest1, BigDTest2));
        System.out.println(Multiplier.multiply(numbersList));

        //Zad2
        System.out.println(Address.createAddress("Poland"));
        System.out.println(Address.createAddress("Poland", "Warsaw"));
        System.out.println(Address.createAddress("Poland", "Warsaw", 11111));
        System.out.println(Address.createAddress("Poland", "Warsaw", 11111, "Koszykowa"));
        System.out.println(Address.createAddress("Poland", "Warsaw", 11111, "Koszykowa", 99));



    }
}
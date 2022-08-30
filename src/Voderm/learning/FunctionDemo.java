package Voderm.learning;

import java.util.function.Function;

/**
 * @author: voderm Lee
 * @date: 2022/8/29 9:14
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,Double> milesToKms = (input) -> 1.6 * input;
        int miles = 3;
        double kms = milesToKms.apply(miles);
        System.out.printf("%d miles = %3.2f kilometers\n",miles,kms);
    }
}

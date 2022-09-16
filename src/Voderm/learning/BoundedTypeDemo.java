package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/9/16 15:22
 */
import java.awt.font.NumericShaper;
import java.util.*;
public class BoundedTypeDemo {
    // 要求 类型 参数必须是Number类或者其子类 extends指定上界， super 指定下界 ？super Interger的含义是Integer类型或其父类型
    public static double getAverage(List<? extends Number> numberList){
        double total = 0.0;
        for (Number number : numberList){
            total += number.doubleValue();
        }
        return total/numberList.size();
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(3);
        integerList.add(30);
        integerList.add(300);
        System.out.println(getAverage(integerList)); // Integer类是Number类的子类，因此可以当作参数输入

        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(5.56);
        doubleList.add(55.6);
        System.out.println(getAverage(doubleList));// Double类是Number类的子类，因此可以当作参数输入
    }
}

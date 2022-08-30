package Voderm.learning;

import java.util.function.BiFunction;

/**
 * @author: voderm Lee
 * @date: 2022/8/29 14:19
 */
public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Float,Float,Float> area = (width, length) ->width * length; //lamda 表达式，函数式接口
        float width = 7.0F;
        float length = 10.0F;
        float result = area.apply(width,length);
        System.out.println(result);
    }
}

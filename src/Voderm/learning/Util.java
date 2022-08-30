package Voderm.learning;

import Voderm.Myclass.Pair;

/**
 * @author: voderm Lee
 * @date: 2022/8/29 15:19
 */
public class Util {
    //定义泛型方法。
    //泛型方法 是带类型参数的方法，成员方法和构造方法都可以定义为泛型方法。
    public static <T> void swap(T[] array, int i, int j){ //必须要声明一下类型参数
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static <K,V> boolean compare(Pair<K,V> p1,Pair<K,V> p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        Integer[] numbers = {1,3,5,7};
        Util.<Integer>swap(numbers,0,3);
        for(Integer n:numbers){
            System.out.println(n + " ");
        }
        Pair<Integer,String >p1 = new Pair<>(1,"apple");
        Pair<Integer,String> p2 = new Pair<>(2,"orange");
        boolean same = Util.compare(p1,p2);
        System.out.println(same);
    }
}

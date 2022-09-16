package Voderm.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author: voderm Lee
 * @date: 2022/9/16 16:32
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("one");
        myList.add("two");
        myList.add("threee");
        myList.add("four");
        ListIterator<String> iterator = myList.listIterator();
        // 将迭代器指针移到线性表末尾
        while (iterator.hasNext())
        {
            iterator.next();
        }
        // 从后往前访问线性表每个元素
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        String[] str = {"one","two","threer","four"};
        List<String> list = Arrays.asList(str);
        System.out.println(list);

        //也可以将数组元素直接作为asList（）方法的参数写在括号中

//        List<String> list1 = Arrays.asList({"one","two","threer","four"});

        // 注意，Arrays.asList方法返回的List对象是不可变的，如果要对该对象进行修改的操作
//        需要将其作为一个参数传递给另一个List的构造方法、
//        List<String> list = new ArrayList<>(Arrays.asList(str));

    }
}

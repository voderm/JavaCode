package Voderm.learning;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: voderm Lee
 * @date: 2022/9/16 15:09
 */
public class WildCardDemo {
    public static void printList(List<?> list){
        for (Object element: list){
            System.out.println(element);
        }

    }
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("cat");
        myList.add("dog");
        myList.add("horse");
        printList(myList);

    }
}

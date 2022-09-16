package Voderm.learning;

import java.io.IOException;

/**
 * @author: voderm Lee
 * @date: 2022/9/16 17:06
 */
public class InputCharDemo {
    public static void main(String[] args) {
        System.out.println("please enter the character: ");
        try {
            char c = (char) System.in.read();
            System.out.println("c = "+c);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

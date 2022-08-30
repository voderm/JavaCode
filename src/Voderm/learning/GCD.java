package Voderm.learning;

import java.util.Scanner;
// GCD = greatest common divisor  最大公约数
public class GCD {
    public static void main(String[] args) {
        // two numbers gcd
        int num1,num2;
        // from 1 check gcd until less one of num
        int gcd = 1 ;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number1 ");
        num1 = input.nextInt();
        System.out.println("please enter number2 ");
        num2 = input.nextInt();
        int temp = gcd;
        for (;temp <= num1 && temp <= num2;temp++){
            if(num1 % temp == 0 && num2 % temp == 0){
                gcd = temp;
            }
        }

        System.out.println("The tow numbers' gcd is:" + gcd);
    }
}

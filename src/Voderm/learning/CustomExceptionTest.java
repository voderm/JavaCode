package Voderm.learning;

import Voderm.Myclass.CustomException;

import java.util.Scanner;

/**
 * @author: voderm Lee
 * @date: 2022/9/20 16:11
 */
public class CustomExceptionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 0, area = 0;
        System.out.print("Please enter the radius:");
        try {
            radius = input.nextDouble();
            if (radius < 0){
                throw new CustomException("半径值不能小于0.");
            }else{
                area = Math.PI * radius *radius;
                System.out.println("The area of circle is :" + area);
            }
        }catch (CustomException nve){
            System.out.println(nve.getMessage());
        }
    }
}

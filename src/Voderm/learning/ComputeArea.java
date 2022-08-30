package Voderm.learning;
import java.util.Scanner;
public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your input:");
        // 可以使用scanner类的netInt方法和nextDouble方法来从键盘读取数据
        radius = input.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("The area of yuan:"+area);
    }
}

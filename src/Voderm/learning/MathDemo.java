package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/8/27 11:32
 */
// Math类是final类，且构造方法是private的，因此他不能被继承，也不能实例化，只能通过类名去访问方法
public class MathDemo {
    public static void main(String[] args) {
        System.out.println("sqrt(2) = " + Math.sqrt(2)); //返回2的平方根
        System.out.println("pow (2,5)"); // 2的五次方
        System.out.println("rint (2.5) = " + Math.rint(2.5)); // 返回与x最接近的整数，如果到2个整数的距离以下，返回偶数

    }
}

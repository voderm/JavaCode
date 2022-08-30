package Voderm.learning;

import java.util.Arrays;

/**
 * @author: voderm Lee
 * @date: 2022/8/28 16:59
 */
public class Circle implements Comparable<Circle>{
    //成员变量
    private double radius;
    // 构造方法
    public Circle(){}
    public Circle(double radius)
    {
        this.radius = radius;
    }

    //定义成员方法，得到面积和周长
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    //覆盖Comparable中的compareTo方法
    @Override
    public int compareTo(Circle circle){
        if(getArea() < circle.getArea())
            return -1;
        else if (getArea() == circle.getArea())
            return 0;
        else
            return 1;

    }

    public static void main(String[] args) {
        Circle[] circle = new Circle[]{
                new Circle(3.4),new Circle(2.5),new Circle(5.8)
        };
        System.out.println(circle[0].compareTo(circle[1]));
        Arrays.sort(circle);
        for (Circle c: circle)
            System.out.printf("%6.2f%n",c.getArea());
    }
}

package Voderm.Myclass;

/**
 * @author: voderm Lee
 * @date: 2022/8/26 14:38
 */
public class Circle extends Shape{
    //成员变量
    private double radius;

    public Circle(){
        this(0.0);
    }
    public Circle(double radius) {
        super("圆");  //这里是调用父类构造方法，一会进行代码的重构，合并到一个构造函数中
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    // 实现抽象类的抽象方法
    @Override
    public double getPerimeter(){
        return 2* Math.PI * radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
        return "圆 radius = " + radius;
    }
}

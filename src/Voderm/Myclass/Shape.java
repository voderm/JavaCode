package Voderm.Myclass;

/**
 * @author: voderm Lee
 * @date: 2022/8/26 14:29
 */
public abstract class Shape { //由于类中定义了抽象方法，因此需要定义为抽象类
    String name;
    public Shape(){
        //尽管在抽象类中可以定义构造方法，但抽象类不能被直接实例化，只有被子类继承之后才能实例化。
    }
    public Shape(String name){
        this.name = name;
    }
    //抽象方法的作用是为所有子类提供一个统一的接口。
    public abstract double getArea(); // 定义抽象方法，只需要声明，不需要实现。
    public abstract double getPerimeter();
}
// 因为abstract类必须被继承，而final类不能被继承，因此不能在定义类时同时被使用
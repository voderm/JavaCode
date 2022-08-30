package Voderm.Myclass;

import java.util.Objects;

// 继承Person类，对person类进行扩展
public class Employee extends Person{
    //成员变量
    public double salary;
    public int id;
    //constructor method with no args.
    //当自己设计一个构造函数后，系统默认的无参构造函数就会消失，这时，要想继续使用无参构造函数，则需要自己显式的写出来。
    public Employee()
    {

    }
    public Employee(double salary){
        this.salary = salary;
    }
    public Employee(String name, int age, double salary){
        super(name,age);
        this.salary = salary;
    }
    //成员方法
    public double computesalary(int hours,double rate){
        double salary = hours * rate;
        return this.salary + salary;
    }
    // 对父类中的sayhello方法进行覆盖。
    // 如果子类覆盖了超类的方法，在调用相同的方法时，调用的是子类的方法，（子类实例）
    @Override //注解语法，即：在要覆盖的方法前面添加 @Override
    // 如果具有该注解的方法没有覆盖父类的方法，编译器将报告一个错误 例如 sayHello 写成了 sayhello，就会出现编译错误
    public void sayHello(){
        System.out.println("Hello, I am " + name);
        System.out.println("I am " + age);
        System.out.println("My salary is " + salary);

    }
    //重写object类中的我toString方法，object类中的定义是返回类名加一个@符号，再加一个十六进制整数
    @Override
    public String toString(){
        return "员工信息: "+ name + " " +age +" "+salary;
    }
    //重写object类中的 equals方法，在object类中该方法比较的是两个对象的引用是否相等
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Employee)
            return this.id==((Employee)obj).id;
        else
            return false;
    }
    /*hashCode()方法必须和equals方法是兼容的，因为equals方法比较的是引用是否相同，
    也就是地址是否相同，而hashcode（）方法返回的就是对象在计算机内存储的十进制内存地址
    因此 hashCode方法必须和equals方法兼容。如果覆盖了equals方法，必须也要覆盖hashcode方法
     */
    @Override
    public int hashCode(){
        return Objects.hash(name,age,salary); //该方法的参数是可变参数，计算每个参数的哈希码，并将他们组合起来。
    }
}

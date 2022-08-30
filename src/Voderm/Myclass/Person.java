package Voderm.Myclass;

public class Person {
    // 成员变量
    public String name;
    public int age;
    // constructor method with no agrgs
    public Person(){

    }
    public Person(String name, int age)
    {
        this.name = name;//将形参接收的值，赋值给成员变量，成员变量通过this访问
        this.age = age;
    }
    public void sayHello()
    {
        System.out.println("My name is " + name);
    }
}

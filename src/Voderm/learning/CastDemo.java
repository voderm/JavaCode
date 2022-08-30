package Voderm.learning;

import Voderm.Myclass.Employee;
import Voderm.Myclass.Person;

/**
 * @author: voderm Lee
 * @date: 2022/8/26 14:58
 */
public class CastDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("voderm",22,20000);
        System.out.println(emp); // 输出对象的字符串表示形式，编译器自动调用toString（）方法
        Person p = emp; // 自动类型转换，向上转型，子类引用赋值给父类引用
        System.out.println(p);
        p.sayHello();
        emp = (Employee) p;
        emp.sayHello();

    }
}

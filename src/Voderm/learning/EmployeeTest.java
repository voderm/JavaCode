package Voderm.learning;

import Voderm.Myclass.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("voderm",22,20000);
        System.out.println("name = " + emp.name);
        System.out.println("age = " + emp.age);
        emp.sayHello();
        System.out.println(emp.computesalary(10,50.0));

    }
}

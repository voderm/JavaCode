package Voderm.learning;


import Voderm.Myinterface.CC;

/**
 * @author: voderm Lee
 * @date: 2022/8/28 11:28
 */
public class DD implements CC {
    @Override
    public void display() {
        System.out.println("This is a display method of A");
    }

    @Override
    public void show() {
        System.out.println("This is a show method of B");
    }

    public static void main(String[] args) {
        DD dd = new DD();
        System.out.println(DD.STATUS);
        dd.show();
        dd.print();
        dd.display();
    }
}

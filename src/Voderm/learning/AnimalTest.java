package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/8/27 15:54
 */

class Animal{
    public void eat(){
        System.out.println("I like eat anything.");

    }
}
public class AnimalTest {
    public static void main(String[] args) {
       Animal dog = new Animal(){
           @Override
           public void eat(){
               System.out.println("I eat shit");

           }
       } ;
       dog.eat();

    }
}

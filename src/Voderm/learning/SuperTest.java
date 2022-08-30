package Voderm.learning;

/**
 * author voderm
 * Date 08 26
 */
//在子类中，可以引用super关键字，用于三种情况
//1. 在子类中调用父类中被覆盖掉的方法
//2. 在子类中调用父类的构造方法
//3. 在子类中访问父类中被隐藏的成员变量。
class Super{ // 一个源文件中，只能有一个public类。
    int x,y;
    public Super(){
        System.out.println("创建父类对象");
        setXY(5,5);
    }

    public void setXY(int i, int i1) {
        this.x = i;
        this.y = i1;
    }
    public void display(){
        System.out.println("x = " + x +",y = "+ y);
    }
}

class Sub extends Super{
    int x,z; //x 隐藏了父类super中的成员变量x
    public Sub(){
        this(10,10); // 在构造方法中调用this语句，通过this 可以调用其他的构造方法
        System.out.println("创建子类对象");
    }

    public Sub(int i, int i1) {
        super(); // 调用父类的构造方法
        this.x = i;
        this.z = i1;
    }
    public void display(){
        super.display(); //调用被覆盖的父类方法 display
        System.out.println("x = "+x+",y = "+y);
        System.out.println("super.x = " + super.x+",super.y = "+ super.y);
    }
}
public class SuperTest {
    public static void main(String[] args) {
        Sub b = new Sub();
        b.display();
    }
}

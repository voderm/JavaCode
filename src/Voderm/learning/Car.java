package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/8/27 10:25
 */
public class Car implements Cloneable{
    // 成员变量
    private int id;
    private String brand;
    private String color;

    // 构造函数
    public Car(int id,String brand,String color)
    {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    // 覆盖父类方法
    @Override
    public String toString(){
        return "汽车：id = " +id + "brand = "+brand+"color = " + color;
    }
    @Override
    public boolean equals(Object obj){ //注意参数是object类，后续再强之类型转换成子类
        return this.id == ((Car)obj).id;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("The object is destroyed.");
    }
//    public static void main(String[] args)
//        throws CloneNotSupportedException{
//        Car c1 = new Car(101,"BMW","black");
//        Car c2 = (Car) c1.clone();
//        System.out.println(c1 == c2);
//        System.out.println(c1.equals(c2));
//        System.out.println(c1.hashCode());
//        System.out.println(c2.hashCode()); // c2 和 c1的hashcode不同，因为未对hashCode方法作覆盖，使得其与equals方法兼容
//        System.out.println(c1);
//
//    }
    public static void main(String[] args) {
        Car c1 = new Car(101,"BMW","black");
        Car c2 = new Car(102,"benci","white");
        c1 = null;
        c2 = null;
        System.gc();
    }
}

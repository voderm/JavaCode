package Voderm.learning;

//StringBuilder provides adaptable class of string
public class StringBuilderDemo {
    public static void main(String[] args) {
        //constructor method provides extra 16 char space as buffer
        StringBuilder ss = new StringBuilder("Hello");  //5 + 16
        System.out.println(ss.length()); // 5
        System.out.println(ss.capacity()); // 21
        ss.append("java");
        System.out.println(ss);
        System.out.println(ss.insert(5,","));
        System.out.println(ss.replace(6,10,"World!"));// whatever new string length, replace 6 to 10
        System.out.println(ss.reverse());

        //Java 对 + 运算符进行了重载，可以连接String类和基本数据类型
        int age = 18;
        String s = "He is "+ age + " yeaes old.";
        System.out.println(s);

    }
}

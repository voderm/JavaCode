package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/8/27 15:41
 */
//局部内部类，定义在语句块或者是方法中
public class OuterClass2 {
    // 成员变量
    private String x = "hello";
    public void makeInner(int param){
        final String y = "local variable";
        class InnerClass{
            public void seeOuter(){
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("param = " + param);

            }
        }
        new InnerClass().seeOuter();
    }

    public static void main(String[] args) {
        OuterClass2 oc = new OuterClass2();
        oc.makeInner(47);
    }
}

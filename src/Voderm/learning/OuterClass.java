package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/8/27 15:37
 */
// 成员内部类，类的地位等同于成员变量，其特性也与成员变量类似
public class OuterClass {
    private int x = 200;
    public class InnerClass{
        int y = 300;
        public int caculate(){
            return x+y;
        }
    }
    public void makeInner(){
        InnerClass ic = new InnerClass();
        System.out.println(ic.caculate());

    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(inner.caculate());
    }
}

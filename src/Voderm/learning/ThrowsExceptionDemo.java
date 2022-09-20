package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/9/20 15:00
 */
public class ThrowsExceptionDemo {
    static void method(int value) throws ArithmeticException,
            ArrayIndexOutOfBoundsException{
        if (value == 0){
            System.out.println("no exception happens");
            return;
        }
        else if (value == 1)
        {
            int[] iArray = new int[4];
            iArray[4] = 3;
        }
    }

    //如果一个方法里抛出了异常，则调用该方法的方法必须处理异常，
    //比如当前，method方法抛出了异常，调用method方法的main方法 必须去处理异常
    public static void main(String[] args) {
        try {
            method(0);
            method(1);
            method(2);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("捕获到：" +  e.toString());
        }finally {
            System.out.println("执行finally块");
        }
    }
}

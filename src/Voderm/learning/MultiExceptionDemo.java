package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/9/16 17:10
 */
public class MultiExceptionDemo {
    public static void method(int value){
        try{
            if (value == 0){
                System.out.println("no exception happen");
            }
            else if (value == 1){
                int i = 0;
                System.out.println(4/i);
            }
            else if (value == 2 ){
                int[] array = new int[4];
                array[4] = 1;
            }
        }catch (ArithmeticException e){
            System.out.println("捕获到：" + e.toString());
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("捕获到：" + e.toString());
        }catch (Exception e){ //没弄懂exception类的性质。
            System.out.println("Will not be excecuted");
        }finally {
            System.out.println("执行最终模块:" + value);
        }
    }
    public static void main(String[] args) {
        method(0);
        method(1);
        method(2);

    }
}

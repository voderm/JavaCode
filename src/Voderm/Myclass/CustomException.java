package Voderm.Myclass;

/**
 * @author: voderm Lee
 * @date: 2022/9/20 15:47
 */

// 编写自定义异常类 实际上就是继承一个API标准异常类、用新定义的异常处理信息
    //覆盖原有信息
public class CustomException extends Exception{
    public CustomException(){}
    public CustomException(String message){
        super(message); //调用父类构造方法，向上传递给父类
    }
}

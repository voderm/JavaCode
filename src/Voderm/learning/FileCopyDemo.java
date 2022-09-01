package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/9/1 14:06
 */
import java.io.*;
public class FileCopyDemo {
    public static void main(String[] args) {
        File inputFile = new File("inpput.txt"); // 并没有创建文件，只是构造了一个File类的对象
        File outputFile =  new File("output.txt");
        try(
                FileReader in = new FileReader(inputFile); //会有IOException。所以需要捕获或抛出异常
                FileWriter out = new FileWriter(outputFile);
                )
        {
          int c = in.read();
          while (c!= -1){
              out.write(c);
              c = in.read();
        }
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}

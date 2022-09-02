package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/9/1 14:43
 */
import java.io.*;
public class PrintWriterDemo { //PrintWriter类，实现字符打印输出流，也是输出流的一种。
    public static void main(String[] args) throws IOException{
        String fileName = "nuber.txt";
        FileWriter out = new FileWriter(new File(fileName));
        PrintWriter pw = new PrintWriter(out,true);//autoFlush是在输出之前自动刷新输出流
        //向文件中随机写入10个数
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random()*101)+100;
            pw.println(num);
        }
        // 从文件中读取10个数
        FileReader in = new FileReader(new File(fileName));
        BufferedReader reader = new BufferedReader(in);
        String aLine = reader.readLine();
        while(aLine != null){
            System.out.println(aLine);
            aLine = reader.readLine();
        }
        pw.close();
        reader.close();

    }
}

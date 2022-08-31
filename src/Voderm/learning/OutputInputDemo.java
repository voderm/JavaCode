package Voderm.learning;

import java.io.*;

/**
 * @author: voderm Lee
 * @date: 2022/8/31 11:33
 */
public class OutputInputDemo {
    public static void main(String[] args) throws IOException {
        //创建输出流对象，向文件中写入数据，分清主体、客体之间的逻辑关系，我需要往一个文件中写入数据，那就再IDEA里创建一个输出流去输出自己要写的数据
        File outputFile = new File("D:\\JavaCode\\output.dat"); //创建了一个文件对象实例，但并不存在文件
        try(
                FileOutputStream out = new FileOutputStream(outputFile);//用File对象构造输出流对象，输出到这个文件中
                )
        {
            for (int i = 0; i < 10; i++) {
                int x = (int)(Math.random()*90) + 10; //生成10-100的数
                out.write(x);// 只把整数的低八位写入输出流
            }
            out.flush();
        }catch (IOException e) {
        System.out.println(e.toString());
        }
        // 从文件中读取数据，那就是把文件数据输入到集成开发环境中
        File inputFile = new File("output.dat"); //创建文件对象，此时 inputFile.exists()方法的返回值为true，因为存在"output.dat"文件
        try(
                FileInputStream in = new FileInputStream(inputFile); //用file对象 创建文件输入流对象
                )
        {
            int c = in.read(); // 一次读取一字节
            while(c!= -1){ //读取到输入流末尾时 返回-1
                System.out.println(c + " ");
                c = in.read();
            }

        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}

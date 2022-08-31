package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/8/31 16:15
 */
import java.io.*;
public class DataStreamDemo {
    public static void main(String[] args) {
        // 向文件中写入数据
        try(
    FileOutputStream output = new FileOutputStream("data.dat"); //创建文件输出流对象，若文件不存在，就创建data.dat文件
    DataOutputStream dataOutStream = new DataOutputStream(new BufferedOutputStream(output));//创建数据输出流对象，先构建buffered
        )
    {
        dataOutStream.writeDouble(123.456);
        dataOutStream.writeInt(100);
        dataOutStream.writeUTF("JAVA LANUGAE");
    }catch(IOException e )
    {
        e.printStackTrace();
    }
        System.out.println("数据已经写到文件中");
        // 从文件中读取数据
        try(
                FileInputStream input = new FileInputStream("data.dat");
                DataInputStream dataInStream = new DataInputStream(new BufferedInputStream(input));
                ){
            while(dataInStream.available()>0){
                double d = dataInStream.readDouble();
                int i = dataInStream.readInt();
                String s =dataInStream.readUTF();
                System.out.println("d = "+ d);
                System.out.println("i = "+ i);
                System.out.println("s = "+ s);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
}

}

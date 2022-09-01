package Voderm.learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: voderm Lee
 * @date: 2022/9/1 14:23
 */
public class WordsCount {
    public static void main(String[] args) throws IOException {
        // 构造FileReader对象时，参数可以是 字符串表示的文件名 或者 File对象
        String fileName = "article.txt";
        FileReader inFile = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(inFile);

        int sum = 0;
        String aLine = reader.readLine(); //从输入流中读取一行文本
        while(aLine != null){ //直到aLine末尾
            String []words = aLine.split("[ ,.]");
            sum = sum + words.length;
            aLine = reader.readLine();
        }
        reader.close();
        System.out.println("sum = " + sum);
    }
}

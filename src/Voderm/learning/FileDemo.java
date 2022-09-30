package Voderm.learning;

import java.io.IOException;
import java.nio.file.*;

/**
 * @author: voderm Lee
 * @date: 2022/9/21 15:12
 */
public class FileDemo {
    public static void main(String[] args) {
        // 声明一个路径对象、文件对象
        Path path = Paths.get("D:\\JavaCode\\demo");
        Path file = Paths.get("D:\\JavaCode\\demo\\report.txt");
        try{
            if (!Files.exists(path))
                path = Files.createDirectories(path);
            if (!Files.exists(file))
                file = Files.createFile(file);

        }catch (FileAlreadyExistsException fe){
            fe.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }
        System.out.println(Files.exists(file));
        System.out.println(Files.isReadable(file));

        try{
            Files.delete(path);
        }catch (NoSuchFileException x){
            System.out.println("No such file "+ path);
        }catch (DirectoryNotEmptyException x){
            System.err.format("The directory is not empty");
        }catch (IOException x){
            System.err.println(x);
        }

    }
}

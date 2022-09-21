package Voderm.learning;

import java.io.*;

/**
 * @author: voderm Lee
 * @date: 2022/9/21 11:16
 */
public class ArraySerialDemo {
    public static void main(String[] args) {
        try {
            int[] intarray = {3, 4, 6, 7};
            String[] stringarray = {"voderm", "lily", "sum"};
            // Serial
            try (OutputStream output = new FileOutputStream("arrayserial.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(output);
            ) {
                oos.writeObject(intarray);// write array object to file.
                oos.writeObject(stringarray);
            } catch (IOException e) {
                e.printStackTrace();
            }
            // DeSerial
            try (InputStream input = new FileInputStream("arrayserial.dat");
                 ObjectInputStream ois = new ObjectInputStream(input);
            ) {
                int[] readintarray = (int[]) ois.readObject();   //readObject 返回的是
                String[] readstringarray = (String[]) ois.readObject();
                for (int n: readintarray){
                    System.out.println(n);
                }
                for (String m:readstringarray){
                    System.out.println(m);
                }
            }
        }catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
    }
}

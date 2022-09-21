package Voderm.learning;

import Voderm.Myclass.Customer;

import java.io.*;
import java.time.LocalDate;

/**
 * @author: voderm Lee
 * @date: 2022/9/21 10:51
 */
public class ObjectSerializeDemo {
    public static void main(String[] args) {
        Customer customer = new Customer(101,"voderm","BeiJing Haidian");
        LocalDate today = LocalDate.now();
        // Serializable
        try(
                OutputStream output = new FileOutputStream("D:\\JavaCode\\customer.dat");
                ObjectOutputStream oos = new ObjectOutputStream(output);
                )
        {oos.writeObject(customer);
            oos.writeObject(today);
        }catch (IOException e){
            e.printStackTrace();
        }
        // DeSerializable
        try (InputStream input =
                new FileInputStream("D:\\JavaCode\\customer.dat");
        ObjectInputStream ois = new ObjectInputStream(input);)
        {
            while (true){
                try {
                    customer = (Customer) ois.readObject();
                    System.out.println("客户名:"+customer.id);
                    System.out.println("name:" + customer.name);
                    System.out.println("address:"+customer.address);
                    today = (LocalDate) ois.readObject();
                    System.out.println("date:"+today);
                }catch (EOFException e){break;}
            }
        }catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
    }
}

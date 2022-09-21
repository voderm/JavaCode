package Voderm.Myclass;

import Voderm.Myclass.CustomException;

import java.io.Serializable;

/**
 * @author: voderm Lee
 * @date: 2022/9/21 10:48
 */
public class Customer implements Serializable {
    public int id;
    public String name;
    public String address;
    public Customer(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

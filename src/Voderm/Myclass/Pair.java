package Voderm.Myclass;

import Voderm.Myinterface.Entry;
import org.w3c.dom.Entity;

/**
 * @author: voderm Lee
 * @date: 2022/8/29 15:10
 */
public class Pair <K,V> implements Entry<K,V> {
    //泛型类实现Entry泛型接口。
    public K key;
    public V value;
    // 构造方法
    public Pair(K key,V value){
        this.key = key;
        this.value = value;
    }
    // 实现抽象函数;
    @Override
    public K getKey(){
        return key;
    }

    @Override
    public V getValue(){
        return value;
    }

    // 成员方法
    public void setKey(K key){
        this.key = key;
    }
    public void setValue(V value)
    {
        this.value = value;
    }
}

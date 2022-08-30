package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/8/29 14:29
 */
//Node类是一个泛型类，在Node类声明中使用尖括号引进了一个名为T的类型变量，
    //该变量可在类的内部任何位置使用，它可以是任何类或者接口，但不能是 基本数据类型
public class Node <T>{
    private T value;
    public Node(){}
    public Node(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
    public void set(T value)
    {
        this.value = value;
    }
    public void showType(){
        System.out.println("T 的类型是: "+ value.getClass());
    }

    public static void main(String[] args) {
        Node<Integer> intNode = new Node<Integer>();
        intNode.set(new Integer(999));
        System.out.println(intNode.get());
        intNode.showType();
    }
}

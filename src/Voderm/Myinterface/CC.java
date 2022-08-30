package Voderm.Myinterface;

interface AA{
    int STATUS = 100;
    public abstract void display();
}
interface BB{
    public abstract void show();
    public default void print(){
        System.out.println("This is a default method of B");
    }
}
public interface CC extends AA,BB{
    int NUM =3;
}

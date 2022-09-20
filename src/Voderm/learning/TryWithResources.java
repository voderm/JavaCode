package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/9/20 15:29
 */
class Door implements AutoCloseable{
    public Door(){
        System.out.println("The door is created.");
    }
    public void open() throws Exception{
        System.out.println("The door is opened.");
        throw new Exception();
    }
    @Override
    public void close(){
        System.out.println("The door is closed.");
    }
}

class Window implements AutoCloseable{
    public Window(){
        System.out.println("The window is created.");
    }
    public void open() throws Exception{
        System.out.println("The window is opened");
        throw new Exception();
    }
    @Override
    public void close(){
        System.out.println("The window is closed");
    }
}

public class TryWithResources {
    public static void main(String[] args) throws Exception{
        try(Door door = new Door();
        Window window = new Window()){
            door.open();  //出现异常后 会转到异常处理代码，再那之前会关闭对象的资源，因此 window.open未执行，
            window.open();//该语句未执行，已经转到了异常处理代码
        }catch (Exception e){
            System.out.println("There is an exception.");
        }finally {
            System.out.println("The door and window are closed");
        }
    }
}

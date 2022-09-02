package Voderm.Myclass;

/**
 * @author: voderm Lee
 * @date: 2022/9/2 15:22
 */
public class Point2D {
    // 表示二维空间
    public int x;
    public int y;
    public Point2D(int x,int y ){
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public void offset(int a,int b){
        x = x + a;
        y = y + b;
    }
}

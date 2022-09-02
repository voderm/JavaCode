package Voderm.learning;

import Voderm.Myclass.Point2D;

/**
 * @author: voderm Lee
 * @date: 2022/9/2 15:28
 */
public class Point3D extends Point2D {
    // 成员变量
    public int z;
    public Point3D(int x, int y,int z) {
        x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D(Point2D p,int z){
        x = p.x;
        y = p.y;
        this.z = z;
    }
    public void offset(int a, int b, int c){
        x= x-a ;
        y = y-b;
        z = z-c;
    }

    public static void main(String[] args) {
        Point2D p2d1 = new Point2D(3,3);
        Point2D p2d2 = new Point2D(4,4);

        p2d1.offset(p2d2.x,p2d2.y);
        System.out.println("p2d1 x :"+p2d1.x+"p2d2.y = "+p2d1.y);

        Point3D p3d1 = new Point3D(p2d1,3);
        Point3D p3d2 = new Point3D(p2d2,4);

        p3d1.offset(p3d2.x,p3d2.y,p3d2.z);
        System.out.println("p3d1 x:" + p3d1.x + " p3d2 y" + p3d1.y +" p3d1.z " + p3d1.z);
    }
}

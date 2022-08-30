package Voderm.learning;

import Voderm.Myclass.Direction;

/**
 * @author: voderm Lee
 * @date: 2022/8/27 16:14
 */
public class EnumDemo {
    public static void main(String[] args) {
        Direction left = Direction.WEST;
        System.out.println(left);
        for (Direction d:Direction.values())
        {
            System.out.println(d.name() + ",序号"+d.ordinal());
        }
    }
}

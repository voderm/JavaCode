package Voderm.Myclass;

import Voderm.Myinterface.Eatable;

/**
 * @author: voderm Lee
 * @date: 2022/8/28 11:22
 */
public class Orange implements Eatable {
    @Override
    public String howToEat(){
        return "Make orange juice.";
    }
}

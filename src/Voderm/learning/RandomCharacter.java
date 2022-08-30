package Voderm.learning;

/**
 * @author: voderm Lee
 * @date: 2022/8/27 14:56
 */
public class RandomCharacter {
    public static char getLetter(){
        return (char)(97 + Math.random() * 26);
    }

    public static void main(String[] args) {
        for (int i = 1;i < 100;i++){
            System.out.print(getLetter()+" ");
            if (i % 20 == 0)
                System.out.println();
        }
    }
}

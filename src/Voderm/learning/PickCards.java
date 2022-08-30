package Voderm.learning;

public class PickCards {
    public static void main(String[] args) {
        // randomly pick a card (52 possiblities)
        // 4 colors , 13 categeries
        // need 2 para to convey a card
        String color="";
        String num="";
        int card_num = (int)(Math.random()*52);
        switch (card_num/13){
            case 0: color = "black peach"; break;
            case 1: color = "red peach"; break;
            case 2: color = "square block"; break;
            case 3: color = "wintersweet"; break;
        }
        switch (card_num%13){
            case 0: num = "A"; break;
            case 10:num = "J"; break;
            case 11:num = "Q"; break;
            case 12:num = "K"; break;
            default:num = "" +( card_num%13+1);
        }
        System.out.println("The chose card is: "+color + " " +num);

    }
}

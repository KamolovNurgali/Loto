package kamolov.nk;

import java.util.ArrayList;

public class Ticket {
    public static ArrayList <Integer> ticket = new ArrayList<>();
    public static ArrayList <Integer> ticket(){

        for (int i = 0; i < 6; i ++){
            ticket.add(RandomNumber.numberRandom());
        }

        for(int key : ticket){
            System.out.print(key + " ");
        }

        return ticket;
    }


}

package kamolov.nk;

import java.util.Scanner;

public class Main {
    private static Scanner scan;
    public static void main(String [] args){
        scan = new Scanner(System.in);
        System.out.println("Lottoreya");
        Ticket.ticket();
        System.out.println();
        for(int i = 0; i < 6; i ++){
            if(i == 5){
                System.out.println("Это у вас последняя попытка!");
                ErrorMessage.message();
                String game = scan.nextLine();
                if(game.equalsIgnoreCase("GO")){
                    Baraban.barabanArray(Ticket.ticket);
                    System.out.println("Игра окончена!");
                    Switch.switchFinish(Baraban.count);
                }else{
                    ErrorMessage.errorMessage();
                    i --;
                }
                System.out.println("----------------------------------------------------------------------");
            }else{
                System.out.println("Это у вас "+ (i + 1) +" попытка!");
                ErrorMessage.message();
                String game = scan.nextLine();
                if(game.equalsIgnoreCase("GO")){
                    Baraban.barabanArray(Ticket.ticket);
                }else{
                    ErrorMessage.errorMessage();
                    i --;
                }
                System.out.println("----------------------------------------------------------------------");
            }
        }
    }
}

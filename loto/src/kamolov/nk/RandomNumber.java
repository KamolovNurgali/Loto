package kamolov.nk;

import java.util.Random;

public class RandomNumber {
    private static Random rand;
    public static int [] numberRandomArray = new int[6];
    private static int i = 0;
    public static int numberRandom(){
        rand = new Random();
        int number = rand.nextInt(6) + 1;
        for(int key : numberRandomArray){
            if(number == key){
                return numberRandom();
            }else if(key == 0){
                numberRandomArray[i] = number;
                i ++;
                return number;
            }
        }

        return number;
    }
}

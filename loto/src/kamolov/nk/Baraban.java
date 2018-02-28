package kamolov.nk;

import java.util.ArrayList;
import java.util.Random;


public class Baraban {
    private static int j = 0;
    public static int count = 0;
    public static int [] barabanRandomArray = new int[6];
    private static Random rand;
    private static int barabanRandom(){
        rand = new Random();
        int number = rand.nextInt(6) + 1;
        for(int key : barabanRandomArray){
            if(number == key){
                return barabanRandom();
            }else if(key == 0){
                barabanRandomArray[j] = number;
                j ++;
                return number;
            }
        }

        return number;
    }


    public static ArrayList <Integer> barabanArray(ArrayList <Integer> ticket){
        ArrayList <Integer> barabanArray = new ArrayList<>();
        int getNumber = barabanRandom();
        boolean status = false;
        System.out.println(getNumber);
        for(int key : ticket){
            if(key == getNumber){
                barabanArray.add(getNumber);
                status = true;
            }
        }
        if(status == true){
            System.out.println("Есть совпадение.");
            count ++;
        } else {
            System.out.println("Совпадения нет.");
        }

        return barabanArray;
    }
}

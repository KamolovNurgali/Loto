package kamolov.nk;

public  class Switch {
    public static int switchFinish(int count){
        switch (count){
            case 1:
                System.out.println("У вас только одна совпадения и вы виыграли 5 000 тг.");
                break;
            case 2:
                System.out.println("У вас два совпадения и вы виыграли 15 000 тг.");
                break;
            case  3:
                System.out.println("У вас три совпадение и вы виыграли 45 000 тг.");
                break;
            case 4:
                System.out.println("У вас четыри совпадение и вы виыграли 150 000 тг.");
                break;
            case 5:
                System.out.println("У вас пять совпадение и вы виыграли 500 000 тг.");
                break;
            case 6:
                System.out.println("УРААААААААААА вы выиграли ДЖЕКПОТ!!! 2 000 000 тг.");
                break;
                default:
                    System.out.println("У вас совпадение не было!!!");

        }
        return count;
    }
}

import java.util.*;

class Q101{
    static Scanner sc = new Scanner(System.in);

    //Number Guessing Game
    static void number_guessing_game(){
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int takes = 0;
        int guess;

        System.out.println("Guess The Number Between 1 and 100");

        do{
            guess = sc.nextInt();

            if(guess != number){
                if(guess < number) System.out.println("Try Higher Number");
                else System.out.println("Try Lower Number");
            }

            takes++;

        }while(guess != number);

        System.out.println("Successfully Guessed In " + takes + " Attempts!");
    }

    public static void main(String[] args){
        //Calling The Function
        number_guessing_game();
        sc.close();
    }
}

import java.util.*;
class Q34{
    //Generating The Pattern
    static void print_pattern(int n){
        for(int i = n;i > 0;i--){
            for(int j = 1;j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Validating Input
        if(n <= 0){
            System.out.println("Invalid Input");
        }
        //Printing The Result By Calling The Function
        else{
            print_pattern(n);
        }
        sc.close();
    }
}
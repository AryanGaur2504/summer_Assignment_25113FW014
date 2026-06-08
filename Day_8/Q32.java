import java.util.*;
class Q32{
    //Generating The Pattern
    static void print_pattern(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(i);
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
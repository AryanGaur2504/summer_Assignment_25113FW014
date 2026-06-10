import java.util.*;
class Q39{
    //Generating The Pattern
    static void print_pattern(int n){
        for(int i = 1;i <= n;i++){
            //For Gaps
            for(int j = 0;j < (n-i);j++){
                System.out.print(" ");
            }
            //Forward Pattern
            for(int k = 1;k <= i;k++){
                System.out.print(k);
            }
            //Rev Pattern
            for(int l = i-1;l >= 1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Validating Input
        if(n <= 0){
            System.out.print("Invalid Input");
        }
        //Printing The Result By Calling The Function
        else{
            print_pattern(n);
        }
        sc.close();
    }
}
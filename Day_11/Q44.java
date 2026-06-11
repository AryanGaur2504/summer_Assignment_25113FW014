import java.util.*;
class Q44 {
    //Calculating The Factorial 
    static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Input Validation
        if(n < 0) System.out.println("Invalid Input");
        // Printing The Result
        else System.out.println("The Factorial Of " + n + " Is " + factorial(n));
        sc.close();
    }
}

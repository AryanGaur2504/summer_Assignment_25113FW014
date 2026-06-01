import java.util.*;
class Q3 {
    //Calculating The Factorial 
    static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Printing The Result
        if(n < 0) System.out.println("Invalid Input"); // Checking For Valid Input
        else System.out.println("The Factorial Of " + n + " Is " + factorial(n));
        sc.close();
    }
}

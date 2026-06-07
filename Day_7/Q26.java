import java.util.*;
class Q26{
    //Calculating nth Fibonacci Number
    static int fib(int n){
        if(n == 0 || n == 1) return n;
        return (fib(n-1) + fib(n-2));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Validating Input
        if(n < 0) System.out.print("Invalid Input");
        //Printing Series From i --> [0,n]
        else{
            for(int i = 0;i <= n;i++){
                System.out.print(fib(i) + "\t");
            }
        }
        sc.close();
    }
}
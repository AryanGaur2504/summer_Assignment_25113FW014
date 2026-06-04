import java.util.*;
class Q14{
    //Generating nth Fibonacci Number
    static int fib(int n){
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0) {
            System.out.println("Inavlid Input");
        }
        //Printing The Result
        else{
        System.out.println(fib(n));
        }
        sc.close();
    }
}
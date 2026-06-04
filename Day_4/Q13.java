import java.util.*;
class Q13{
    //Generating nth Fibonacci Number
    static int fib(int n){
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < 0 || b < 0 || a > b){
            System.out.println("Invalid Input");
        }
        //Looping And Printing Fibonacci Number For All i ∈ [a,b]
        else{
                for (int i = a; i <= b; i++) {
                    System.out.print(fib(i) + "\t");   
                }
        }
        sc.close();
    }
}
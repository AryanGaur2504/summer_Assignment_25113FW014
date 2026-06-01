import java.util.*;
class Q1{
    //Calculating And Printing The Sum
    static int sum_N(int n){
        return (n*(n+1)/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0) System.out.println("Invalid Input"); //Checking Valid Input
        else System.out.println("The Sum Of First "+n+" Natural Numbers Is " + sum_N(n));
        sc.close();
    }
}
import java.util.*;
class Q1{
    //Calculating And Printing The Sum
    void sum_N(int n){
        System.out.println("The Sum Of First "+n+" Natural Numbers Is " + (n*(n+1)/2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Q1 obj = new Q1();
        obj.sum_N(n);
        sc.close();
    }
}
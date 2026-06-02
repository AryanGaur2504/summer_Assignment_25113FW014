import java.util.*;
class Q7{
    //Calculating Product Of Digits
    static int prod_digits(int n){
        if(n == 0) return 0;
        int pro = 1;
        while(n!=0){
            pro*=(n%10);
            n/=10;
        }
        return pro;
    }
    public static void main(String[] atgs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Printing Result
        System.out.println("The Product Of Digits Of "+n+" Is "+prod_digits(n));
        sc.close();
    }
}
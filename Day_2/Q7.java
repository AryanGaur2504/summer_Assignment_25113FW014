import java.util.*;
class Q7{
    //Calculating Product Of Digits
    int prod_digits(int n){
        int pro = 1;
        while(n>0){
            pro*=(n%10);
            n/=10;
        }
        return pro;
    }
    public static void main(String[] atgs){
        Scanner sc = new Scanner(System.in);
        Q7 obj = new Q7();
        int n = sc.nextInt();
        //Printing Result
        System.out.println("The Product Of Digits Of "+n+" Is "+obj.prod_digits(n));
        sc.close();
    }
}
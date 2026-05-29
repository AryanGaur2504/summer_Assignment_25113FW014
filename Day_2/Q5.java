import java.util.*;
class Q5{
    //Calculating Sum Of Digits
    int sum_digits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Q5 obj = new Q5();
        //Printing Result
        System.out.println("The Sum Of Digits Of "+n+" Is "+obj.sum_digits(n));
        sc.close();
    }
}
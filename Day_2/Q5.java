import java.util.*;
class Q5{
    //Calculating Sum Of Digits
    static int sum_digits(int n){
        int sum=0;
        if(n < 0) n = -n;//Handling Negative Numbers
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Printing Result
        System.out.println("The Sum Of Digits Of "+n+" Is "+sum_digits(n));
        sc.close();
    }
}
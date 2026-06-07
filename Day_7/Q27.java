import java.util.*;
class Q27{
    //Calculating Sum Of Digits Of A Number
    static int sum_of_digits(int n){
        if(n < 0) n = -n;
        if(n <= 9) return n;
        return((n%10) + sum_of_digits(n/10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Printing The Result
        System.out.print(sum_of_digits(n));
        sc.close();
    }
}
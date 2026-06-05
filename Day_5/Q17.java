import java.util.*;
class Q17{
    //Calculating The Sum Of Proper Divisor Of A Number
    static int factor_sum(int n){
        int sum = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i == 0 && i!=n){
                sum+=i;
                if(i != (n/i) && (n/i) != n) sum+=(n/i);
            }
        }
        return sum;
    }
    //Checking For Perfect Number --> Sum Of Proper Divisor Of No. = Number
    static boolean is_perfect(int n){
        return (n == factor_sum(n));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Input Validation
        if(n <= 0) System.out.print("Invalid Input");
        else{
            //Printing Result
            if(is_perfect(n)) System.out.print(n+ " Is A Perfect Number");
            else System.out.print(n+ " Is Not A Perfect Number");
        }
    }
}
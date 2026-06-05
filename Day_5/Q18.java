import java.util.*;
class Q18{
    //Calculating Factorial Of Each Digit
    static int fact(int n){
    if(n <= 1) return 1; //-ve Values Are Handeled Through Main
    int fact = 1;
    for(int i=1;i<=n;i++){
        fact *= i;
    }
    return fact;
    }
    //Summation Of Factorials Of Digits
    static int fact_sum(int n){
        int sum = 0;
        while(n > 0){
            sum+=fact(n%10);
            n/=10;
        }
        return sum;
    }
    //Checking For Strong Number --> Sum Of Factorial Of Each Digit = Number
    static boolean is_strong(int n){
        if(n == 0) return false;
        return (n == fact_sum(n));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Validating Input
        if(n < 0) System.out.print("Invalid Input");
        else{
            //Printing Result
            if(is_strong(n)) System.out.print(n+" Is A Strong Number");
            else System.out.print(n+" Is Not A Strong Number");
        }
    }
}
import java.util.*;
class Q43{
    //Checking For Prime (Factors == 2)
    static boolean is_prime(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count ++;
                if((n/i)!= i) count ++;
            }
        }
        if(count == 2) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Input Validation
        if(n < 0) System.out.println("Invalid Input");
        //Printing The Result
        else {
            if(is_prime(n)) System.out.print(n + " Is A Prime Number");
            else System.out.print(n + " Is Not A Prime Number");
        }
        sc.close();
    }
}
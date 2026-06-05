import java.util.*;
class Q20{
    //Checking For Prime
    static boolean is_prime(int n){
        int count = 0;
        for(int i = 1;i*i <= n;i++){
            if(n%i == 0){
                count++;
                if(i != (n/i)) count++;
            }    
        }
        return (count == 2); 
}
    //Finding The Largest Prime Factor
    static int largest_prime_factor(int n){
        int max = 0;
        for(int i = 1;i*i <= n;i++){
            if(n % i == 0 ){
                if(i > max && is_prime(i)) max = i;
                if(i != (n/i)){
                    if((n/i) > max && is_prime(n/i)) max = n/i;
                }
            }
        }
        return max;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Validating Input
        if(n <= 0) System.out.print("Invalid Input");
        //Printing Result
        else System.out.print("The Largest Prime Factor Of " +n+ " Is "+largest_prime_factor(n));
    }
}
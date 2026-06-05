import java.util.*;
class Q19{
    //Printing The Factors Of The Number
    static void print_factors(int n){
    for(int i = 1;i*i <= n;i++){
        if(n % i == 0) {
            System.out.print(i + "\t");
            if(i != (n/i)) System.out.print((n/i) + "\t");
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Validating Input
        if(n <= 0) System.out.print("Invalid Input");
        else print_factors(n);
    }
}
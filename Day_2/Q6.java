import java.util.*;
class Q6{
    //Calculating Reverse
    static int reverse(int n){
        int rev = 0;
        while(n!=0){
            rev = (rev*10) + (n%10);
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Printing Result
        System.out.println("The Reverse Of "+n+" Is "+reverse(n));
        sc.close();
    }
}
import java.util.*;
class Q45{
    //Calculating Reverse
    static int reverse(int n){
        int rev = 0;
        while(n!=0){
            rev = (rev*10) + (n%10);
            n/=10;
        }
        return rev;
    }
    //Checking For Palindrome
    static boolean is_palindrome(int n){
        if(n == reverse(n)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Printing Result
        if(is_palindrome(n)) System.out.println(n + " Is A Palindrome Number");
        else System.out.println(n + " Is Not A Palindrome Number");
        sc.close();
    }
}
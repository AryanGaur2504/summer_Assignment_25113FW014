import java.util.*;
class Q12{
    // Using gcd(a,b) * lcm(a,b) = a*b
    static int lcm(int a,int b){
        int lcm = a*b;
        while(a!=0 && b!=0){
            if(a>b) a = a % b;
            else b = b % a;
        }
        if(a == 0) lcm/=b;
        else lcm/=a;
        return lcm;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Printing The Result
        System.out.println("The LCM Of "+a+" And "+b+" Is "+lcm(a, b));
        sc.close();
    }
}
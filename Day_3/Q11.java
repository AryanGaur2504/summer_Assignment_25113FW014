import java.util.Scanner;

class Q11{
    //Using Euclidean Algorithm :- gcd(a,b) = gcd(a-b,b) [a>b]
    static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b) a = a % b;
            else b = b % a;
        }
        if(a == 0) return b;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Printing Result
        System.out.println("The Gcd Of "+a+" And "+b+" Is "+gcd(a,b));
        sc.close();
    }
}
import java.util.*;
class Q15 {
    // Calculating Digits
    static int digits(int n) {
        if(n == 0) return 1;
        int digits = 0;
        while (n != 0) {
            n /= 10;
            digits++;
        }
        return digits;
    }

    // Checking For Amrs (If Sum Of Each Digit Raised To The Power No. Of Digits = Origional Number)
    static boolean is_armstrong(int n) {
        int arms = 0;
        int x = n;
        int d = digits(n);
        while (x != 0) {
            arms += Math.pow((x % 10), d);
            x /= 10;
        }
        if (arms == n) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Invalid Input");
        }
        //Printing The Result
        else{
            if (is_armstrong(n)) System.out.print(n + " Is An Armstrong Number");
            else System.out.print(n+ " Is Not An Armstrong Number");
        }
    sc.close();
    }
}
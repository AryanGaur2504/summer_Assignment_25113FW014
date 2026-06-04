import java.util.*;

class Q16 {
    // Calculating Digits
    static int digits(int n) {
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
        int lb = sc.nextInt();
        int ub = sc.nextInt();
        if(lb < 0 || ub < 0 || lb > ub){
            System.out.println("Invalid Input");
        }
        else{
            //Printing The Result In Range [lb,ub]
            for(int i = lb;i <= ub;i++){
                if(is_armstrong(i)) System.out.print(i + "\t");
            }
        }
        sc.close();
    }
}
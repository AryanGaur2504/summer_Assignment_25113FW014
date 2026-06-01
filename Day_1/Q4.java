import java.util.*;
class Q4 {
    //Counting Digits
    static int digits(int n){
        if(n == 0) return 1;
        if(n < 0) n = -n;//To Handle Negative Numbers
        int digits = 0;
        while(n > 0){
            digits++;
            n/=10;
        }
        return digits;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     //Printing The Result
     System.out.println(n+" Contains "+digits(n)+" Digits");
     sc.close();   
    }
}
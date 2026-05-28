import java.util.*;
class Q4 {
    //Printing Digits Of A Number
    void digits(int n){
        int x = n;
        int digits = 0;
        while(x!=0){
            digits++;
            x/=10;
        }
        System.out.println(n+" Contains "+digits+" Digits");
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     Q4 obj = new Q4();
     obj.digits(n);
     sc.close();   
    }
}
import java.util.*;
class Q28{
    static int rev = 0; //Global Variable To Store Reverse
    //Calculating Reverse Of A Number
    static int rev_num(int n){
        if(n >= -9 && n <= 9) return (rev*10 + n);
        rev = (rev*10)+n%10;
        return rev_num(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Printing The Result
        System.out.print(rev_num(n));
        sc.close();
    }
}
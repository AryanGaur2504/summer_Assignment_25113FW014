import java.util.*;
class Q23{
    //Calculating No. Of Set Bits 
    static int set_bits(int n){
        if(n == 0) return 0;
        int sbits = 0;
        while(n != 0){
            if(n%2 == 1) sbits++;
            n/= 2;
        }
        return sbits;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Validating Input
        if(n < 0){
            System.out.print("Invalid Input");
        }
        //Printing Result
        else{
            System.out.print(set_bits(n));
        }
        sc.close();
    }     
}

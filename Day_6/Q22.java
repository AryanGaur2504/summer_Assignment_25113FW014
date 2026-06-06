import java.util.*;
class Q22{
        //Checking IF Number Is Binary Or Not
    static boolean is_binary(int n){
        if(n == 0) return true;
        int count = 0,digits = 0;
        while(n!=0){
            if(n%10 == 0 || n%10 == 1) count++;
            digits++;
            n/=10;
        }
        return (count == digits);
}
    //Converting Binary To Decimal
    static int bin_to_dec(int n){
        if(n == 0) return 0;
        int dec = 0,count = 0;
        while(n!=0){
            dec+= (n%10)*Math.pow(2,count);
            count++;
            n/=10;
        }
        return dec;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Input Validation And Printing Result
        if(is_binary(n)){
        System.out.print(bin_to_dec(n));
        }
        else{
            System.out.print("Invalid Input");
        }
        sc.close();
    }     
}

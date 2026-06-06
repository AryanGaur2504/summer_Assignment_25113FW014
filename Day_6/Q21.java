import java.util.*;
class Q21{
    //Converting Decimal To Binary
    static String dec_to_bin(int n){
        if(n == 0) return "0";
        String s = "";
        String rev = "";
        while(n!=0){
            s+= n%2;
            n/=2;
        }
        for(int i = s.length()-1;i >= 0;i--){
            rev+= s.charAt(i);
        }
        return rev;
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
            System.out.print(dec_to_bin(n));
        }
        sc.close();
    }     
}

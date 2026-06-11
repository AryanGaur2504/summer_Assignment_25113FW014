import java.util.*;
class Q42{
    //Calculating Maximum Of Two Numbers
        static int maximum(int a,int b){
        int max = (a > b) ? a : b;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Printing The Result
        System.out.print(maximum(a,b));
        sc.close();
    }
}

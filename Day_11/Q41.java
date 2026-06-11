import java.util.*;
class Q41{
    //Calculating Sum Of Two Numbers
        static int sum(int a,int b){
        return (a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Printing The Result
        System.out.print(sum(a,b));
        sc.close();
    }
}

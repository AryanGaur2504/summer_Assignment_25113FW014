import java.util.*;
class Q3 {
    //Calculating And Printing The Factorial 
    void factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("The Facotrial Of " + n + " Is " + fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3 obj = new Q3();
        int n = sc.nextInt();
        obj.factorial(n);
        sc.close();
    }
}

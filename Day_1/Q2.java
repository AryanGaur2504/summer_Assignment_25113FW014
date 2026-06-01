import java.util.*;
class Q2 {
    //Printing Upto Multiple Of 10
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+ i +" = "+(n*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);
        sc.close();
    }
}

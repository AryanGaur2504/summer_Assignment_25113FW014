import java.util.Scanner;

class Q25{
    //Calculating Factorial
    static int fact(int n){
        if(n == 0 || n == 1) return 1;
        return(n*fact(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Validating Input
        if(n < 0) System.out.print("Invalid Input");
        //Printing Result
        else{
            System.out.print(fact(n));
        }
        sc.close();
    }
}
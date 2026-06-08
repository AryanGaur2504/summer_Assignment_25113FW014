import java.util.Scanner;
class Q29{
    //Generating Half Pyramid
    static void half_pyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Validating Input
        if(n <= 0){
            System.out.println("Invalid Input");
        }
        //Printing The Result By Calling The Function
        else{
            half_pyramid(n);
        }
        sc.close();
    }
}
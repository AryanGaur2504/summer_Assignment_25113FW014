import java.util.*;
class Q24{
    //Calculating a^b
    static double power(double a,double b){
    double poww = 1;
    for(int i=1;i<=b;i++){
        poww*=a;
    }
    return poww;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        //Checking If Power Is >= 1
        if(b < 1){
            System.out.print("Invalid Input");
        }
        //Printing Result
        else{
            System.out.print(power(a,b));
        }
        sc.close();
    }     
}

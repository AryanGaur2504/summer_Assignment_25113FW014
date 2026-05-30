import java.util.*;
class Q9{
    //Checking For Prime (Factors == 2)
    boolean is_prime(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i) count ++;
            }
        }
        if(count ==  2) return true;
        return false;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Q9 obj = new Q9();
            int n = sc.nextInt();
            //Printing The Result
            if(obj.is_prime(n)) System.out.println(n+" Is A Prime Number");
            else System.out.println(n+" Is Not A Prime Number");
            sc.close();
        }
    }
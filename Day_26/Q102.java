import java.util.*;

class Q102{
    static Scanner sc = new Scanner(System.in);

    //Check Eligibility
    static boolean is_eligible(int age){
        return age >= 18;
    }

    public static void main(String[] args){
        int age = sc.nextInt();

        if(age < 0){
            System.out.println("Invalid Age");
        }
        else if(is_eligible(age)){
            System.out.println("Eligible To Vote");
        }
        else{
            System.out.println("Not Eligible For Voting");
        }

        sc.close();
    }
}

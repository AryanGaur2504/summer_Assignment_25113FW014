import java.util.*;

//Class For Bank Account
class Bank{
    int accNo;
    String name;
    float balance;
}

class Q110{

    static Scanner sc = new Scanner(System.in);

    //Create New Account
    static void createAccount(ArrayList<Bank> acc){

        Bank b = new Bank();

        System.out.print("Enter Account Number : ");
        b.accNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name : ");
        b.name = sc.nextLine();

        System.out.print("Enter Balance : ");
        b.balance = sc.nextFloat();

        acc.add(b);

        System.out.println("Account Created Successfully");
    }

    //Deposit Money In Account
    static void depositMoney(ArrayList<Bank> acc){

        int no;
        float amount;

        System.out.print("Enter Account Number : ");
        no = sc.nextInt();

        System.out.print("Enter Amount : ");
        amount = sc.nextFloat();

        for(int i = 0;i < acc.size();i++){

            if(acc.get(i).accNo == no){

                acc.get(i).balance += amount;

                System.out.println("Money Deposited");
                return;
            }
        }

        System.out.println("Account Not Found");
    }

    //Display All Accounts
    static void displayAccounts(ArrayList<Bank> acc){

        if(acc.size() == 0){
            System.out.println("No Account Available");
            return;
        }

        for(int i = 0;i < acc.size();i++){

            System.out.println("\nAccount Number : " + acc.get(i).accNo);
            System.out.println("Name : " + acc.get(i).name);
            System.out.println("Balance : " + acc.get(i).balance);
        }
    }

    public static void main(String args[]){

        ArrayList<Bank> acc = new ArrayList<>();

        int choice;

        do{

            //Menu Driven Program
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Display Accounts");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            if(choice == 1) createAccount(acc);

            else if(choice == 2) depositMoney(acc);

            else if(choice == 3) displayAccounts(acc);

        }while(choice != 4);

        sc.close();
    }
}

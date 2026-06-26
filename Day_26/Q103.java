import java.util.*;

class Q103{
    static Scanner sc = new Scanner(System.in);

    //Initializing The Account
    static void input_bank_details(int arr[]){
        System.out.println("Enter Current Bank Balance :- ");
        arr[0] = sc.nextInt();

        System.out.println("Enter Pin :- ");
        arr[1] = sc.nextInt();
    }

    //Performing Withdrawal
    static void withdraw_amount(int arr[]){
        System.out.println("Enter Amount To Be Withdrawn :- ");

        int with_amt = sc.nextInt();

        if(with_amt <= 0){
            System.out.println("Invalid Amount");
            return;
        }

        if(with_amt > arr[0]){
            System.out.println("Withdrawal Amount Exceeds Balance!");
            return;
        }

        System.out.println("Enter The Pin :- ");

        int pass = sc.nextInt();

        if(pass != arr[1]){
            System.out.println("Invalid Pin");
            return;
        }

        arr[0] -= with_amt;

        System.out.println("Withdrawal Successful");
    }

    //Display Balance
    static void show_balance(int arr[]){
        System.out.println("Current Bank Balance :- " + arr[0]);
    }

    //ATM Simulation
    static void atm_simulation(int arr[]){
        int choice;

        do{
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Bank Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Exit");

            System.out.println("Enter Your Choice :- ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    show_balance(arr);
                    break;

                case 2:
                    withdraw_amount(arr);
                    break;

                case 3:
                    System.out.println("Thank You For Using Our ATM Services!");
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        }while(choice != 3);
    }

    public static void main(String[] args){
        int arr[] = new int[2];

        input_bank_details(arr);

        atm_simulation(arr);

        sc.close();
    }
}

import java.util.*;
class Q113{
    static Scanner sc = new Scanner(System.in);

    //Addition
    static void addition(){
        double a,b;
        System.out.print("Enter two numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Sum = " + (a + b));
    }

    //Subtraction
    static void subtraction(){
        double a,b;
        System.out.print("Enter two numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Difference = " + (a - b));
    }

    //Multiplication
    static void multiplication(){
        double a,b;
        System.out.print("Enter two numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Product = " + (a * b));
    }

    //Division
    static void division(){
        double a,b;
        System.out.print("Enter two numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if(b == 0) System.out.println("Division by zero is not possible");
        else System.out.println("Quotient = " + (a / b));
    }

    //Menu
    static void menu(){
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args){
        int choice;
        do{
            menu();
            choice = sc.nextInt();
            switch(choice){
                case 1: addition(); break;
                case 2: subtraction(); break;
                case 3: multiplication(); break;
                case 4: division(); break;
                case 5: System.out.println("Program ended"); break;
                default: System.out.println("Invalid choice");
            }
        }while(choice != 5);
        sc.close();
    }
}

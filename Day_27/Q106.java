import java.util.*;

//Class To Store Employee Details
class Employee{
    int id;
    String name;
    float salary;
}

class Q106{

    //Function To Input Employee Details
    static void input_employee(Employee e,Scanner sc){

        System.out.print("Enter Employee ID : ");
        e.id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        e.name = sc.nextLine();

        System.out.print("Enter Salary : ");
        e.salary = sc.nextFloat();
    }

    //Function To Display Employee Details
    static void display_employee(Employee e){

        System.out.println("\nEmployee ID : " + e.id);
        System.out.println("Employee Name : " + e.name);
        System.out.println("Salary : " + e.salary);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n;

        //Input Number Of Employees
        System.out.print("Enter Number Of Employees : ");
        n = sc.nextInt();

        //Array Of Objects
        Employee emp[] = new Employee[n];

        //Input Employee Records
        for(int i = 0;i < n;i++){

            emp[i] = new Employee();

            System.out.println("\nEnter Details Of Employee " + (i + 1));

            input_employee(emp[i],sc);
        }

        //Display Employee Records
        System.out.println("\n----- Employee Records -----");

        for(int i = 0;i < n;i++){
            display_employee(emp[i]);
        }

        sc.close();
    }
}
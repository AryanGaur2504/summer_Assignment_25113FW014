import java.util.*;

//Class To Store Salary Details
class Employee{
    int id;
    String name;
    float basic_salary,bonus,total_salary;
}

class Q107{

    //Function To Input Salary Details
    static void input_salary(Employee e,Scanner sc){

        System.out.print("Enter Employee ID : ");
        e.id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        e.name = sc.nextLine();

        System.out.print("Enter Basic Salary : ");
        e.basic_salary = sc.nextFloat();

        System.out.print("Enter Bonus : ");
        e.bonus = sc.nextFloat();

        //Calculate Total Salary
        e.total_salary = e.basic_salary + e.bonus;
    }

    //Function To Display Salary Details
    static void display_salary(Employee e){

        System.out.println("\nEmployee ID : " + e.id);
        System.out.println("Employee Name : " + e.name);
        System.out.println("Basic Salary : " + e.basic_salary);
        System.out.println("Bonus : " + e.bonus);
        System.out.println("Total Salary : " + e.total_salary);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n;

        //Input Number Of Employees
        System.out.print("Enter Number Of Employees : ");
        n = sc.nextInt();

        //Array Of Objects
        Employee emp[] = new Employee[n];

        //Input Salary Records
        for(int i = 0;i < n;i++){

            emp[i] = new Employee();

            System.out.println("\nEnter Details Of Employee " + (i + 1));

            input_salary(emp[i],sc);
        }

        //Display Salary Records
        System.out.println("\n----- Salary Records -----");

        for(int i = 0;i < n;i++){
            display_salary(emp[i]);
        }

        sc.close();
    }
}
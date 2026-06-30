import java.util.*;

class Q119{
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;

    static class Employee{
        int employee_id;
        String name;
        String department;
        double salary;
    }

    //Finds employee index using employee ID
    static int search_employee(Employee employees[],int count,int employee_id){
        for(int i = 0;i < count;i++){
            if(employees[i].employee_id == employee_id) return i;
        }
        return -1;
    }

    //Adds a new employee record
    static int add_employee(Employee employees[],int count){
        if(count == MAX){
            System.out.println("Employee record is full");
            return count;
        }

        System.out.print("Enter Employee ID: ");
        int employee_id = sc.nextInt();

        if(search_employee(employees,count,employee_id) != -1){
            System.out.println("Employee ID already exists");
            return count;
        }

        Employee employee = new Employee();
        employee.employee_id = employee_id;
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employee.name = sc.nextLine();

        System.out.print("Enter Department: ");
        employee.department = sc.nextLine();

        System.out.print("Enter Salary: ");
        employee.salary = sc.nextDouble();

        employees[count] = employee;
        System.out.println("Employee added successfully");
        return count + 1;
    }

    //Displays one employee record
    static void display_employee(Employee employee){
        System.out.println("Employee ID : " + employee.employee_id);
        System.out.println("Name        : " + employee.name);
        System.out.println("Department  : " + employee.department);
        System.out.println("Salary      : " + employee.salary);
    }

    //Displays all employee records
    static void display_all_employees(Employee employees[],int count){
        if(count == 0){
            System.out.println("No employee records found");
            return;
        }

        for(int i = 0;i < count;i++){
            System.out.println("\nEmployee " + (i + 1));
            display_employee(employees[i]);
        }
    }

    //Searches and displays an employee
    static void find_employee(Employee employees[],int count){
        System.out.print("Enter Employee ID: ");
        int employee_id = sc.nextInt();

        int index = search_employee(employees,count,employee_id);
        if(index == -1) System.out.println("Employee not found");
        else display_employee(employees[index]);
    }

    //Updates employee details
    static void update_employee(Employee employees[],int count){
        System.out.print("Enter Employee ID: ");
        int employee_id = sc.nextInt();

        int index = search_employee(employees,count,employee_id);
        if(index == -1){
            System.out.println("Employee not found");
            return;
        }

        sc.nextLine();
        System.out.print("Enter New Name: ");
        employees[index].name = sc.nextLine();

        System.out.print("Enter New Department: ");
        employees[index].department = sc.nextLine();

        System.out.print("Enter New Salary: ");
        employees[index].salary = sc.nextDouble();

        System.out.println("Employee record updated");
    }

    //Deletes an employee by shifting records
    static int delete_employee(Employee employees[],int count){
        System.out.print("Enter Employee ID: ");
        int employee_id = sc.nextInt();

        int index = search_employee(employees,count,employee_id);
        if(index == -1){
            System.out.println("Employee not found");
            return count;
        }

        for(int i = index;i < count - 1;i++) employees[i] = employees[i + 1];
        employees[count - 1] = null;
        System.out.println("Employee record deleted");
        return count - 1;
    }

    //Controls the employee management system
    static void run_system(){
        Employee employees[] = new Employee[MAX];
        int count = 0;
        int choice;

        do{
            System.out.println("\n--- EMPLOYEE MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: count = add_employee(employees,count); break;
                case 2: display_all_employees(employees,count); break;
                case 3: find_employee(employees,count); break;
                case 4: update_employee(employees,count); break;
                case 5: count = delete_employee(employees,count); break;
                case 6: System.out.println("Program ended"); break;
                default: System.out.println("Invalid choice");
            }
        }while(choice != 6);
    }

    public static void main(String args[]){
        run_system();
        sc.close();
    }
}

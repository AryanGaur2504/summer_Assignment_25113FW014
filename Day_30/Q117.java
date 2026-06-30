import java.util.*;

class Q117{
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;

    static class Student{
        int roll_no;
        String name;
        String course;
        double marks;
    }

    //Finds student index using roll number
    static int search_student(Student students[],int count,int roll_no){
        for(int i = 0;i < count;i++){
            if(students[i].roll_no == roll_no) return i;
        }
        return -1;
    }

    //Adds a new student record
    static int add_student(Student students[],int count){
        if(count == MAX){
            System.out.println("Student record is full");
            return count;
        }

        System.out.print("Enter Roll Number: ");
        int roll_no = sc.nextInt();

        if(search_student(students,count,roll_no) != -1){
            System.out.println("Roll number already exists");
            return count;
        }

        Student student = new Student();
        student.roll_no = roll_no;
        sc.nextLine();

        System.out.print("Enter Name: ");
        student.name = sc.nextLine();

        System.out.print("Enter Course: ");
        student.course = sc.nextLine();

        System.out.print("Enter Marks: ");
        student.marks = sc.nextDouble();

        students[count] = student;
        System.out.println("Student added successfully");
        return count + 1;
    }

    //Displays one student record
    static void display_student(Student student){
        System.out.println("Roll Number : " + student.roll_no);
        System.out.println("Name        : " + student.name);
        System.out.println("Course      : " + student.course);
        System.out.println("Marks       : " + student.marks);
    }

    //Displays all student records
    static void display_all_students(Student students[],int count){
        if(count == 0){
            System.out.println("No student records found");
            return;
        }

        for(int i = 0;i < count;i++){
            System.out.println("\nStudent " + (i + 1));
            display_student(students[i]);
        }
    }

    //Searches and displays a student
    static void find_student(Student students[],int count){
        System.out.print("Enter Roll Number: ");
        int roll_no = sc.nextInt();

        int index = search_student(students,count,roll_no);
        if(index == -1) System.out.println("Student not found");
        else display_student(students[index]);
    }

    //Updates the selected student record
    static void update_student(Student students[],int count){
        System.out.print("Enter Roll Number: ");
        int roll_no = sc.nextInt();

        int index = search_student(students,count,roll_no);
        if(index == -1){
            System.out.println("Student not found");
            return;
        }

        sc.nextLine();
        System.out.print("Enter New Name: ");
        students[index].name = sc.nextLine();

        System.out.print("Enter New Course: ");
        students[index].course = sc.nextLine();

        System.out.print("Enter New Marks: ");
        students[index].marks = sc.nextDouble();

        System.out.println("Student record updated");
    }

    //Deletes a student by shifting remaining records
    static int delete_student(Student students[],int count){
        System.out.print("Enter Roll Number: ");
        int roll_no = sc.nextInt();

        int index = search_student(students,count,roll_no);
        if(index == -1){
            System.out.println("Student not found");
            return count;
        }

        for(int i = index;i < count - 1;i++) students[i] = students[i + 1];
        students[count - 1] = null;
        System.out.println("Student record deleted");
        return count - 1;
    }

    //Controls the complete student record system
    static void run_system(){
        Student students[] = new Student[MAX];
        int count = 0;
        int choice;

        do{
            System.out.println("\n--- STUDENT RECORD SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: count = add_student(students,count); break;
                case 2: display_all_students(students,count); break;
                case 3: find_student(students,count); break;
                case 4: update_student(students,count); break;
                case 5: count = delete_student(students,count); break;
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

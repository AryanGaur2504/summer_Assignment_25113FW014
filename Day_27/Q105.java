import java.util.*;

//Class To Store Student Details
class Student{
    int roll;
    String name;
    float marks;
}

class Q105{

    //Function To Input Student Details
    static void input_student(Student s,Scanner sc){

        System.out.print("Enter Roll No : ");
        s.roll = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name : ");
        s.name = sc.nextLine();

        System.out.print("Enter Marks : ");
        s.marks = sc.nextFloat();
    }

    //Function To Display Student Details
    static void display_student(Student s){

        System.out.println("\nRoll No : " + s.roll);
        System.out.println("Name : " + s.name);
        System.out.println("Marks : " + s.marks);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n;

        //Input Number Of Students
        System.out.print("Enter Number Of Students : ");
        n = sc.nextInt();

        //Array Of Objects
        Student s[] = new Student[n];

        //Input Student Records
        for(int i = 0;i < n;i++){

            s[i] = new Student();

            System.out.println("\nEnter Details Of Student " + (i + 1));

            input_student(s[i],sc);
        }

        //Display Student Records
        System.out.println("\n----- Student Records -----");

        for(int i = 0;i < n;i++){
            display_student(s[i]);
        }

        sc.close();
    }
}
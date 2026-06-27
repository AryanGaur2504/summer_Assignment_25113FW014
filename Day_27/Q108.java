import java.util.*;

//Class To Store Student Marksheet
class Student{
    int roll;
    String name;
    float sub1,sub2,sub3,total,percentage;
}

class Q108{

    //Function To Input Student Details
    static void input_student(Student s,Scanner sc){

        System.out.print("Enter Roll No : ");
        s.roll = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name : ");
        s.name = sc.nextLine();

        //Input Subject Marks
        System.out.print("Enter Subject 1 Marks : ");
        s.sub1 = sc.nextFloat();

        System.out.print("Enter Subject 2 Marks : ");
        s.sub2 = sc.nextFloat();

        System.out.print("Enter Subject 3 Marks : ");
        s.sub3 = sc.nextFloat();

        //Calculate Total Marks
        s.total = s.sub1 + s.sub2 + s.sub3;

        //Calculate Percentage
        s.percentage = s.total / 3;
    }

    //Function To Display Marksheet
    static void display_marksheet(Student s){

        System.out.println("\n----- Marksheet -----");

        System.out.println("Roll No : " + s.roll);
        System.out.println("Name : " + s.name);

        System.out.println("Subject 1 : " + s.sub1);
        System.out.println("Subject 2 : " + s.sub2);
        System.out.println("Subject 3 : " + s.sub3);

        System.out.println("Total Marks : " + s.total);
        System.out.println("Percentage : " + s.percentage + "%");
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //Create Object
        Student s = new Student();

        //Input Student Details
        input_student(s,sc);

        //Display Marksheet
        display_marksheet(s);

        sc.close();
    }
}
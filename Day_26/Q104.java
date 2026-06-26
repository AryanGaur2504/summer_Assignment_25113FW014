import java.util.*;

class Q104{
    static Scanner sc = new Scanner(System.in);

    //Display Question
    static int display_question(String question,String op1,String op2,String op3,String op4,int ans){
        System.out.println("\n" + question);
        System.out.println("1. " + op1);
        System.out.println("2. " + op2);
        System.out.println("3. " + op3);
        System.out.println("4. " + op4);

        System.out.print("Enter Your Choice :- ");
        int choice = sc.nextInt();

        if(choice == ans){
            System.out.println("Correct Answer!");
            return 1;
        }

        System.out.println("Wrong Answer!");
        return 0;
    }

    //Quiz Application
    static void quiz_application(){
        int score = 0;

        score += display_question(
            "Who Is The Prime Minister Of India?",
            "Narendra Modi",
            "Rahul Gandhi",
            "Amit Shah",
            "Yogi Adityanath",
            1
        );

        score += display_question(
            "Which Language Is Used For Android Development?",
            "Python",
            "C++",
            "Java",
            "HTML",
            3
        );

        score += display_question(
            "What Is The Capital Of Haryana?",
            "Delhi",
            "Chandigarh",
            "Lucknow",
            "Jaipur",
            2
        );

        System.out.println("\nFinal Score :- " + score + "/3");
    }

    public static void main(String[] args){
        //Calling The Function
        quiz_application();
        sc.close();
    }
}

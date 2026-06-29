import java.util.*;
class Q115{
    static Scanner sc = new Scanner(System.in);

    //Reverse String
    static void reverse_string(String str){
        String rev = "";
        for(int i = str.length() - 1;i >= 0;i--) rev += str.charAt(i);
        System.out.println("Reversed String = " + rev);
    }

    //Palindrome Check
    static void palindrome_check(String str){
        String rev = "";
        for(int i = str.length() - 1;i >= 0;i--) rev += str.charAt(i);
        if(rev.equals(str)) System.out.println("Palindrome String");
        else System.out.println("Not Palindrome String");
    }

    //Count Vowels
    static void count_vowels(String str){
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        }
        System.out.println("Vowels = " + count);
    }

    //Convert To Uppercase
    static void to_uppercase(String str){
        System.out.println("Uppercase String = " + str.toUpperCase());
    }

    //Convert To Lowercase
    static void to_lowercase(String str){
        System.out.println("Lowercase String = " + str.toLowerCase());
    }

    //Menu
    static void menu(){
        System.out.println("\n1. Reverse String");
        System.out.println("2. Check Palindrome");
        System.out.println("3. Count Vowels");
        System.out.println("4. Convert To Uppercase");
        System.out.println("5. Convert To Lowercase");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args){
        int choice;
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        do{
            menu();
            choice = sc.nextInt();
            switch(choice){
                case 1: reverse_string(str); break;
                case 2: palindrome_check(str); break;
                case 3: count_vowels(str); break;
                case 4: to_uppercase(str); break;
                case 5: to_lowercase(str); break;
                case 6: System.out.println("Program ended"); break;
                default: System.out.println("Invalid choice");
            }
        }while(choice != 6);
        sc.close();
    }
}

import java.util.*;

class Q85{
    static Scanner sc = new Scanner(System.in);

    //Check Palindrome
    static boolean palindrome(String str){
        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)) return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String args[]){
        String str = sc.next();

        if(palindrome(str)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        sc.close();
    }
}

import java.util.*;

class Q91{
    static Scanner sc = new Scanner(System.in);

    //Function To Check Anagram
    static boolean check_anagram(String str1,String str2){

        //Length Check
        if(str1.length() != str2.length()) return false;

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //Compare Both Strings
        return Arrays.equals(arr1,arr2);
    }

    public static void main(String args[]){
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        //Print Result
        if(check_anagram(str1,str2)) System.out.println("Anagram Strings");
        else System.out.println("Not Anagram Strings");

        sc.close();
    }
}

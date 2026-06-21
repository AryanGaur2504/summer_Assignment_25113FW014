import java.util.*;
class Q83{
    //Printing The Array
    static void print_array(int arr[]){
        for(int i = 0;i < arr.length;i++) System.out.print(arr[i] + "\t");
    }
    //Counting Vowels And Consonants In A String
    static int [] count_vowels_and_consonants(String str){
        int length = str.length();
        int vowels = 0;
        int consonants = 0;
        for(int i = length - 1;i >= 0;i--) {
            char ch = str.charAt(i);
            //Checking UpperCase Vowels
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') vowels++;
            //Checking LowerCase Vowels
            else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
            //Checking For Consonants
            else if((ch) >= 65 && (ch) <= 90 || (ch) >= 97 && (ch) <= 122) consonants++;
        }
        int result[] = {vowels,consonants};
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result[] = count_vowels_and_consonants(str);
        //Printing The Result
        print_array(result);
        sc.close();
    }
}
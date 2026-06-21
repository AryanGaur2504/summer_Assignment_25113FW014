import java.util.*;
class Q84{
    //Converting The String To Upper Case
    static void to_upper_case(StringBuilder str){
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 97 && ch <= 122){
                char up = (char)(ch-32);
                str.setCharAt(i,up); //Converting To UpperCase By Using Ascii Values
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        to_upper_case(sb);
        str = sb.toString();
        //Printing The Result
        System.out.print(str);
        sc.close();
    }
}
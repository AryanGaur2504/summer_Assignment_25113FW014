import java.util.*;
class Q82{
    //Reversing The String
    static void reverse_string(StringBuilder str){
        int length = str.length();
        for(int i = 0;i < length/2;i++){
            char temp = str.charAt(length - i - 1);
            str.setCharAt((length - i -1), str.charAt(i));
            str.setCharAt(i,temp);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        //Printing The Result
        reverse_string(sb);
        str = sb.toString();
        System.out.print(str);
        sc.close();
    }
}
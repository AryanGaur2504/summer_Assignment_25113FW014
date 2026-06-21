import java.util.*;
class Q81{
    //Calculating The Length Of The String
    static int string_length(String str){
        int length = 0;
        for(char ch : str.toCharArray()){
            length++;
        }
        return length;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //Printing The Result
        //Printing The Result
        System.out.print(string_length(str));
        sc.close();
    }
}
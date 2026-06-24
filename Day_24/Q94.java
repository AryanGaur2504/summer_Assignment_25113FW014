import java.util.*;

class Q94{
    static Scanner sc = new Scanner(System.in);

    //Function To Compress String
    static String compress_string(String str){
        String ans = "";

        for(int i = 0;i < str.length();i++){

            int count = 1;

            //Count Same Characters
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }

            ans += str.charAt(i);
            ans += count;
        }

        return ans;
    }

    public static void main(String args[]){
        String str = sc.nextLine();

        //Print Result
        System.out.println(compress_string(str));

        sc.close();
    }
}
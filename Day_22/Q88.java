import java.util.*;

class Q88{
    static Scanner sc = new Scanner(System.in);

    //Remove Spaces
    static String remove_spaces(String str){
        String ans = "";

        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) != ' '){
                ans += str.charAt(i);
            }
        }

        return ans;
    }

    public static void main(String args[]){
        String str = sc.nextLine();

        System.out.println(remove_spaces(str));

        sc.close();
    }
}

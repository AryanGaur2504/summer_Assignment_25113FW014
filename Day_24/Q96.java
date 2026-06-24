import java.util.*;

class Q96{
    static Scanner sc = new Scanner(System.in);

    //Function To Remove Duplicate Characters
    static String remove_duplicate_char(String str){
        String ans = "";
        HashSet<Character> st = new HashSet<>();

        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);

            //Check Duplicate Character
            if(!st.contains(ch)){
                ans += ch;
                st.add(ch);
            }
        }

        return ans;
    }

    public static void main(String args[]){
        String str = sc.nextLine();

        //Print Result
        System.out.println(remove_duplicate_char(str));

        sc.close();
    }
}

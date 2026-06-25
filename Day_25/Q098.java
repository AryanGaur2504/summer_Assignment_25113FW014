import java.util.*;

class Q98{
    static Scanner sc = new Scanner(System.in);

    //Function To Find Common Characters
    static String common_chars(String str1,String str2){
        String ans = "";
        HashSet<Character> st = new HashSet<>();

        for(int i = 0;i < str1.length();i++){
            st.add(str1.charAt(i));
        }

        for(int i = 0;i < str2.length();i++){
            char ch = str2.charAt(i);

            //Check Common Character
            if(st.contains(ch)){
                ans += ch;
                st.remove(ch);
            }
        }

        return ans;
    }

    public static void main(String args[]){
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        //Print Result
        System.out.println(common_chars(str1,str2));

        sc.close();
    }
}
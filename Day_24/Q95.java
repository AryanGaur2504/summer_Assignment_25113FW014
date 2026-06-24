import java.util.*;

class Q95{
    static Scanner sc = new Scanner(System.in);

    //Function To Find Longest Word
    static String longest_word(String str){
        String word = "";
        String ans = "";

        for(int i = 0;i < str.length();i++){

            if(str.charAt(i) != ' '){
                word += str.charAt(i);
            }
            else{

                //Check Longest Word
                if(word.length() > ans.length()){
                    ans = word;
                }

                word = "";
            }
        }

        //Last Word Check
        if(word.length() > ans.length()){
            ans = word;
        }

        return ans;
    }

    public static void main(String args[]){
        String str = sc.nextLine();

        //Print Result
        System.out.println(longest_word(str));

        sc.close();
    }
}

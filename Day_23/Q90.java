import java.util.*;

class Q90{
    static Scanner sc = new Scanner(System.in);

    //Function To Find First Repeating Character
    static char first_repeating(String str){
        HashMap<Character,Integer> freq = new HashMap<>();

        //Count Frequency
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0) + 1);
        }

        //Find First Repeating Character
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);

            if(freq.get(ch) > 1){
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String args[]){
        String str = sc.nextLine();

        char ans = first_repeating(str);

        //Print Result
        if(ans != '\0') System.out.println(ans);
        else System.out.println("No Repeating Character");

        sc.close();
    }
}

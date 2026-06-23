import java.util.*;

class Q92{
    static Scanner sc = new Scanner(System.in);

    //Function To Find Maximum Occurring Character
    static char max_occ_char(String str){
        HashMap<Character,Integer> freq = new HashMap<>();

        //Count Frequency
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0) + 1);
        }

        int maxi = 0;
        char ans = '\0';

        //Find Maximum Occurring Character
        for(char ch : freq.keySet()){
            if(freq.get(ch) > maxi){
                maxi = freq.get(ch);
                ans = ch;
            }
        }

        return ans;
    }

    public static void main(String args[]){
        String str = sc.nextLine();

        //Print Result
        System.out.println(max_occ_char(str));

        sc.close();
    }
}

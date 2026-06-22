import java.util.*;

class Q87{
    static Scanner sc = new Scanner(System.in);

    //Character Frequency
    static void character_freq(String str){
        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);

            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch) + 1);
            }
            else{
                mp.put(ch,1);
            }
        }

        for(char key : mp.keySet()){
            System.out.println(key + " -> " + mp.get(key));
        }
    }

    public static void main(String args[]){
        String str = sc.nextLine();

        character_freq(str);

        sc.close();
    }
}

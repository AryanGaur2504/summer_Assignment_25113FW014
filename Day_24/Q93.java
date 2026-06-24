import java.util.*;

class Q93{
    static Scanner sc = new Scanner(System.in);

    //Function To Check String Rotation
    static boolean check_rotation(String str1,String str2){

        //Length Check
        if(str1.length() != str2.length()) return false;

        String temp = str1 + str1;

        //Check Rotation
        return temp.contains(str2);
    }

    public static void main(String args[]){
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        //Print Result
        if(check_rotation(str1,str2)) System.out.println("Rotation String");
        else System.out.println("Not Rotation String");

        sc.close();
    }
}

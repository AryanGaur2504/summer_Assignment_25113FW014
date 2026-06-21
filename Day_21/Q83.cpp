#include <bits/stdc++.h>
using namespace std;
//Counting Vowels And Consonants In A String
vector<int> count_vowels_and_consonants(string str){
    int length = str.length();
    int vowels = 0;
    int consonants = 0;
    for(int i = length - 1;i >= 0;i--) {
        char ch = str[i];
        //Checking UpperCase Vowels
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') vowels++;
        //Checking LowerCase Vowels
        else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
        //Checking For Consonants
        else if(int(ch) >= 65 && int(ch) <= 90 || int(ch) >= 97 && int(ch) <= 122) consonants++;
    }
    return {vowels,consonants};
}
//Printing The Array
void print_array(vector<int> &arr){
    for(int i = 0;i < arr.size();i++) cout << arr[i] << "\t";
}
int main(){
    string str;
    cin >> str;
    vector<int> result = count_vowels_and_consonants(str);
    //Printing The Result {vowles,consonants}
    print_array(result);
    return 0;
}
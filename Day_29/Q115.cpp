#include <bits/stdc++.h>
using namespace std;

//Reverse String
void reverse_string(string str){
    reverse(str.begin(),str.end());
    cout << "Reversed String = " << str << endl;
}

//Palindrome Check
void palindrome_check(string str){
    string temp = str;
    reverse(temp.begin(),temp.end());
    if(temp == str) cout << "Palindrome String" << endl;
    else cout << "Not Palindrome String" << endl;
}

//Count Vowels
void count_vowels(string str){
    int count = 0;
    for(char ch : str){
        ch = tolower(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
    }
    cout << "Vowels = " << count << endl;
}

//Convert To Uppercase
void to_uppercase(string str){
    for(int i = 0;i < str.length();i++) str[i] = toupper(str[i]);
    cout << "Uppercase String = " << str << endl;
}

//Convert To Lowercase
void to_lowercase(string str){
    for(int i = 0;i < str.length();i++) str[i] = tolower(str[i]);
    cout << "Lowercase String = " << str << endl;
}

//Menu
void menu(){
    cout << "\n1. Reverse String" << endl;
    cout << "2. Check Palindrome" << endl;
    cout << "3. Count Vowels" << endl;
    cout << "4. Convert To Uppercase" << endl;
    cout << "5. Convert To Lowercase" << endl;
    cout << "6. Exit" << endl;
    cout << "Enter your choice: ";
}

int main(){
    string str;
    int choice;
    cout << "Enter string: ";
    getline(cin,str);
    do{
        menu();
        cin >> choice;
        switch(choice){
            case 1: reverse_string(str); break;
            case 2: palindrome_check(str); break;
            case 3: count_vowels(str); break;
            case 4: to_uppercase(str); break;
            case 5: to_lowercase(str); break;
            case 6: cout << "Program ended" << endl; break;
            default: cout << "Invalid choice" << endl;
        }
    }while(choice != 6);
    return 0;
}

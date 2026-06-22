#include <bits/stdc++.h>
using namespace std;

//Count Words
int count_words(string str){
    int count = 0;

    for(int i = 0;i < str.length();i++){
        if(str[i] != ' ' && (i == 0 || str[i - 1] == ' ')){
            count++;
        }
    }

    return count;
}

int main(){
    string str;
    getline(cin,str);

    cout << count_words(str);

    return 0;
}

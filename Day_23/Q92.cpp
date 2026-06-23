#include<bits/stdc++.h>
using namespace std;

//Function To Find Maximum Occurring Character
char max_occ_char(string str){
    unordered_map<char,int> freq;

    //Count Frequency
    for(int i = 0;i < str.length();i++){
        freq[str[i]]++;
    }

    int maxi = 0;
    char ans;

    //Find Maximum Occurring Character
    for(auto it : freq){
        if(it.second > maxi){
            maxi = it.second;
            ans = it.first;
        }
    }

    return ans;
}

int main(){
    string str;
    getline(cin,str);

    //Print Result
    cout << max_occ_char(str);

    return 0;
}

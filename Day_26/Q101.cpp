#include<bits/stdc++.h>
using namespace std;

//Number Guessing Game
void number_guessing_game(){
    srand(time(0));

    int number = rand() % 100 + 1;
    int takes = 0;
    int guess;

    cout << "Guess The Number Between 1 and 100\n";

    do{
        cin >> guess;

        if(guess != number){
            if(guess < number) cout << "Try Higher Number\n";
            else cout << "Try Lower Number\n";
        }

        takes++;

    }while(guess != number);

    cout << "Successfully Guessed In " << takes << " Attempts!";
}

int main(){
    //Calling The Function
    number_guessing_game();

    return 0;
}

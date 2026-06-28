#include <bits/stdc++.h>
using namespace std;

//Structure For Library Details
struct Library{
    int bookId;
    string bookName;
    string author;
};

//Add Book In Library
void addBook(vector<Library> &lib){

    Library b;

    cout << "Enter Book ID : ";
    cin >> b.bookId;

    cin.ignore();

    cout << "Enter Book Name : ";
    getline(cin,b.bookName);

    cout << "Enter Author Name : ";
    getline(cin,b.author);

    lib.push_back(b);

    cout << "Book Added Successfully\n";
}

//Display All Books
void displayBooks(vector<Library> lib){

    if(lib.size() == 0){
        cout << "No Books Available\n";
        return;
    }

    for(int i = 0;i < lib.size();i++){

        cout << "\nBook ID : " << lib[i].bookId << endl;
        cout << "Book Name : " << lib[i].bookName << endl;
        cout << "Author : " << lib[i].author << endl;
    }
}

//Search Book By Book ID
void searchBook(vector<Library> lib){

    int id;
    bool found = false;

    cout << "Enter Book ID : ";
    cin >> id;

    for(int i = 0;i < lib.size();i++){

        if(lib[i].bookId == id){

            cout << "\nBook Found\n";
            cout << "Book Name : " << lib[i].bookName << endl;
            cout << "Author : " << lib[i].author << endl;

            found = true;
        }
    }

    if(found == false) cout << "Book Not Found\n";
}

int main(){

    vector<Library> lib;
    int choice;

    do{

        //Menu Driven Program
        cout << "\n1. Add Book";
        cout << "\n2. Display Books";
        cout << "\n3. Search Book";
        cout << "\n4. Exit";
        cout << "\nEnter Choice : ";
        cin >> choice;

        if(choice == 1) addBook(lib);

        else if(choice == 2) displayBooks(lib);

        else if(choice == 3) searchBook(lib);

    }while(choice != 4);

    return 0;
}

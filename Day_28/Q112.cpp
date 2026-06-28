#include <bits/stdc++.h>
using namespace std;

//Structure For Contact Details
struct Contact{
    string name;
    long long phone;
};

//Add New Contact
void addContact(vector<Contact> &c){

    Contact x;

    cin.ignore();

    cout << "Enter Name : ";
    getline(cin,x.name);

    cout << "Enter Phone Number : ";
    cin >> x.phone;

    c.push_back(x);

    cout << "Contact Added Successfully\n";
}

//Display All Contacts
void displayContacts(vector<Contact> c){

    if(c.size() == 0){
        cout << "No Contact Available\n";
        return;
    }

    for(int i = 0;i < c.size();i++){

        cout << "\nName : " << c[i].name << endl;
        cout << "Phone Number : " << c[i].phone << endl;
    }
}

//Search Contact By Name
void searchContact(vector<Contact> c){

    string name;
    bool found = false;

    cin.ignore();

    cout << "Enter Name : ";
    getline(cin,name);

    for(int i = 0;i < c.size();i++){

        if(c[i].name == name){

            cout << "\nContact Found\n";
            cout << "Phone Number : " << c[i].phone << endl;

            found = true;
        }
    }

    if(found == false) cout << "Contact Not Found\n";
}

int main(){

    vector<Contact> c;
    int choice;

    do{

        //Menu Driven Program
        cout << "\n1. Add Contact";
        cout << "\n2. Display Contacts";
        cout << "\n3. Search Contact";
        cout << "\n4. Exit";
        cout << "\nEnter Choice : ";
        cin >> choice;

        if(choice == 1) addContact(c);

        else if(choice == 2) displayContacts(c);

        else if(choice == 3) searchContact(c);

    }while(choice != 4);

    return 0;
}

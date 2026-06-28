#include <bits/stdc++.h>
using namespace std;

//Structure For Ticket Details
struct Ticket{
    int ticketId;
    string name;
    string movie;
};

//Book New Ticket
void bookTicket(vector<Ticket> &t){

    Ticket x;

    cout << "Enter Ticket ID : ";
    cin >> x.ticketId;

    cin.ignore();

    cout << "Enter Customer Name : ";
    getline(cin,x.name);

    cout << "Enter Movie Name : ";
    getline(cin,x.movie);

    t.push_back(x);

    cout << "Ticket Booked Successfully\n";
}

//Display All Tickets
void displayTickets(vector<Ticket> t){

    if(t.size() == 0){
        cout << "No Ticket Available\n";
        return;
    }

    for(int i = 0;i < t.size();i++){

        cout << "\nTicket ID : " << t[i].ticketId << endl;
        cout << "Customer Name : " << t[i].name << endl;
        cout << "Movie Name : " << t[i].movie << endl;
    }
}

//Search Ticket By Ticket ID
void searchTicket(vector<Ticket> t){

    int id;
    bool found = false;

    cout << "Enter Ticket ID : ";
    cin >> id;

    for(int i = 0;i < t.size();i++){

        if(t[i].ticketId == id){

            cout << "\nTicket Found\n";
            cout << "Customer Name : " << t[i].name << endl;
            cout << "Movie Name : " << t[i].movie << endl;

            found = true;
        }
    }

    if(found == false) cout << "Ticket Not Found\n";
}

int main(){

    vector<Ticket> t;
    int choice;

    do{

        //Menu Driven Program
        cout << "\n1. Book Ticket";
        cout << "\n2. Display Tickets";
        cout << "\n3. Search Ticket";
        cout << "\n4. Exit";
        cout << "\nEnter Choice : ";
        cin >> choice;

        if(choice == 1) bookTicket(t);

        else if(choice == 2) displayTickets(t);

        else if(choice == 3) searchTicket(t);

    }while(choice != 4);

    return 0;
}

#include<bits/stdc++.h>
using namespace std;

const int MAX = 50;
const double ROOM_RATE = 1500.0;

struct Room{
    int room_no;
    bool is_booked;
    string customer_name;
    string phone_no;
    int days;
};

//Creates the fixed list of hotel rooms
void initialize_rooms(Room rooms[],int &count){
    count = 10;
    for(int i = 0;i < count;i++){
        rooms[i].room_no = 101 + i;
        rooms[i].is_booked = false;
        rooms[i].customer_name = "";
        rooms[i].phone_no = "";
        rooms[i].days = 0;
    }
}

//Finds room index using room number
int search_room(Room rooms[],int count,int room_no){
    for(int i = 0;i < count;i++){
        if(rooms[i].room_no == room_no) return i;
    }
    return -1;
}

//Displays current condition of every room
void display_rooms(Room rooms[],int count){
    cout << "\nRoom No\tStatus\n";
    for(int i = 0;i < count;i++){
        cout << rooms[i].room_no << "\t\t";
        cout << (rooms[i].is_booked ? "Booked" : "Available") << endl;
    }
}

//Books an available room
void book_room(Room rooms[],int count){
    int room_no;
    cout << "Enter Room Number: ";
    cin >> room_no;

    int index = search_room(rooms,count,room_no);
    if(index == -1){
        cout << "Invalid room number\n";
        return;
    }

    if(rooms[index].is_booked){
        cout << "Room is already booked\n";
        return;
    }

    cin.ignore(numeric_limits<streamsize>::max(),'\n');
    cout << "Enter Customer Name: ";
    getline(cin,rooms[index].customer_name);

    cout << "Enter Phone Number: ";
    getline(cin,rooms[index].phone_no);

    cout << "Enter Number of Days: ";
    cin >> rooms[index].days;

    rooms[index].is_booked = true;
    cout << "Room booked successfully\n";
}

//Displays complete booking details
void search_booking(Room rooms[],int count){
    int room_no;
    cout << "Enter Room Number: ";
    cin >> room_no;

    int index = search_room(rooms,count,room_no);
    if(index == -1){
        cout << "Invalid room number\n";
        return;
    }

    if(!rooms[index].is_booked){
        cout << "Room is not booked\n";
        return;
    }

    cout << "Room Number   : " << rooms[index].room_no << endl;
    cout << "Customer Name : " << rooms[index].customer_name << endl;
    cout << "Phone Number  : " << rooms[index].phone_no << endl;
    cout << "Days          : " << rooms[index].days << endl;
    cout << "Current Bill  : " << rooms[index].days * ROOM_RATE << endl;
}

//Updates customer details and stay duration
void update_booking(Room rooms[],int count){
    int room_no;
    cout << "Enter Room Number: ";
    cin >> room_no;

    int index = search_room(rooms,count,room_no);
    if(index == -1 || !rooms[index].is_booked){
        cout << "Booking not found\n";
        return;
    }

    cin.ignore(numeric_limits<streamsize>::max(),'\n');
    cout << "Enter New Customer Name: ";
    getline(cin,rooms[index].customer_name);

    cout << "Enter New Phone Number: ";
    getline(cin,rooms[index].phone_no);

    cout << "Enter New Number of Days: ";
    cin >> rooms[index].days;

    cout << "Booking updated successfully\n";
}

//Generates bill and makes the room available again
void checkout_room(Room rooms[],int count){
    int room_no;
    cout << "Enter Room Number: ";
    cin >> room_no;

    int index = search_room(rooms,count,room_no);
    if(index == -1 || !rooms[index].is_booked){
        cout << "Booking not found\n";
        return;
    }

    double bill = rooms[index].days * ROOM_RATE;
    cout << "\n--- CHECKOUT BILL ---\n";
    cout << "Customer Name : " << rooms[index].customer_name << endl;
    cout << "Room Number   : " << rooms[index].room_no << endl;
    cout << "Number of Days: " << rooms[index].days << endl;
    cout << "Rate Per Day  : " << ROOM_RATE << endl;
    cout << "Total Bill    : " << bill << endl;

    rooms[index].is_booked = false;
    rooms[index].customer_name = "";
    rooms[index].phone_no = "";
    rooms[index].days = 0;

    cout << "Checkout completed successfully\n";
}

//Controls the complete hotel management project
void run_system(){
    Room rooms[MAX];
    int count;
    int choice;
    initialize_rooms(rooms,count);

    do{
        cout << "\n--- MINI HOTEL MANAGEMENT SYSTEM ---\n";
        cout << "1. Display Rooms\n";
        cout << "2. Book Room\n";
        cout << "3. Search Booking\n";
        cout << "4. Update Booking\n";
        cout << "5. Checkout Room\n";
        cout << "6. Exit\n";
        cout << "Enter Choice: ";
        cin >> choice;

        switch(choice){
            case 1: display_rooms(rooms,count); break;
            case 2: book_room(rooms,count); break;
            case 3: search_booking(rooms,count); break;
            case 4: update_booking(rooms,count); break;
            case 5: checkout_room(rooms,count); break;
            case 6: cout << "Program ended\n"; break;
            default: cout << "Invalid choice\n";
        }
    }while(choice != 6);
}

int main(){
    run_system();
    return 0;
}

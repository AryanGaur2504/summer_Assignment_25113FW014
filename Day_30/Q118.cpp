#include<bits/stdc++.h>
using namespace std;

const int MAX = 100;

struct Book{
    int book_id;
    string title;
    string author;
    bool is_issued;
};

//Finds book index using book ID
int search_book(Book books[],int count,int book_id){
    for(int i = 0;i < count;i++){
        if(books[i].book_id == book_id) return i;
    }
    return -1;
}

//Adds a new book to the library
void add_book(Book books[],int &count){
    if(count == MAX){
        cout << "Library is full\n";
        return;
    }

    int book_id;
    cout << "Enter Book ID: ";
    cin >> book_id;

    if(search_book(books,count,book_id) != -1){
        cout << "Book ID already exists\n";
        return;
    }

    books[count].book_id = book_id;
    books[count].is_issued = false;
    cin.ignore(numeric_limits<streamsize>::max(),'\n');

    cout << "Enter Book Title: ";
    getline(cin,books[count].title);

    cout << "Enter Author Name: ";
    getline(cin,books[count].author);

    count++;
    cout << "Book added successfully\n";
}

//Displays one book record
void display_book(Book book){
    cout << "Book ID : " << book.book_id << endl;
    cout << "Title   : " << book.title << endl;
    cout << "Author  : " << book.author << endl;
    cout << "Status  : " << (book.is_issued ? "Issued" : "Available") << endl;
}

//Displays all books
void display_all_books(Book books[],int count){
    if(count == 0){
        cout << "No books found\n";
        return;
    }

    for(int i = 0;i < count;i++){
        cout << "\nBook " << i + 1 << endl;
        display_book(books[i]);
    }
}

//Searches and displays a book
void find_book(Book books[],int count){
    int book_id;
    cout << "Enter Book ID: ";
    cin >> book_id;

    int index = search_book(books,count,book_id);
    if(index == -1) cout << "Book not found\n";
    else display_book(books[index]);
}

//Issues an available book
void issue_book(Book books[],int count){
    int book_id;
    cout << "Enter Book ID: ";
    cin >> book_id;

    int index = search_book(books,count,book_id);
    if(index == -1){
        cout << "Book not found\n";
        return;
    }

    if(books[index].is_issued) cout << "Book is already issued\n";
    else{
        books[index].is_issued = true;
        cout << "Book issued successfully\n";
    }
}

//Returns an issued book
void return_book(Book books[],int count){
    int book_id;
    cout << "Enter Book ID: ";
    cin >> book_id;

    int index = search_book(books,count,book_id);
    if(index == -1){
        cout << "Book not found\n";
        return;
    }

    if(!books[index].is_issued) cout << "Book was not issued\n";
    else{
        books[index].is_issued = false;
        cout << "Book returned successfully\n";
    }
}

//Controls the mini library system
void run_system(){
    Book books[MAX];
    int count = 0;
    int choice;

    do{
        cout << "\n--- MINI LIBRARY SYSTEM ---\n";
        cout << "1. Add Book\n";
        cout << "2. Display All Books\n";
        cout << "3. Search Book\n";
        cout << "4. Issue Book\n";
        cout << "5. Return Book\n";
        cout << "6. Exit\n";
        cout << "Enter Choice: ";
        cin >> choice;

        switch(choice){
            case 1: add_book(books,count); break;
            case 2: display_all_books(books,count); break;
            case 3: find_book(books,count); break;
            case 4: issue_book(books,count); break;
            case 5: return_book(books,count); break;
            case 6: cout << "Program ended\n"; break;
            default: cout << "Invalid choice\n";
        }
    }while(choice != 6);
}

int main(){
    run_system();
    return 0;
}

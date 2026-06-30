import java.util.*;

class Q118{
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;

    static class Book{
        int book_id;
        String title;
        String author;
        boolean is_issued;
    }

    //Finds book index using book ID
    static int search_book(Book books[],int count,int book_id){
        for(int i = 0;i < count;i++){
            if(books[i].book_id == book_id) return i;
        }
        return -1;
    }

    //Adds a new book to the library
    static int add_book(Book books[],int count){
        if(count == MAX){
            System.out.println("Library is full");
            return count;
        }

        System.out.print("Enter Book ID: ");
        int book_id = sc.nextInt();

        if(search_book(books,count,book_id) != -1){
            System.out.println("Book ID already exists");
            return count;
        }

        Book book = new Book();
        book.book_id = book_id;
        book.is_issued = false;
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        book.title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        book.author = sc.nextLine();

        books[count] = book;
        System.out.println("Book added successfully");
        return count + 1;
    }

    //Displays one book record
    static void display_book(Book book){
        System.out.println("Book ID : " + book.book_id);
        System.out.println("Title   : " + book.title);
        System.out.println("Author  : " + book.author);
        System.out.println("Status  : " + (book.is_issued ? "Issued" : "Available"));
    }

    //Displays all books
    static void display_all_books(Book books[],int count){
        if(count == 0){
            System.out.println("No books found");
            return;
        }

        for(int i = 0;i < count;i++){
            System.out.println("\nBook " + (i + 1));
            display_book(books[i]);
        }
    }

    //Searches and displays a book
    static void find_book(Book books[],int count){
        System.out.print("Enter Book ID: ");
        int book_id = sc.nextInt();

        int index = search_book(books,count,book_id);
        if(index == -1) System.out.println("Book not found");
        else display_book(books[index]);
    }

    //Issues an available book
    static void issue_book(Book books[],int count){
        System.out.print("Enter Book ID: ");
        int book_id = sc.nextInt();

        int index = search_book(books,count,book_id);
        if(index == -1){
            System.out.println("Book not found");
            return;
        }

        if(books[index].is_issued) System.out.println("Book is already issued");
        else{
            books[index].is_issued = true;
            System.out.println("Book issued successfully");
        }
    }

    //Returns an issued book
    static void return_book(Book books[],int count){
        System.out.print("Enter Book ID: ");
        int book_id = sc.nextInt();

        int index = search_book(books,count,book_id);
        if(index == -1){
            System.out.println("Book not found");
            return;
        }

        if(!books[index].is_issued) System.out.println("Book was not issued");
        else{
            books[index].is_issued = false;
            System.out.println("Book returned successfully");
        }
    }

    //Controls the mini library system
    static void run_system(){
        Book books[] = new Book[MAX];
        int count = 0;
        int choice;

        do{
            System.out.println("\n--- MINI LIBRARY SYSTEM ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: count = add_book(books,count); break;
                case 2: display_all_books(books,count); break;
                case 3: find_book(books,count); break;
                case 4: issue_book(books,count); break;
                case 5: return_book(books,count); break;
                case 6: System.out.println("Program ended"); break;
                default: System.out.println("Invalid choice");
            }
        }while(choice != 6);
    }

    public static void main(String args[]){
        run_system();
        sc.close();
    }
}

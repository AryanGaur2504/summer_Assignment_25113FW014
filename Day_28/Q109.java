import java.util.*;

//Class For Library Details
class Library{
    int bookId;
    String bookName;
    String author;
}

class Q109{

    static Scanner sc = new Scanner(System.in);

    //Add Book In Library
    static void addBook(ArrayList<Library> lib){

        Library b = new Library();

        System.out.print("Enter Book ID : ");
        b.bookId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Book Name : ");
        b.bookName = sc.nextLine();

        System.out.print("Enter Author Name : ");
        b.author = sc.nextLine();

        lib.add(b);

        System.out.println("Book Added Successfully");
    }

    //Display All Books
    static void displayBooks(ArrayList<Library> lib){

        if(lib.size() == 0){
            System.out.println("No Books Available");
            return;
        }

        for(int i = 0;i < lib.size();i++){

            System.out.println("\nBook ID : " + lib.get(i).bookId);
            System.out.println("Book Name : " + lib.get(i).bookName);
            System.out.println("Author : " + lib.get(i).author);
        }
    }

    //Search Book By Book ID
    static void searchBook(ArrayList<Library> lib){

        int id;
        boolean found = false;

        System.out.print("Enter Book ID : ");
        id = sc.nextInt();

        for(int i = 0;i < lib.size();i++){

            if(lib.get(i).bookId == id){

                System.out.println("\nBook Found");
                System.out.println("Book Name : " + lib.get(i).bookName);
                System.out.println("Author : " + lib.get(i).author);

                found = true;
            }
        }

        if(found == false) System.out.println("Book Not Found");
    }

    public static void main(String args[]){

        ArrayList<Library> lib = new ArrayList<>();

        int choice;

        do{

            //Menu Driven Program
            System.out.println("\n1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            if(choice == 1) addBook(lib);

            else if(choice == 2) displayBooks(lib);

            else if(choice == 3) searchBook(lib);

        }while(choice != 4);

        sc.close();
    }
}

import java.util.*;

//Class For Contact Details
class Contact{
    String name;
    long phone;
}

class Q112{

    static Scanner sc = new Scanner(System.in);

    //Add New Contact
    static void addContact(ArrayList<Contact> c){

        Contact x = new Contact();

        sc.nextLine();

        System.out.print("Enter Name : ");
        x.name = sc.nextLine();

        System.out.print("Enter Phone Number : ");
        x.phone = sc.nextLong();

        c.add(x);

        System.out.println("Contact Added Successfully");
    }

    //Display All Contacts
    static void displayContacts(ArrayList<Contact> c){

        if(c.size() == 0){
            System.out.println("No Contact Available");
            return;
        }

        for(int i = 0;i < c.size();i++){

            System.out.println("\nName : " + c.get(i).name);
            System.out.println("Phone Number : " + c.get(i).phone);
        }
    }

    //Search Contact By Name
    static void searchContact(ArrayList<Contact> c){

        String name;
        boolean found = false;

        sc.nextLine();

        System.out.print("Enter Name : ");
        name = sc.nextLine();

        for(int i = 0;i < c.size();i++){

            if(c.get(i).name.equals(name)){

                System.out.println("\nContact Found");
                System.out.println("Phone Number : " + c.get(i).phone);

                found = true;
            }
        }

        if(found == false) System.out.println("Contact Not Found");
    }

    public static void main(String args[]){

        ArrayList<Contact> c = new ArrayList<>();

        int choice;

        do{

            //Menu Driven Program
            System.out.println("\n1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            if(choice == 1) addContact(c);

            else if(choice == 2) displayContacts(c);

            else if(choice == 3) searchContact(c);

        }while(choice != 4);

        sc.close();
    }
}

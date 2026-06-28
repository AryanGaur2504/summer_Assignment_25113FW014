import java.util.*;

//Class For Ticket Details
class Ticket{
    int ticketId;
    String name;
    String movie;
}

class Q111{

    static Scanner sc = new Scanner(System.in);

    //Book New Ticket
    static void bookTicket(ArrayList<Ticket> t){

        Ticket x = new Ticket();

        System.out.print("Enter Ticket ID : ");
        x.ticketId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Customer Name : ");
        x.name = sc.nextLine();

        System.out.print("Enter Movie Name : ");
        x.movie = sc.nextLine();

        t.add(x);

        System.out.println("Ticket Booked Successfully");
    }

    //Display All Tickets
    static void displayTickets(ArrayList<Ticket> t){

        if(t.size() == 0){
            System.out.println("No Ticket Available");
            return;
        }

        for(int i = 0;i < t.size();i++){

            System.out.println("\nTicket ID : " + t.get(i).ticketId);
            System.out.println("Customer Name : " + t.get(i).name);
            System.out.println("Movie Name : " + t.get(i).movie);
        }
    }

    //Search Ticket By Ticket ID
    static void searchTicket(ArrayList<Ticket> t){

        int id;
        boolean found = false;

        System.out.print("Enter Ticket ID : ");
        id = sc.nextInt();

        for(int i = 0;i < t.size();i++){

            if(t.get(i).ticketId == id){

                System.out.println("\nTicket Found");
                System.out.println("Customer Name : " + t.get(i).name);
                System.out.println("Movie Name : " + t.get(i).movie);

                found = true;
            }
        }

        if(found == false) System.out.println("Ticket Not Found");
    }

    public static void main(String args[]){

        ArrayList<Ticket> t = new ArrayList<>();

        int choice;

        do{

            //Menu Driven Program
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Display Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            if(choice == 1) bookTicket(t);

            else if(choice == 2) displayTickets(t);

            else if(choice == 3) searchTicket(t);

        }while(choice != 4);

        sc.close();
    }
}

import java.util.*;

class Q120{
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 50;
    static final double ROOM_RATE = 1500.0;

    static class Room{
        int room_no;
        boolean is_booked;
        String customer_name;
        String phone_no;
        int days;
    }

    //Creates the fixed list of hotel rooms
    static int initialize_rooms(Room rooms[]){
        int count = 10;
        for(int i = 0;i < count;i++){
            rooms[i] = new Room();
            rooms[i].room_no = 101 + i;
            rooms[i].is_booked = false;
            rooms[i].customer_name = "";
            rooms[i].phone_no = "";
            rooms[i].days = 0;
        }
        return count;
    }

    //Finds room index using room number
    static int search_room(Room rooms[],int count,int room_no){
        for(int i = 0;i < count;i++){
            if(rooms[i].room_no == room_no) return i;
        }
        return -1;
    }

    //Displays current condition of every room
    static void display_rooms(Room rooms[],int count){
        System.out.println("\nRoom No\tStatus");
        for(int i = 0;i < count;i++){
            System.out.print(rooms[i].room_no + "\t\t");
            System.out.println(rooms[i].is_booked ? "Booked" : "Available");
        }
    }

    //Books an available room
    static void book_room(Room rooms[],int count){
        System.out.print("Enter Room Number: ");
        int room_no = sc.nextInt();

        int index = search_room(rooms,count,room_no);
        if(index == -1){
            System.out.println("Invalid room number");
            return;
        }

        if(rooms[index].is_booked){
            System.out.println("Room is already booked");
            return;
        }

        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        rooms[index].customer_name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        rooms[index].phone_no = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        rooms[index].days = sc.nextInt();

        rooms[index].is_booked = true;
        System.out.println("Room booked successfully");
    }

    //Displays complete booking details
    static void search_booking(Room rooms[],int count){
        System.out.print("Enter Room Number: ");
        int room_no = sc.nextInt();

        int index = search_room(rooms,count,room_no);
        if(index == -1){
            System.out.println("Invalid room number");
            return;
        }

        if(!rooms[index].is_booked){
            System.out.println("Room is not booked");
            return;
        }

        System.out.println("Room Number   : " + rooms[index].room_no);
        System.out.println("Customer Name : " + rooms[index].customer_name);
        System.out.println("Phone Number  : " + rooms[index].phone_no);
        System.out.println("Days          : " + rooms[index].days);
        System.out.println("Current Bill  : " + (rooms[index].days * ROOM_RATE));
    }

    //Updates customer details and stay duration
    static void update_booking(Room rooms[],int count){
        System.out.print("Enter Room Number: ");
        int room_no = sc.nextInt();

        int index = search_room(rooms,count,room_no);
        if(index == -1 || !rooms[index].is_booked){
            System.out.println("Booking not found");
            return;
        }

        sc.nextLine();
        System.out.print("Enter New Customer Name: ");
        rooms[index].customer_name = sc.nextLine();

        System.out.print("Enter New Phone Number: ");
        rooms[index].phone_no = sc.nextLine();

        System.out.print("Enter New Number of Days: ");
        rooms[index].days = sc.nextInt();

        System.out.println("Booking updated successfully");
    }

    //Generates bill and makes the room available again
    static void checkout_room(Room rooms[],int count){
        System.out.print("Enter Room Number: ");
        int room_no = sc.nextInt();

        int index = search_room(rooms,count,room_no);
        if(index == -1 || !rooms[index].is_booked){
            System.out.println("Booking not found");
            return;
        }

        double bill = rooms[index].days * ROOM_RATE;
        System.out.println("\n--- CHECKOUT BILL ---");
        System.out.println("Customer Name : " + rooms[index].customer_name);
        System.out.println("Room Number   : " + rooms[index].room_no);
        System.out.println("Number of Days: " + rooms[index].days);
        System.out.println("Rate Per Day  : " + ROOM_RATE);
        System.out.println("Total Bill    : " + bill);

        rooms[index].is_booked = false;
        rooms[index].customer_name = "";
        rooms[index].phone_no = "";
        rooms[index].days = 0;

        System.out.println("Checkout completed successfully");
    }

    //Controls the complete hotel management project
    static void run_system(){
        Room rooms[] = new Room[MAX];
        int count = initialize_rooms(rooms);
        int choice;

        do{
            System.out.println("\n--- MINI HOTEL MANAGEMENT SYSTEM ---");
            System.out.println("1. Display Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Search Booking");
            System.out.println("4. Update Booking");
            System.out.println("5. Checkout Room");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: display_rooms(rooms,count); break;
                case 2: book_room(rooms,count); break;
                case 3: search_booking(rooms,count); break;
                case 4: update_booking(rooms,count); break;
                case 5: checkout_room(rooms,count); break;
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

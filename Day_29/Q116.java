import java.util.*;
class Q116{
    static Scanner sc = new Scanner(System.in);

    static class Product{
        int id;
        String name;
        int quantity;
        double price;
    }

    //Add Product
    static void add_product(ArrayList<Product> products){
        Product p = new Product();
        System.out.print("Enter product id: ");
        p.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter product name: ");
        p.name = sc.nextLine();
        System.out.print("Enter quantity: ");
        p.quantity = sc.nextInt();
        System.out.print("Enter price: ");
        p.price = sc.nextDouble();
        products.add(p);
    }

    //Display Products
    static void display_products(ArrayList<Product> products){
        if(products.size() == 0){
            System.out.println("No products available");
            return;
        }
        for(Product p : products){
            System.out.println("ID: " + p.id);
            System.out.println("Name: " + p.name);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Price: " + p.price);
            System.out.println();
        }
    }

    //Search Product
    static void search_product(ArrayList<Product> products){
        int id;
        System.out.print("Enter product id: ");
        id = sc.nextInt();
        for(Product p : products){
            if(p.id == id){
                System.out.println("Product Found");
                System.out.println("Name: " + p.name);
                System.out.println("Quantity: " + p.quantity);
                System.out.println("Price: " + p.price);
                return;
            }
        }
        System.out.println("Product not found");
    }

    //Update Quantity
    static void update_quantity(ArrayList<Product> products){
        int id,qty;
        System.out.print("Enter product id and new quantity: ");
        id = sc.nextInt();
        qty = sc.nextInt();
        for(int i = 0;i < products.size();i++){
            if(products.get(i).id == id){
                products.get(i).quantity = qty;
                System.out.println("Quantity updated");
                return;
            }
        }
        System.out.println("Product not found");
    }

    //Menu
    static void menu(){
        System.out.println("\n1. Add Product");
        System.out.println("2. Display Products");
        System.out.println("3. Search Product");
        System.out.println("4. Update Quantity");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<Product>();
        int choice;
        do{
            menu();
            choice = sc.nextInt();
            switch(choice){
                case 1: add_product(products); break;
                case 2: display_products(products); break;
                case 3: search_product(products); break;
                case 4: update_quantity(products); break;
                case 5: System.out.println("Program ended"); break;
                default: System.out.println("Invalid choice");
            }
        }while(choice != 5);
        sc.close();
    }
}

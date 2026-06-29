#include <bits/stdc++.h>
using namespace std;

struct Product{
    int id;
    string name;
    int quantity;
    double price;
};

//Add Product
void add_product(vector<Product> &products){
    Product p;
    cout << "Enter product id: ";
    cin >> p.id;
    cin.ignore();
    cout << "Enter product name: ";
    getline(cin,p.name);
    cout << "Enter quantity: ";
    cin >> p.quantity;
    cout << "Enter price: ";
    cin >> p.price;
    products.push_back(p);
}

//Display Products
void display_products(vector<Product> &products){
    if(products.size() == 0){
        cout << "No products available" << endl;
        return;
    }
    for(Product p : products){
        cout << "ID: " << p.id << endl;
        cout << "Name: " << p.name << endl;
        cout << "Quantity: " << p.quantity << endl;
        cout << "Price: " << p.price << endl << endl;
    }
}

//Search Product
void search_product(vector<Product> &products){
    int id;
    cout << "Enter product id: ";
    cin >> id;
    for(Product p : products){
        if(p.id == id){
            cout << "Product Found" << endl;
            cout << "Name: " << p.name << endl;
            cout << "Quantity: " << p.quantity << endl;
            cout << "Price: " << p.price << endl;
            return;
        }
    }
    cout << "Product not found" << endl;
}

//Update Quantity
void update_quantity(vector<Product> &products){
    int id,qty;
    cout << "Enter product id and new quantity: ";
    cin >> id >> qty;
    for(int i = 0;i < products.size();i++){
        if(products[i].id == id){
            products[i].quantity = qty;
            cout << "Quantity updated" << endl;
            return;
        }
    }
    cout << "Product not found" << endl;
}

//Menu
void menu(){
    cout << "\n1. Add Product" << endl;
    cout << "2. Display Products" << endl;
    cout << "3. Search Product" << endl;
    cout << "4. Update Quantity" << endl;
    cout << "5. Exit" << endl;
    cout << "Enter your choice: ";
}

int main(){
    vector<Product> products;
    int choice;
    do{
        menu();
        cin >> choice;
        switch(choice){
            case 1: add_product(products); break;
            case 2: display_products(products); break;
            case 3: search_product(products); break;
            case 4: update_quantity(products); break;
            case 5: cout << "Program ended" << endl; break;
            default: cout << "Invalid choice" << endl;
        }
    }while(choice != 5);
    return 0;
}

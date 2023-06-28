package ApplicationShopProduct;

import java.util.Scanner;

public class MainApp {
    static Scanner sc1=new Scanner(System.in);
    static BLlclass bl=new BLlclass();
    public static void main(String[] args) {
        boolean status=true;
        do {
            System.out.println("1:add shop details");
            System.out.println("2:display shop");
            System.out.println("3:display product in shop");
            System.out.println("4:remove product from shop");
            System.out.println("5:update product in shop");

            System.out.println("6:exit");

            int choice = sc1.nextInt();
            switch (choice) {
                case 1:
                    addshopDetails();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    displayProductsInShop();
                    break;
                case 4:
                    removeProductFromShop();
                    break;
                case 5:
                    updateProductInShop();
                    break;
                case 6:

                    status = false;
                    break;

            }
        }while(status);
    }

    private static void display() {
        bl.displaySop();
    }

    public static void addshopDetails()
    {
        System.out.println("enter shop id");
        int id=sc1.nextInt();
        System.out.println("enter shop name");
        String name=sc1.next();
        System.out.println("enter shop type");
        String type=sc1.next();
        Shop s1=new Shop();
        s1.setShopId(id);
        s1.setShopName(name);
        s1.setShopType(type);
        boolean status=true;
        while (status) {
            System.out.println("1:add product");
            System.out.println("2:save details");
            System.out.println("3:exit");
            int c = sc1.nextInt();
            switch (c) {
                case 1:
                    s1.setProductlist(addProduct());
                    break;
                case 2:
                    status = false;

                    break;
                default:
                    System.out.println("invalid");


            }
        } bl.addShopData(s1);


    }
    public static Product addProduct(){
        System.out.println("enter productid");
        int pid=sc1.nextInt();
        System.out.println("enter product name");
        String name=sc1.next();
        System.out.println("enter product price");
        double price=sc1.nextDouble();
        Product p=new Product(pid,name,price);
        return p;
    }
    private static void displayProductsInShop() {
        System.out.println("Enter shop name:");
        String shopName = sc1.next();
        bl.displayProductsInShop(shopName);
    }

    private static void removeProductFromShop() {
        System.out.println("Enter shop name:");
        String shopName = sc1.next();
        System.out.println("Enter product name:");
        String productName = sc1.next();
        bl.removeProductFromShop(shopName, productName);
    }

    private static void updateProductInShop() {
        System.out.println("Enter shop name:");
        String shopName = sc1.next();
        System.out.println("Enter product name:");
        String productName = sc1.next();
        System.out.println("Enter new price:");
        double newPrice = sc1.nextDouble();
        bl.updateProductInShop(shopName, productName, newPrice);
    }

}

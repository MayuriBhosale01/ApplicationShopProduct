package ApplicationShopProduct;

import java.util.ArrayList;
import java.util.List;

public class BLlclass {
    private static List<Shop>shopList=new ArrayList<>();
    public void addShopData(Shop s) {
        shopList.add(s);
    }
    public void displaySop(){

        for (Shop s:shopList)
        {
            System.out.println(s.getShopName()+" "+s.getProductlist());

        }
    }

    public void displayProductsInShop(String shopName) {
        for (Shop s: shopList) {
            if (s.getShopName().equals(shopName)) {
                List<Product> productList = s.getProductlist();
                System.out.println("Products in "+shopName+":");
                for (Product p: productList) {
                    System.out.println(p.getProductName()+" "+p.getProductPrice());
                }
                return;
            }
        }
        System.out.println("Shop not found!");

    }

    public void removeProductFromShop(String shopName, String productName) {
        for (Shop s: shopList) {
            if (s.getShopName().equals(shopName)) {
                List<Product> productList = s.getProductlist();
                for (Product p: productList) {
                    if (p.getProductName().equals(productName)) {
                        productList.remove(p);
                        System.out.println(productName+" removed from "+shopName);
                        return;
                    }
                }
                System.out.println(productName+" not found in "+shopName);
                return;
            }
        }
        System.out.println("Shop not found!");
    }

    public void updateProductInShop(String shopName, String productName, double newPrice) {
        for (Shop s: shopList) {
            if (s.getShopName().equals(shopName)) {
                List<Product> productList = s.getProductlist();
                for (Product p: productList) {
                    if (p.getProductName().equals(productName)) {
                        p.setProductPrice(newPrice);
                        System.out.println(productName+" in "+shopName+" updated with new price "+newPrice);
                        return;
                    }
                }
                System.out.println(productName+" not found in "+shopName);
                return;
            }
        }
        System.out.println("Shop not found!");
    }



}

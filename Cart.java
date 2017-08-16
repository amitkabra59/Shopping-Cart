/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Amit
 */

class Cart {

    List<Product> cartItems = new ArrayList<Product>();
    
    public void addProductToCartByPID(int pid) {
        Product product = getProductByProductID(pid);
        addToCart(product);
    }

    private Product getProductByProductID(int pid) {
        Product product = null;
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            if (prod.getPid() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }

    private void addToCart(Product product) {
        cartItems.add(product);
    }

    public void removeProductByPID(int pid) {
        Product prod = getProductByProductID(pid);
        cartItems.remove(prod);
    }

    void printCartItems() {
        for (Product prod: cartItems) {
            System.out.println(prod.getName());
        }
    }
    
}

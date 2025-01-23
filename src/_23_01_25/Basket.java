package _23_01_25;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Product> products;

    public Basket(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                '}';
    }
}

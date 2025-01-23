package _23_01_25;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("apple", 9.99, 4.7);
        Product product2 = new Product("banana", 7.99, 4.2);
        Product product3 = new Product("kiwi", 12.99, 5.0);
        Product product4 = new Product("table", 99.99, 4.1);
        Product product5 = new Product("chair", 79.99, 3.6);
        Product product6 = new Product("fridge", 199.99, 4.5);

        ArrayList<Product> food = new ArrayList<>();
        ArrayList<Product> furniture = new ArrayList<>();

        food.add(product1);
        food.add(product2);
        food.add(product3);

        furniture.add(product4);
        furniture.add(product5);
        furniture.add(product6);

        Category category1 = new Category("food", food);
        Category category2 = new Category("furniture", furniture);

        ArrayList<Product> buyingProducts = new ArrayList<>();
        buyingProducts.add(product1);
        buyingProducts.add(product2);
        buyingProducts.add(product5);
        buyingProducts.add(product6);

        Basket basket = new Basket(buyingProducts);

        User user1 = new User("Ivan", "Ivanov", basket);

        System.out.println(user1.toString());
        System.out.println(user1.getSum(basket));
        System.out.println(user1.getRating(basket));
    }
}

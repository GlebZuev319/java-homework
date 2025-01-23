package _23_01_25;

import java.net.PasswordAuthentication;

public class User {

    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }

    public double getSum(Basket basket){
        double Sum = 0;
        for(Product p : basket.getProducts()){
            Sum += p.getPrice();
        }
        return Sum;
    }

    public double getRating(Basket basket){
        double rating = 0;
        int count = 0;

        for (Product p : basket.getProducts()){
            count++;
            rating += p.getRating();
        }
        double averageRating = rating/count;
        return averageRating;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }
}

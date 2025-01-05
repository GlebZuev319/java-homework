package _19_12_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import _19_12_2024.E6.*;

public class Q1 {
    public static void main(String[] args) {
        /**
         *
         */
        String privilege1 = "Organization";
        String privilege2 = "Control";
        String privilege3 = "Moderatoring";

        List<String> privilegies1 = new ArrayList<>();
        List<String> privilegies2 = new ArrayList<>();

        privilegies1.add(privilege1);
        privilegies1.add(privilege2);
        privilegies1.add(privilege3);

        privilegies2.add(privilege2);
        privilegies2.add(privilege3);

        Admin admin1 = new Admin(1, "Ivanov Ivan", "wgegwrrhgw@elfef.com", privilegies1);
        Admin admin2 = new Admin(2, "Petrov Piotr", "thgedfghhjt@htyjuk.com", privilegies2);

        E6.Product product1 = new Product(1, "car", 50000);
        E6.Product product2 = new Product(2, "pen", 10);
        E6.Product product3 = new Product(3, "apple", 20);
        E6.Product product4 = new Product(4, "computer", 5000);
        E6.Product product5 = new Product(5, "phone", 2000);
        E6.Product product6 = new Product(6, "headphones", 400);
        E6.Product product7 = new Product(7, "fridge", 1000);
        E6.Product product8 = new Product(8, "Televisor", 3500);

        List<Product> products1 = new ArrayList<>();
        List<Product> products2 = new ArrayList<>();
        List<Product> products3 = new ArrayList<>();
        List<Product> products4 = new ArrayList<>();
        List<Product> products5 = new ArrayList<>();
        List<Product> products6 = new ArrayList<>();
        List<Product> products7 = new ArrayList<>();

        products1.add(product1);
        products1.add(product3);
        products1.add(product7);

        products2.add(product2);
        products2.add(product3);
        products2.add(product4);
        products2.add(product6);
        products2.add(product8);

        products4.add(product1);
        products4.add(product3);
        products4.add(product4);
        products4.add(product5);

        products5.add(product8);

        products6.add(product6);
        products6.add(product7);
        products6.add(product8);

        products7.add(product1);
        products7.add(product2);

        double totalAmount1 = 0.0;
        double totalAmount2 = 0.0;
        double totalAmount3 = 0.0;
        double totalAmount4 = 0.0;
        double totalAmount5 = 0.0;
        double totalAmount6 = 0.0;
        double totalAmount7 = 0.0;

        Order order1 = new Order(1, products1, totalAmount1);
        Order order2 = new Order(2, products2, totalAmount2);
        Order order3 = new Order(3, products3, totalAmount3);
        Order order4 = new Order(4, products4, totalAmount4);
        Order order5 = new Order(5, products5, totalAmount5);
        Order order6 = new Order(6, products6, totalAmount6);
        Order order7 = new Order(7, products7, totalAmount7);

        totalAmount1 = order1.calculateTotalAmount();
        totalAmount2 = order2.calculateTotalAmount();
        totalAmount3 = order3.calculateTotalAmount();
        totalAmount4 = order4.calculateTotalAmount();
        totalAmount5 = order5.calculateTotalAmount();
        totalAmount6 = order6.calculateTotalAmount();
        totalAmount7 = order7.calculateTotalAmount();

        List<Order> orderList1 = new ArrayList<>();
        List<Order> orderList2 = new ArrayList<>();
        List<Order> orderList3 = new ArrayList<>();
        List<Order> orderList4 = new ArrayList<>();
        List<Order> orderList5 = new ArrayList<>();

        orderList1.add(order1);
        orderList1.add(order2);

        orderList2.add(order6);
        orderList2.add(order7);

        orderList4.add(order2);
        orderList4.add(order4);
        orderList4.add(order7);

        orderList5.add(order5);

        Customer customer1 = new Customer(3, "Fiodorov Fiodor", "fegfeeffe@mail.ru", orderList1);
        Customer customer2 = new Customer(4, "Maksimov Maksim", "gws24sf@gmail.com", orderList2);
        Customer customer3 = new Customer(5, "Egorov Egor", "grghvs@mail.ru", orderList3);
        Customer customer4 = new Customer(6, "Alekseev Aleksei", "grgm234@gmail.com", orderList4);
        Customer customer5 = new Customer(7, "Sergeev Sergei", "rj41g95h5@yandex.ru", orderList5);

        List<User> users = new ArrayList<>();

        users.add(admin1);
        users.add(admin2);
        users.add(customer1);
        users.add(customer2);
        users.add(customer3);
        users.add(customer4);
        users.add(customer5);

        List<Order> orders = new ArrayList<>();

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        orders.add(order7);

        ECommerceSystem CommerceSystem = new ECommerceSystem(users, orders);

        getUserUsernames(CommerceSystem.users.toArray(new User[0])); //Q1.1

        List<Admin> admins = new ArrayList<>();

        admins.add(admin1);
        admins.add(admin2);

        getAdminPrivilegies(admins.toArray(new Admin[0])); // Q1.2

        List<Customer> customers = new ArrayList<>();

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        getOrdersTotalAmount(customers.toArray(new Customer[0])); //Q1.3

        getOrdersTotalPrice(CommerceSystem.orders.toArray(new Order[0])); //Q1.4

        List<Product> products = new ArrayList<>();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);

        getProductNames(products.toArray(new Product[0])); //Q1.5

        getOrdersIdAndTotalPrice(CommerceSystem.orders.toArray(new Order[0])); //Q1.6

        usersToAdmins(CommerceSystem.users.toArray(new User[0])); //Q1.7

        productWithMaxPrice(products.toArray(new Product[0])); //Q1.8

        ordersWithMinTotalPrice(CommerceSystem.orders.toArray(new Order[0])); //Q1.9

        customersWithNoOrders(customers.toArray(new Customer[0]));
    }

/**
 * 1. Напишите метод, который принимает массив объектов "User" (!!!! классы из E6 берем за основу) и выводит их имена в консоль.
 */

        public static void getUserUsernames(User[] users){
            for (User user : users) {
                System.out.println(user.username);
            }
        }

/**
 * 2. Напишите метод, который принимает массив объектов "Admin" и возвращает список всех привилегий.
 */

        public static void getAdminPrivilegies(Admin[] admins){
            for (Admin admin : admins){
                System.out.println(admin.getPrivilegies());
            }
        }

/**
 * 3. Напишите метод, который принимает массив объектов "Customer" и подсчитывает общее количество заказов у всех клиентов.
 */

        public static void getOrdersTotalAmount(Customer[] customers){
            int OrdersTotalAmount = 0;
            for (Customer customer : customers){
                OrdersTotalAmount += customer.getOrders().toArray().length;
            }
            System.out.println(OrdersTotalAmount);
        }

/**
 * 4. Напишите метод, который принимает массив объектов "Order" и возвращает общую сумму всех заказов.
 */

        public static void getOrdersTotalPrice(Order[] orders){
            int ordersTotalPrice = 0;
            for (Order order : orders){
                ordersTotalPrice += order.getTotalAmount();
            }
            System.out.println(ordersTotalPrice);
        }

/**
 * 5. Напишите метод, который принимает массив объектов "Product" и возвращает массив названий всех продуктов.
 */

        public static void getProductNames(Product[] products){
            for(Product product : products){
                System.out.println(product.name);
            }
        }

/**
 * 6. Напишите метод, который принимает массив объектов "Order" и выводит в консоль идентификатор каждого заказа и его общую сумму.
 */

        public static void getOrdersIdAndTotalPrice(Order[] orders){
            for (Order order : orders){
                System.out.println(order.orderId);
                System.out.println(order.totalAmount);
            }
        }

/**
 * 7. Напишите метод, который принимает массив объектов "User" и возвращает массив объектов "Admin" (используйте проверку типа).
 */

        public static void usersToAdmins(User[] users){
            List<Admin> admins = new ArrayList<>();
            for (User user : users){
                if("Admin".equals(user.getUserRole())){
                    admins.add((Admin) user);
                }
            }
            Admin[] admins1 = new Admin[admins.size()];
            admins1 = admins.toArray(admins1);
            System.out.println(Arrays.toString(admins1));
        }


/**
 * 8. Напишите метод, который принимает массив объектов "Product" и возвращает продукт с максимальной ценой.
 */

        public static void productWithMaxPrice(Product[] products){
            double max = 0.0;
            for (Product product : products){
                if(product.getPrice() > max){
                    max = product.getPrice();
                }
            }
            for (Product product : products){
                if(product.getPrice() == max){
                    System.out.println(product);
                }
            }
        }

/**
 * 9. Напишите метод, который принимает массив объектов "Order" и возвращает массив заказов, общая сумма которых превышает заданное значение.
 */

        public static void ordersWithMinTotalPrice(Order[] orders){
            double min = 50000;
            for (Order order : orders){
                if(order.totalAmount > min){
                    System.out.println(order);
                }
            }
        }

/**
 * 10. Напишите метод, который принимает массив объектов "Customer" и возвращает список клиентов, у которых нет ни одного заказа.
 */

        public static void customersWithNoOrders(Customer[] customers){
            List<Customer> customers1 = new ArrayList<>();
            for (Customer customer : customers){
                if (customer.getOrders().isEmpty()){
                    customers1.add(customer);
                }
            }
            System.out.println(customers1);
        }
}
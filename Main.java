import _19_12_2024.*;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /** E2
         * В основном классе создайте несколько объектов "Product", "Customer" и "Order".
         * Проверьте работу всех методов, выводя информацию в консоль.
         */

//        E2.Product product1 = new E2.Product(1, "table", 99.99, "good table", true);
//        E2.Product product2 = new E2.Product(2, "chair", 49.99, "good chair", false);
//        E2.Product product3 = new E2.Product(3, "sofa", 499.99, "good sofa", true);
//
//        System.out.println(product1);
//        System.out.println(product2);
//        System.out.println(product3);
//
//        E2.Customer customer1 = new E2.Customer(1, "John", "Lake", "JohnLake@gmail.com", "699-69-59");
//        E2.Customer customer2 = new E2.Customer(2, "Jeff", "Miller", "JeffMiller@gmail.com", "487-21-14");
//
//        System.out.println(customer1);
//        System.out.println(customer2);
//
//        ArrayList<E2.Product> productList1 = new ArrayList<>();
//        productList1.add(product1);
//        productList1.add(product3);
//
//        ArrayList<E2.Product> productList2 = new ArrayList<>();
//        productList2.add(product2);
//        productList2.add(product3);
//
//        E2.Order order1 = new E2.Order(1, customer1, productList1, 10.5);
//        E2.Order order2 = new E2.Order(2, customer2, productList2, 48.75);
//
//        System.out.println(order1);
//        System.out.println(order2);

        /** E3
         В основном классе:
         * Создайте несколько объектов "Category", "Product", "Customer", "Address", "OrderStatus" и "Order".
         * Реализуйте сценарий, где создаётся заказ с несколькими продуктами, устанавливается статус, добавляются адреса клиента.
         * Выведите в консоль подробную информацию о заказе, включая финальную стоимость и статус.
         */

//        E3.Category category1 = new E3.Category(1, "food", "something that people can eat");
//        E3.Category category2 = new E3.Category(2, "hygiene", "something that people use for personal hygiene");
//        E3.Category category3 = new E3.Category(3, "cloth", "something that people can wear");
//
//        E2.Product product1 = new E2.Product(1, "pizza", 249.99, "open pie filled with a mixture of various products and herbs", true, category1, 15.0);
//        E2.Product product2 = new E2.Product(2, "shower gel", 29.99, "liquid products used for body wash", false, category2, 0.0);
//        E2.Product product3 = new E2.Product(3, "scarf", 389.99, "A strip of fabric (or knitted) to be worn around the neck.", true, category3, 30.0);
//        E2.Product product4 = new E2.Product(4, "deodorant", 19.99, "Means for eliminating unpleasant odors.", true, category2, 20.0);
//        E2.Product product5 = new E2.Product(5, "champignons", 99.99, "genus of lamellar mushrooms of the champignon family", true, category1, 0.0);
//        E2.Product product6 = new E2.Product(6, "coat", 799.99, "Outerwear, usually below the knees.", false, category3, 40.0);
//
//        E2.Customer customer1 = new E2.Customer(1, "Henry", "Huffer", "Henry222@gmail.com", "958-39-44", addresses1);
//        E2.Customer customer2 = new E2.Customer(2, "Dan", "Herbaut", "DanHerbaut@gmail.com", "741-85-96");
//
//        List<E3.Address> addresses1 = new ArrayList<>();
//        addresses1.add(new E3.Address("125, Astrid-Lindgren-Allee", "Cologne", "51109", "Germany"));

        /** E4
         * В основном классе создайте несколько объектов классов "Person", "Employee" и "Manager".
         * Проверьте работу всех методов, включая наследование, и выведите информацию в консоль.
         */

//        E4.Person person1 = new E4.Person(1, "Jake Torfin", "MrTorfin@gmail.com");
//        E4.Person person2 = new E4.Person(2, "Joe Lade", "JoeLade@gmail.com");
//
//        E4.Employee employee1 = new E4.Employee(3, "Ivanov Ivan", "Ivanov246@gmail.com", "lawyer", 1825.75);
//        E4.Employee employee2 = new E4.Employee(4, "Petrov Piotr", "Petrov357@gmail.com", "Developer", 2350.50);
//        E4.Employee employee3 = new E4.Employee(5, "Fiodorov Fiodor", "Fiodorov468@gmail.com", "Economist", 2000.0);
//
//        E4.Manager manager1 = new E4.Manager(6, "Tayler Birds", "AngryBirds579@gmail.com", "first manager", 3000.0, 10, 600);
//        E4.Manager manager2 = new E4.Manager(7, "Jacob Monarch", "JacobsMonarch777@gmail.com", "second manager", 3000.0, 6, 360);
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(employee1);
//        System.out.println(employee2);
//        System.out.println(employee3);
//        System.out.println(manager1);
//        System.out.println(manager2);

        /** E5
         * В основном классе создайте:
         * Несколько объектов "SavingsAccount" и "CheckingAccount" с различными параметрами
         * Объект "Bank" и добавьте в него созданные аккаунты
         * Проверьте работу всех методов, включая переопределение, операции снятия, пополнения, начисления процентов и перерасхода
         * Выведите информацию о банке и его аккаунтах в консоль
         */

//        E5.SavingsAccount saveAccount1 = new E5.SavingsAccount(1, "Richard Zender", 1500.00, 6);
//        E5.SavingsAccount saveAccount2 = new E5.SavingsAccount(2, "John Doe", 2000.00, 4);
//        E5.SavingsAccount saveAccount3 = new E5.SavingsAccount(3, "Jane Doe", 2500.00, 3);
//
//        E5.CheckingAccount checkAccount1 = new E5.CheckingAccount(4, "Ivanov Ivan", 1000.00, 600);
//        E5.CheckingAccount checkAccount2 = new E5.CheckingAccount(5, "Petrov Piotr", 2000.00, 450);
//        E5.CheckingAccount checkAccount3 = new E5.CheckingAccount(6, "Fiodorov Fiodor", 3000.00, 1000);
//
//        ArrayList<E5.Account> accounts = new ArrayList<>();
//
//        E5.Bank Bank = new E5.Bank("MyBank", accounts);
//
//        Bank.addAccount(saveAccount1);
//        Bank.addAccount(saveAccount2);
//        Bank.addAccount(saveAccount3);
//        Bank.addAccount(checkAccount1);
//        Bank.addAccount(checkAccount2);
//        Bank.addAccount(checkAccount3);
//
//        System.out.println(Bank);
//
//        System.out.println(Bank.getAccountById(5));
//        System.out.println(Bank.getAccountById(2));
//
//        System.out.println(Bank.calculateTotalBalance());
//
//        int amount1 = 1950;
//        int amount2 = 2200;
//
//        saveAccount1.withdraw(amount1);
//        System.out.println(saveAccount1.getBalance());
//        saveAccount2.withdraw(amount1);
//        System.out.println(saveAccount2.getBalance());
//        saveAccount3.withdraw(amount1);
//        System.out.println(saveAccount3.getBalance());
//
//        checkAccount1.withdraw(amount2);
//        System.out.println(checkAccount1.getBalance());
//        checkAccount2.withdraw(amount2);
//        System.out.println(checkAccount2.getBalance());
//        checkAccount3.withdraw(amount2);
//        System.out.println(checkAccount3.getBalance());
//
//        saveAccount1.deposit(amount1);
//        checkAccount2.deposit(amount2);
//
//        System.out.println(saveAccount1.getBalance());
//        System.out.println(checkAccount2.getBalance());
//
//        saveAccount1.applyInterest();
//        saveAccount2.applyInterest();
//        saveAccount3.applyInterest();
//
//        System.out.println(saveAccount1.getBalance());
//        System.out.println(saveAccount2.getBalance());
//        System.out.println(saveAccount3.getBalance());

        /** E6
         * В основном классе создайте:
         * Несколько объектов "Admin" и "Customer"
         * Несколько объектов "Order" и "Product"
         * Объект "ECommerceSystem", добавьте в него пользователей и заказы
         * Проверьте работу всех методов, включая наследование, пересчёты, фильтрацию и отображение данных
         * Выведите в консоль общую информацию о системе
         */

//        String privilege1 = "Organization";
//        String privilege2 = "Control";
//        String privilege3 = "Moderatoring";
//
//        List<String> privilegies1 = new ArrayList<>();
//        List<String> privilegies2 = new ArrayList<>();
//
//        privilegies1.add(privilege1);
//        privilegies1.add(privilege2);
//        privilegies1.add(privilege3);
//
//        privilegies2.add(privilege2);
//        privilegies2.add(privilege3);
//
//        E6.Admin admin1 = new E6.Admin(1, "Ivanov Ivan", "wgegwrrhgw@elfef.com", privilegies1);
//        E6.Admin admin2 = new E6.Admin(2, "Petrov Piotr", "thgedfghhjt@htyjuk.com", privilegies2);
//
//        E6.Product product1 = new E6.Product(1, "car", 50000);
//        E6.Product product2 = new E6.Product(2, "pen", 10);
//        E6.Product product3 = new E6.Product(3, "apple", 20);
//        E6.Product product4 = new E6.Product(4, "computer", 5000);
//        E6.Product product5 = new E6.Product(5, "phone", 2000);
//        E6.Product product6 = new E6.Product(6, "headphones", 400);
//        E6.Product product7 = new E6.Product(7, "fridge", 1000);
//        E6.Product product8 = new E6.Product(8, "Televisor", 3500);
//
//        List<E6.Product> products1 = new ArrayList<>();
//        List<E6.Product> products2 = new ArrayList<>();
//        List<E6.Product> products3 = new ArrayList<>();
//        List<E6.Product> products4 = new ArrayList<>();
//        List<E6.Product> products5 = new ArrayList<>();
//        List<E6.Product> products6 = new ArrayList<>();
//        List<E6.Product> products7 = new ArrayList<>();
//
//        products1.add(product1);
//        products1.add(product3);
//        products1.add(product7);
//
//        products2.add(product2);
//        products2.add(product3);
//        products2.add(product4);
//        products2.add(product6);
//        products2.add(product8);
//
//        products4.add(product1);
//        products4.add(product3);
//        products4.add(product4);
//        products4.add(product5);
//
//        products5.add(product8);
//
//        products6.add(product6);
//        products6.add(product7);
//        products6.add(product8);
//
//        products7.add(product1);
//        products7.add(product2);
//
//        double totalAmount1 = 0.0;
//        double totalAmount2 = 0.0;
//        double totalAmount3 = 0.0;
//        double totalAmount4 = 0.0;
//        double totalAmount5 = 0.0;
//        double totalAmount6 = 0.0;
//        double totalAmount7 = 0.0;
//
//        E6.Order order1 = new E6.Order(1, products1, totalAmount1);
//        E6.Order order2 = new E6.Order(2, products2, totalAmount2);
//        E6.Order order3 = new E6.Order(3, products3, totalAmount3);
//        E6.Order order4 = new E6.Order(4, products4, totalAmount4);
//        E6.Order order5 = new E6.Order(5, products5, totalAmount5);
//        E6.Order order6 = new E6.Order(6, products6, totalAmount6);
//        E6.Order order7 = new E6.Order(7, products7, totalAmount7);
//
//        totalAmount1 = order1.calculateTotalAmount();
//        totalAmount2 = order2.calculateTotalAmount();
//        totalAmount3 = order3.calculateTotalAmount();
//        totalAmount4 = order4.calculateTotalAmount();
//        totalAmount5 = order5.calculateTotalAmount();
//        totalAmount6 = order6.calculateTotalAmount();
//        totalAmount7 = order7.calculateTotalAmount();
//
//        List<E6.Order> orderList1 = new ArrayList<>();
//        List<E6.Order> orderList2 = new ArrayList<>();
//        List<E6.Order> orderList3 = new ArrayList<>();
//        List<E6.Order> orderList4 = new ArrayList<>();
//        List<E6.Order> orderList5 = new ArrayList<>();
//
//        orderList1.add(order1);
//        orderList1.add(order2);
//
//        orderList2.add(order6);
//        orderList2.add(order7);
//
//        orderList4.add(order2);
//        orderList4.add(order4);
//        orderList4.add(order7);
//
//        orderList5.add(order5);
//
//        E6.Customer customer1 = new E6.Customer(3, "Fiodorov Fiodor", "fegfeeffe@mail.ru", orderList1);
//        E6.Customer customer2 = new E6.Customer(4, "Maksimov Maksim", "gws24sf@gmail.com", orderList1);
//        E6.Customer customer3 = new E6.Customer(5, "Egorov Egor", "grghvs@mail.ru", orderList3);
//        E6.Customer customer4 = new E6.Customer(6, "Alekseev Aleksei", "grgm234@gmail.com", orderList1);
//        E6.Customer customer5 = new E6.Customer(7, "Sergeev Sergei", "rj41g95h5@yandex.ru", orderList1);
//
//        List<E6.User> users = new ArrayList<>();
//
//        users.add(admin1);
//        users.add(admin2);
//        users.add(customer1);
//        users.add(customer2);
//        users.add(customer3);
//        users.add(customer4);
//        users.add(customer5);
//
//        List<E6.Order> orders = new ArrayList<>();
//
//        orders.add(order1);
//        orders.add(order2);
//        orders.add(order3);
//        orders.add(order4);
//        orders.add(order5);
//        orders.add(order6);
//        orders.add(order7);
//
//        E6.ECommerceSystem CommerceSystem = new E6.ECommerceSystem(users, orders);
//
//        System.out.println(admin2.getUserRole());
//        System.out.println(customer5.getUserRole());
//
//        System.out.println(customer3);
//        System.out.println(customer4);
//
//        System.out.println(admin1);
//        System.out.println(admin2);
//
//        System.out.println(orderList1);
//        System.out.println(orderList3);
//
//        System.out.println(order2);
//        System.out.println(order7);
//
//        System.out.println(product1);
//        System.out.println(product4);
//
//        System.out.println(CommerceSystem.getAllAdmins());
//
//        System.out.println(CommerceSystem.getAllCustomersWithOrders());
//
//        System.out.println(CommerceSystem.calculateTotalRevenue());
//
//        System.out.println(CommerceSystem);


    }
}
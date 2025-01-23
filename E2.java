package _19_12_2024;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class E2 {
    /** 1. Создайте класс "Product" с полями:
    *    - id (уникальный идентификатор, тип int)
    *    - name (название продукта, тип String)
    *    - price (цена, тип double)
    *    - description (описание продукта, тип String)
    *    - inStock (наличие на складе, тип boolean)
    **/

    /** 2. Добавьте в класс "Product":
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для каждого поля
     *    - Метод toString для представления объекта в строковом виде
     **/

    public static class Product{

        int id;
        String name;
        double price;
        String description;
        boolean inStock;
        E3.Category category;
        double discount;

        public Product(){
            this.id = 0;
            this.name = "";
            this.price = 0.0;
            this.description = "";
            this.inStock = false;
            this.category = new E3.Category();
            this.discount = 0.0;
        }

        public Product(int id, String name, double price, String description, boolean inStock, E3.Category category, double discount) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.description = description;
            this.inStock = inStock;
            this.category = category;
            this.discount = discount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isInStock() {
            return inStock;
        }

        public void setInStock(boolean inStock) {
            this.inStock = inStock;
        }

        public E3.Category getCategory(){
            return category;
        }

        public void setCategory(E3.Category category){
            this.category = category;
        }

        public double getDiscount(){
            return discount;
        }

        public void setDiscount(double Discount){
            this.discount = discount;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", description='" + description + '\'' +
                    ", inStock=" + inStock +
                    ", category=" + category +
                    ", discount=" + discount +
                    '}';
        }

        public static double calculateFinalPrice(double price, double discount){
            return price*(1-discount/100);
        }
    }

    /** 3. Создайте класс "Customer" с полями:
    *    - id (уникальный идентификатор, тип int)
    *    - firstName (имя клиента, тип String)
    *    - lastName (фамилия клиента, тип String)
    *    - email (электронная почта клиента, тип String)
    *    - phoneNumber (номер телефона, тип String)
    **/

    /** 4. Добавьте в класс "Customer":
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для каждого поля
     *    - Метод toString для представления объекта в строковом виде
     **/

    public static class Customer{

        int id;
        String firstName;
        String lastName;
        String email;
        String phoneNumber;
        List<E3.Address> addresses;

        Customer(){
            this.id = 0;
            this.firstName = "";
            this.lastName = "";
            this.email = "";
            this.phoneNumber = "";
            this.addresses = new ArrayList<>();
        }

        public Customer(int id, String firstName, String lastName, String email, String phoneNumber) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.addresses = addresses;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public List<E3.Address> getAddresses() {
            return addresses;
        }

        public void setAddresses(List<E3.Address> addresses) {
            this.addresses = addresses;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", addresses=" + addresses +
                    '}';
        }

        public void addAddress(E3.Address address){
            this.addresses.add(address);
        }
    }

    /** 5. Создайте класс "Order" с полями:
    *    - id (уникальный идентификатор заказа, тип int)
    *    - customer (объект класса Customer)
    *    - productList (список продуктов, тип List<Product>)
    *    - totalAmount (общая сумма заказа, тип double)
    **/

    /** 6. Добавьте в класс "Order":
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для каждого поля
     *    - Метод toString для представления объекта в строковом виде
     **/

    public static class Order {

        int id;
        Customer customer;
        List<Product> productList;
        double totalAmount;
        E3.OrderStatus order;
        LocalDate orderDate;

        Order(){
            this.id = 0;
            this.customer = new Customer();
            this.productList = new ArrayList<>();
            this.totalAmount = 0.0;
            this.order = new E3.OrderStatus();
            this.orderDate = LocalDate.now();
        }

        public Order(int id, Customer customer, List<Product> productList, double totalAmount) {
            this.id = id;
            this.customer = customer;
            this.productList = productList;
            this.totalAmount = totalAmount;
            this.order = order;
            this.orderDate = orderDate;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public List<Product> getProductList() {
            return productList;
        }

        public void setProductList(List<Product> productList) {
            this.productList = productList;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
        }

        public E3.OrderStatus getOrder() {
            return order;
        }

        public void setOrder(E3.OrderStatus order) {
            this.order = order;
        }

        public LocalDate getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(LocalDate orderDate) {
            this.orderDate = orderDate;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "id=" + id +
                    ", customer=" + customer +
                    ", productList=" + productList +
                    ", totalAmount=" + totalAmount +
                    ", order=" + order +
                    ", orderDate=" + orderDate +
                    '}';
        }

        public double calculateTotalAmount(){
            for(Product product : productList){
                double realPrice = product.getPrice()*(1-product.getDiscount()/100);
                totalAmount = totalAmount+realPrice;
            }
            return totalAmount;
        }
    }
}
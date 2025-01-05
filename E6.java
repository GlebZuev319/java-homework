package _19_12_2024;

import java.util.ArrayList;
import java.util.List;

public class E6 {
    /**
     *
     *
     * 1. Создайте абстрактный базовый класс "User" с полями:
     *    - userId (уникальный идентификатор пользователя, тип int)
     *    - username (имя пользователя, тип String)
     *    - email (электронная почта, тип String)
     */

     /**   Добавьте:
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для всех полей
     *    - Абстрактный метод getUserRole(), который возвращает роль пользователя (тип String)
     *    - Метод toString для вывода информации о пользователе
     */

     public abstract static class User{

         int UserId;
         String username;
         String email;

         User(){
             this.UserId = 0;
             this.username = "";
             this.email = "";
         }

         public User(int userId, String username, String email) {
             UserId = userId;
             this.username = username;
             this.email = email;
         }

         public int getUserId(){
             return UserId;
         }

         public void setUserId(int UserId){
             this.UserId = UserId;
         }

         public String getUsername(){
             return username;
         }

         public void setUsername(String username){
             this.username = username;
         }

         public String email(){
             return email;
         }

         public void email(String email){
             this.email = email;
         }

         public abstract String getUserRole();

         @Override
         public String toString() {
             return "User{" +
                     "UserId=" + UserId +
                     ", username='" + username + '\'' +
                     ", email='" + email + '\'' +
                     '}';
         }
     }

     /** 2. Создайте класс "Admin", который наследуется от "User", и добавьте:
     *    - privileges (список привилегий, тип List<String>)
     */

     /**    Добавьте:
     *    - Конструктор с параметрами для всех полей, включая поля базового класса
     *    - Геттеры и сеттеры для списка привилегий
     *    - Реализацию метода getUserRole(), который возвращает "Admin"
     *    - Метод addPrivilege(String privilege), который добавляет новую привилегию
     *    - Метод toString, который дополнительно выводит список привилегий
     */

     public static class Admin extends User{

         List<String> privilegies;

         Admin(){
             super();
             this.privilegies = new ArrayList<>();
         }

         public Admin(int userId, String username, String email, List<String> privilegies) {
             super(userId, username, email);
             this.privilegies = privilegies;
         }

         public List<String> getPrivilegies(){
             return privilegies;
         }

         public void setPrivilegies(List<String> privilegies){
             this.privilegies = privilegies;
         }

         public String getUserRole() {
             return "Admin";
         }

         public void addPrivilege(String privilege){
             privilegies.add(privilege);
         }

         @Override
         public String toString() {
             return "Admin{" +
                     "UserId=" + UserId +
                     ", username='" + username + '\'' +
                     ", email='" + email + '\'' +
                     ", privilegies=" + privilegies +
                     '}';
         }
     }

     /** 3. Создайте класс "Customer", который наследуется от "User", и добавьте:
     *    - orders (список заказов, тип List<Order>)
     */

     /**    Добавьте:
     *    - Конструктор с параметрами для всех полей, включая поля базового класса
     *    - Геттеры и сеттеры для списка заказов
     *    - Реализацию метода getUserRole(), который возвращает "Customer"
     *    - Метод addOrder(Order order), который добавляет новый заказ в список
     *    - Метод toString, который дополнительно выводит количество заказов
     */

     public static class Customer extends User {

         List<Order> orders;

         Customer() {
             super();
             this.orders = new ArrayList<>();
         }

         public Customer(int userId, String username, String email, List<Order> orders) {
             super(userId, username, email);
             this.orders = orders;
         }

         public List<Order> getOrders() {
             return orders;
         }

         public void setOrders(List<Order> orders) {
             this.orders = orders;
         }

         public String getUserRole() {
             return "Customer";
         }

         public void addOrder(Order order) {
             orders.add(order);
         }

         @Override
         public String toString() {
             return "Customer{" +
                     "UserId=" + UserId +
                     ", username='" + username + '\'' +
                     ", email='" + email + '\'' +
                     ", orders=" + orders.size() +
                     '}';
         }
     }

     /** 4. Создайте класс "Order" с полями:
     *    - orderId (уникальный идентификатор заказа, тип int)
     *    - productList (список продуктов, тип List<Product>)
     *    - totalAmount (общая сумма заказа, тип double)
     */

     /**    Добавьте:
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для всех полей
     *    - Метод calculateTotalAmount(), который пересчитывает общую сумму заказа на основе продуктов
     *    - Метод toString для вывода информации о заказе
     */

     public static class Order{

         int orderId;
         List<Product> productList;
         double totalAmount;

         Order(){
             this.orderId = 0;
             this.productList = new ArrayList<>();
             this.totalAmount = 0.0;
         }

         public Order(int orderId, List<Product> productList, double totalAmount) {
             this.orderId = orderId;
             this.productList = productList;
             this.totalAmount = totalAmount;
         }

         public int getOrderId(){
             return orderId;
         }

         public void setOrderId(int orderId){
             this.orderId = orderId;
         }

         public List<Product> getProductList(){
             return productList;
         }

         public void SetProductList(List<Product> getProductList){
             this.productList = new ArrayList<>();
         }

         public double getTotalAmount(){
             return totalAmount;
         }

         public void setTotalAmount(double totalAmount){
             this.totalAmount = totalAmount;
         }

         public double calculateTotalAmount(){
             for(Product product : productList){
                 totalAmount += product.price;
             }
             return totalAmount;
         }

         @Override
         public String toString() {
             return "Order{" +
                     "orderId=" + orderId +
                     ", productList=" + productList +
                     ", totalAmount=" + totalAmount +
                     '}';
         }
     }

     /** 5. Создайте класс "Product" с полями:
     *    - productId (уникальный идентификатор продукта, тип int)
     *    - name (название продукта, тип String)
     *    - price (цена продукта, тип double)
     */

     /**    Добавьте:
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для всех полей
     *    - Метод toString для вывода информации о продукте
     */

     public static class Product{

         int productId;
         String name;
         double price;

         Product(){
             this.productId = 0;
             this.name = "";
             this.price = 0.0;
         }

         public Product(int productId, String name, double price) {
             this.productId = productId;
             this.name = name;
             this.price = price;
         }

         public int getProductId(){
             return productId;
         }

         public void setProductId(int productId){
             this.productId = productId;
         }

         public String getName(){
             return name;
         }

         public void setName(String name){
             this.name = name;
         }

         public double getPrice(){
             return price;
         }

         public void setPrice(double price){
             this.price = price;
         }

         @Override
         public String toString() {
             return "Product{" +
                     "productId=" + productId +
                     ", name='" + name + '\'' +
                     ", price=" + price +
                     '}';
         }
     }

     /** 6. Создайте класс "ECommerceSystem" с полями:
     *    - users (список пользователей, тип List<User>)
     *    - orders (список заказов, тип List<Order>)
     */

     /**    Добавьте:
     *    - Конструктор с параметрами для всех полей
     *    - Метод addUser(User user), который добавляет нового пользователя в систему
     *    - Метод addOrder(Order order), который добавляет новый заказ в систему
     *    - Метод getAllAdmins(), который возвращает список всех пользователей с ролью "Admin"
     *    - Метод getAllCustomersWithOrders(), который возвращает список всех клиентов, у которых есть заказы
     *    - Метод calculateTotalRevenue(), который вычисляет общую сумму всех заказов в системе
     *    - Метод toString, который выводит общее количество пользователей и заказов
     */

     public static class ECommerceSystem{

         List<User> users;
         List<Order> orders;

         ECommerceSystem(){
             this.users = new ArrayList<>();
             this.orders = new ArrayList<>();
         }

         public ECommerceSystem(List<User> users, List<Order> orders) {
             this.users = users;
             this.orders = orders;
         }

         public void addUser(User user){
             users.add(user);
         }

         public void addOrder(Order order){
             orders.add(order);
         }

         public List<User> getAllAdmins(){
             List<User> allAdmins = new ArrayList<>();
             for(User user : users){
                 if(user.getUserRole().equals("Admin")){
                     allAdmins.add(user);
                 }
             }
             return allAdmins;
         }

         public List<Customer> getAllCustomersWithOrders(){
             List<Customer> allCustomersWithOrders = new ArrayList<>();
             for(User user : users){
                 if(user.getUserRole().equals("Customer")){
                     Customer customer = (Customer) user;
                     if(customer.orders != null && !customer.orders.isEmpty()){
                         allCustomersWithOrders.add(customer);
                     }
                 }
             }
             return allCustomersWithOrders;
         }

         public double calculateTotalRevenue(){
             double totalRevenue = 0.0;
             for(Order order : orders){
                 totalRevenue += order.totalAmount;
             }
             return totalRevenue;
         }

         @Override
         public String toString() {
             return "ECommerceSystem{" +
                     "users=" + users +
                     ", orders=" + orders +
                     '}';
         }
     }

     /** 7. В основном классе создайте:
     *    - Несколько объектов "Admin" и "Customer"
     *    - Несколько объектов "Order" и "Product"
     *    - Объект "ECommerceSystem", добавьте в него пользователей и заказы
     *    - Проверьте работу всех методов, включая наследование, пересчёты, фильтрацию и отображение данных
     *    - Выведите в консоль общую информацию о системе
     */
}

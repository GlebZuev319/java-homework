package _19_12_2024;

import java.time.LocalDate;

public class E3 {
    /**
    *
    * 1. Создайте класс "Category" с полями:
    *    - id (уникальный идентификатор категории, тип int)
    *    - name (название категории, тип String)
    *    - description (описание категории, тип String)
    */

    /**   Добавьте:
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для каждого поля
     *    - Метод toString для представления объекта в строковом виде
     */

    public static class Category{

        int id;
        String name;
        String description;

        Category(){
            this.id = 0;
            this.name = "";
            this.description = "";
        }

        public Category(int id, String name, String description) {
            this.id = id;
            this.name = name;
            this.description = description;
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Category{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    /** 2. Расширьте класс "Product":
    *    - Добавьте поле category (объект класса Category)
    *    - Добавьте поле discount (размер скидки, тип double)
    *    - Добавьте метод calculateFinalPrice(), который возвращает цену продукта с учётом скидки.
     */

    /**

    ***СДЕЛАНО В E2***

     */

    /** 3. Создайте класс "Address" с полями:
    *    - street (улица, тип String)
    *    - city (город, тип String)
    *    - postalCode (почтовый индекс, тип String)
    *    - country (страна, тип String)
    */

    /**    Добавьте:
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для каждого поля
     *    - Метод toString для представления объекта в строковом виде
     */

    public static class Address{

        String street;
        String city;
        String postalCode;
        String country;

        Address(){
            this.street = "";
            this.city = "";
            this.postalCode = "";
            this.country = "";
        }

        public Address(String street, String city, String postalCode, String country) {
            this.street = street;
            this.city = city;
            this.postalCode = postalCode;
            this.country = country;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", postalCode='" + postalCode + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }

    /** 4. Расширьте класс "Customer":
    *    - Добавьте поле addresses (список объектов Address)
    *    - Добавьте метод addAddress(Address address) для добавления нового адреса.
    */

    /**

     ***СДЕЛАНО В E2***

     */

    /** 5. Создайте класс "OrderStatus" с полями:
    *    - id (уникальный идентификатор статуса, тип int)
    *    - status (статус заказа, тип String, например "Processing", "Shipped", "Delivered")
    *    - updateDate (дата последнего обновления статуса, тип LocalDate)
    */

    /**    Добавьте:
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для каждого поля
     *    - Метод toString для представления объекта в строковом виде
     */

    public static class OrderStatus{

        int id;
        String status;
        LocalDate updateDate;

        OrderStatus(){
            this.id = 0;
            this.status = "";
            this.updateDate = LocalDate.now();
        }

        public OrderStatus(int id, String status, LocalDate updateDate) {
            this.id = id;
            this.status = status;
            this.updateDate = updateDate;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public LocalDate getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(LocalDate updateDate) {
            this.updateDate = updateDate;
        }

        @Override
        public String toString() {
            return "OrderStatus{" +
                    "id=" + id +
                    ", status='" + status + '\'' +
                    ", updateDate=" + updateDate +
                    '}';
        }
    }




    /** 6. Расширьте класс "Order":
    *    - Добавьте поле status (объект класса OrderStatus)
    *    - Добавьте поле orderDate (дата заказа, тип LocalDate)
    *    - Добавьте метод calculateTotalAmount(), который пересчитывает общую сумму заказа с учётом скидок на продукты.
    */

    /**

     ***СДЕЛАНО В E2***

     */
}

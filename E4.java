package _19_12_2024;

public class E4 {
    /**
    *
    * 1. Создайте базовый класс "Person" с полями:
    *    - id (уникальный идентификатор, тип int)
    *    - name (имя, тип String)
    *    - email (электронная почта, тип String)
    */

    /**    Добавьте:
    *    - Конструктор по умолчанию
    *    - Конструктор с параметрами для всех полей
    *    - Геттеры и сеттеры для каждого поля
    *    - Метод toString для представления объекта в строковом виде
    */

    public static class Person{

        int id;
        String name;
        String email;

        Person(){
            this.id = 0;
            this.name = "";
            this.email = "";
        }

        public Person(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        public int getId(){
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getEmail(){
            return email;
        }

        public void setEmail(String email){
            this.email = email;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }

    }

    /** 2. Создайте класс "Employee", который наследуется от "Person" и добавьте поля:
    *    - position (должность, тип String)
    *    - salary (зарплата, тип double)
    */


    /**    Добавьте:
    *    - Конструктор по умолчанию
    *    - Конструктор с параметрами для всех полей, включая поля базового класса
    *    - Геттеры и сеттеры для каждого нового поля
    *    - Метод toString, который также выводит информацию из базового класса
    */

    public static class Employee extends Person{

        String position;
        double salary;

        Employee(){
            super();
            this.position = "";
            this.salary = 0.0;
        }

        public Employee(int id, String name, String email, String position, double salary) {
            super(id, name, email);
            this.position = position;
            this.salary = salary;
        }

        public String getPosition(){
            return position;
        }

        public void setPosition(String position){
            this.position = position;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + getId() +
                    ", name='" + getName() + '\'' +
                    ", email='" + getEmail() + '\'' +
                    ", position='" + position + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    /** 3. Создайте класс "Manager", который наследуется от "Employee" и добавьте поля:
    *    - teamSize (размер команды, тип int)
    *    - bonus (размер бонуса, тип double)
    */

    /**    Добавьте:
    *    - Конструктор по умолчанию
    *    - Конструктор с параметрами для всех полей, включая поля базового класса
    *    - Геттеры и сеттеры для каждого нового поля
    *    - Метод calculateTotalSalary(), который возвращает зарплату с учётом бонуса
    *    - Метод toString, который также выводит информацию из базового класса
    */

    public static class Manager extends Employee {

        int teamSize;
        double bonus;

        Manager(){
            super();
            this.teamSize = 0;
            this.bonus = 0.0;
        }

        public Manager(int id, String name, String email, String position, double salary, int teamSize, double bonus) {
            super(id, name, email, position, salary);
            this.teamSize = teamSize;
            this.bonus = bonus;
        }

        public int getTeamSize(){
            return teamSize;
        }

        public void setTeamSize(int teamSize){
            this.teamSize = teamSize;
        }

        public double getBonus(){
            return bonus;
        }

        public void setBonus(double bonus){
            this.bonus = bonus;
        }

        public static double calculateTotalSalary(double salary, double bonus){
            double totalSalary = salary + bonus;
            return totalSalary;
        }

        @Override
        public String toString() {
            return "Manager{" +
                    "id=" + getId() +
                    ", name='" + getName() + '\'' +
                    ", email='" + getEmail() + '\'' +
                    ", position='" + getPosition() + '\'' +
                    ", salary=" + getSalary() +
                    ", teamSize=" + teamSize +
                    ", bonus=" + bonus +
                    '}';
        }
    }
}

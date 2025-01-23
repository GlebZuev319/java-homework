package _19_12_2024;

import java.util.ArrayList;
import java.util.List;

public class E5 {
    /**
     *
     * 1. Создайте базовый класс "Account" с полями:
     *    - accountId (уникальный идентификатор аккаунта, тип int)
     *    - ownerName (имя владельца, тип String)
     *    - balance (баланс, тип double)
     */

     /**    Добавьте:
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для каждого поля
     *    - Метод toString для представления объекта в строковом виде
     *    - Метод withdraw(double amount), который уменьшает баланс (если достаточно средств)
     *    - Метод deposit(double amount), который увеличивает баланс
     */

     public static class Account{

         int accountId;
         String ownerName;
         double balance;

         Account(){
             this.accountId = 0;
             this.ownerName = "";
             this.balance = 0.0;
         }

         public Account(int accountId, String ownerName, double balance) {
             this.accountId = accountId;
             this.ownerName = ownerName;
             this.balance = balance;
         }

         public int getAccountId() {
             return accountId;
         }

         public void setAccountId(int accountId) {
             this.accountId = accountId;
         }

         public String getOwnerName() {
             return ownerName;
         }

         public void setOwnerName(String ownerName) {
             this.ownerName = ownerName;
         }

         public double getBalance() {
             return balance;
         }

         public void setBalance(double balance) {
             this.balance = balance;
         }

         @Override
         public String toString() {
             return "Account{" +
                     "accountId=" + accountId +
                     ", ownerName='" + ownerName + '\'' +
                     ", balance=" + balance +
                     '}';
         }

         public void withdraw(double amount){
             if (amount>0 && balance >= amount){
                 balance = balance - amount;
             } else{
                 System.out.println("Недостаточно средств");
             }
         }

         public void deposit(double amount){
             if(amount>0){
                 balance = balance + amount;
             }
         }
     }

     /** 2. Создайте класс "SavingsAccount", который наследуется от "Account", и добавьте:
     *    - interestRate (процентная ставка, тип double)
     */

    /**    Добавьте:
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей, включая поля базового класса
     *    - Геттеры и сеттеры для поля interestRate
     *    - Метод applyInterest(), который добавляет проценты к балансу
     *    - Переопределите метод withdraw(double amount), чтобы запретить снятие средств, если баланс станет меньше минимального уровня (например, 100.0)
     *    - Переопределите метод toString, чтобы также отображать процентную ставку
     */

     public static class SavingsAccount extends Account{

         double interestRate;

         SavingsAccount(){
             super();
             this.interestRate = 0.0;
         }

         public SavingsAccount(int accountId, String ownerName, double balance, double interestRate) {
             super(accountId, ownerName, balance);
             this.interestRate = interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public void applyInterest(){
             balance = balance*(1+interestRate/100);
        }

        @Override
        public void withdraw(double amount){
            if(amount < 0){
                System.out.println("Сумма не может быть отрицательной");
            } else if(amount > 0 && balance < amount){
                System.out.println("Недостаточно средств");
            } else if(amount > 0 && balance > amount && (balance - amount) < 100){
                System.out.println("Баланс не может быть меньше 100");
            } else if(amount > 0 && balance > amount && (balance - amount) >= 100){
                balance = balance - amount;
            }
        }

        @Override
        public String toString() {
            return "Account{" +
                    "accountId=" + accountId +
                    ", ownerName='" + ownerName + '\'' +
                    ", balance=" + balance +
                    ", interstRate=" + interestRate +
                    '}';
        }
    }

     /** 3. Создайте класс "CheckingAccount", который наследуется от "Account", и добавьте:
     *    - overdraftLimit (лимит перерасхода, тип double)
     */

     /**    Добавьте:
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей, включая поля базового класса
     *    - Геттеры и сеттеры для поля overdraftLimit
     *    - Переопределите метод withdraw(double amount), чтобы позволить перерасход до лимита
     *    - Переопределите метод toString, чтобы также отображать лимит перерасхода
     */

     public static class CheckingAccount extends Account{

         double overdraftLimit;

         CheckingAccount(){
             super();
             this.overdraftLimit = 0.0;
         }

         public CheckingAccount(int accountId, String ownerName, double balance, double overdraftLimit) {
             super(accountId, ownerName, balance);
             this.overdraftLimit = overdraftLimit;
         }

         public double getOverdraftLimit(){
             return overdraftLimit;
         }

         public void setOverdraftLimit(double overdraftLimit){
             this.overdraftLimit = overdraftLimit;
         }

         @Override
         public void withdraw(double amount){
             if(amount < 0){
                 System.out.println("Сумма не может быть отрицательной");
             } else if(amount > 0 && (balance - amount) < -overdraftLimit){
                 System.out.println("Превышен лимит овердрафта");
             } else if(amount > 0 && (balance - amount) >= -overdraftLimit){
                 balance = balance - amount;
             }
         }

         @Override
         public String toString() {
             return "Account{" +
                     "accountId=" + accountId +
                     ", ownerName='" + ownerName + '\'' +
                     ", balance=" + balance +
                     ", overdraftLimit=" + overdraftLimit +
                     '}';
         }
     }

     /** 4. Создайте класс "Bank" с полями:
     *    - bankName (название банка, тип String)
     *    - accounts (список аккаунтов, тип List<Account>)
     */

     /**    Добавьте:
     *    - Конструктор с параметрами для всех полей
     *    - Метод addAccount(Account account) для добавления нового аккаунта в банк
     *    - Метод getAccountById(int accountId) для поиска аккаунта по идентификатору
     *    - Метод calculateTotalBalance(), который возвращает общую сумму на всех аккаунтах в банке
     *    - Метод toString для вывода списка всех аккаунтов
     */

     public static class Bank {

         String name;
         List<Account> accounts;

         Bank(){
             this.name = "";
             this.accounts = new ArrayList<>();
         }

         public Bank(String name, List<Account> accounts) {
             this.name = name;
             this.accounts = accounts;
         }

         public void addAccount(Account account){
             accounts.add(account);
         }

         public Account getAccountById(int accountId) {
             for (Account account : accounts) {
                 if (account.accountId == accountId) {
                    return account;
                 }
             }
             return null;
         }

         public double calculateTotalBalance(){
             double totalBalance = 0.0;
             for(Account account : accounts){
                 totalBalance += account.balance;
             }
             return totalBalance;
         }

         @Override
         public String toString() {
             StringBuilder sb = new StringBuilder();

             sb.append("Bank{").append("\n");
             sb.append("Accounts:").append("\n");

             for(Account account : accounts){
                 sb.append(" ").append(account.toString()).append("\n");
             }

             sb.append("}");

             return sb.toString();
         }
     }
}

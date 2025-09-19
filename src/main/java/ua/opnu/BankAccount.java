package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 1.0;  // Для простоти встановлюємо фіксовану комісію

    // Конструктор без параметрів
    BankAccount() {
        name = "Daniel Ivanov's Bank Account";
        balance = 0.0;
    }

    // Конструктор з параметрами
    BankAccount(String name, double balance) {
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0; // Задаємо мінімальний баланс
        }
    }

    // Метод для поповнення рахунку
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Метод для зняття коштів
    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount + transactionFee) {
            balance -= amount + transactionFee;
            return true;
        }
        return false;
    }

    // Метод для переказу коштів на інший рахунок
    boolean transfer(BankAccount receiver, double amount) {
        if (receiver == null || amount <= 0) {
            return false;
        }
        if (this.withdraw(amount)) {
            receiver.deposit(amount);
            return true;
        }
        return false;
    }

    // Отримання балансу
    double getBalance() {
        return balance;
    }

    // Метод для отримання імені рахунку
    String getName() {
        return name;
    }
}

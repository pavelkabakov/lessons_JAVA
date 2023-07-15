public class Task_2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); // Создание объекта класса BankAccount

        account.setBalance(1000.0); // Установка значения баланса с помощью публичного сеттера setBalance()

        double balance = account.getBalance(); // Получение значения баланса с помощью публичного геттера getBalance()

        System.out.println("Current balance: " + balance); // Вывод текущего баланса

    }
}
class BankAccount {
    private double balance; // Приватное поле balance

    public double getBalance() { // Публичный геттер getBalance() для доступа к приватному полю balance
        return balance;
    }

    public void setBalance(double balance) { // Публичный сеттер setBalance() для установки значения приватного поля balance
        if (balance >= 0) { // Проверка на допустимость значения баланса
            this.balance = balance; // Установка нового значения баланса
        } else {
            System.out.println("Invalid balance amount."); // Вывод сообщения об ошибке
        }
    }
}
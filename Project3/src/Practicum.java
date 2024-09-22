public class Practicum {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(24043); // передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.withdrawAll(); // вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;

    // допишите код методов
    // используйте параметр newMoneyAmount для установки нового значения

    public void setMoneyAmount(long newMoneyAmount) {
        moneyAmount = newMoneyAmount;
    }

    public long getMoneyAmount() {
        return moneyAmount;
    }
    public void withdrawAll(){
        System.out.printf("co счёта снято %d р.\n", moneyAmount);
        moneyAmount = 0;
    }

}
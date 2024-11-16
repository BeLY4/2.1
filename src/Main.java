public class Main {
    public static void main(String[] args) {
        int deposit = 400;
        int currentBalance = 100;
        int bonus;
        System.out.println("На вашем счету: " + currentBalance + " руб");
        System.out.println("Пополнение на: " + deposit + " руб");
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int balance = deposit + currentBalance + bonus;
        System.out.println("Итоговый счет: " + balance + " руб");
        System.out.println("Бонус: " + bonus + " руб");
    }
}
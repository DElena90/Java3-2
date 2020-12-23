public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refillBalance = 1000;
        int bonus = 0;
        if (refillBalance > 1000) {
            bonus = refillBalance / 100;
        }
        int totalBalance = balance + refillBalance + bonus;
        System.out.println(totalBalance);
    }
}

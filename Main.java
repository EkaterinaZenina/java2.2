public class Main {
    public static void main(String[] args) {
        int account = 100;
        boolean replenisment = true;
        int replenishment = 1100;
        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }
        System.out.println( replenishment + bonus + account);
    }
}

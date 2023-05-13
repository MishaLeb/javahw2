public class HW_PRIMITIVES_2 {
    public static void main(String[] args) {
        int on_account = 100;
        int refill = 1500;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int total_on_account = on_account + refill +bonus;
        System.out.println("Бонус:" + bonus);
        System.out.println("Итоговый счет:" + total_on_account);
    }
}

public class HW_TESTABILITY_1 {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int myMiles = service.calculate(10000);
        System.out.println("Мои мили: " + myMiles);
    }
}

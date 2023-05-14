public class HW_TESTABILITY_2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(2.01, 103);
        System.out.println("Body mass index: " + bmi);
    }
}


public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int years1 = service.calculate(12, 1_000_000, (float) 9.99);
        System.out.println(years1);

        int years2 = service.calculate(24, 1_000_000, (float) 9.99);
        System.out.println(years2);

        int years3 = service.calculate(36, 1_000_000, (float) 9.99);
        System.out.println(years3);
    }
}

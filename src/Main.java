
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditTerm;
        int amount;
        float percent = 9.99f;

        creditTerm = 12;
        amount = 1_000_000;

        int years1 = service.calculate(creditTerm, amount, percent);
        System.out.println(years1);

        creditTerm = 24;
        amount = 1_000_000;

        int years2 = service.calculate(creditTerm, amount, percent);
        System.out.println(years2);

        creditTerm = 36;
        amount = 1_000_000;

        int years3 = service.calculate(creditTerm, amount, percent);
        System.out.println(years3);
    }
}

public class CreditPaymentService {
    public int calculate(int months, float amount, float percent){

        float monthlyPercent = percent / 12 / 100;

        float K = monthlyPercent * ((float) Math.pow(1+monthlyPercent, months) / ((float) Math.pow(1+monthlyPercent, months) - 1));

        int monthlyPayment = (int) (K * amount);

        return monthlyPayment;
    }
}

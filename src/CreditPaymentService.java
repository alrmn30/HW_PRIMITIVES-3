public class CreditPaymentService {
    public int calculate (int termInYears, double annualInterestRate, int amountOfCredit) {
//        Math.pow(2, 5);
        int termInMonths = termInYears * 12;
        double monthlyInterestRate = annualInterestRate / 100 / 12;
//        Math.pow((1 + monthlyInterestRate), termInMonths);
        double monthlyPayment = amountOfCredit * (monthlyInterestRate + (monthlyInterestRate / (Math.pow((1 + monthlyInterestRate), termInMonths) - 1)));
        return (int) monthlyPayment;
    }
}

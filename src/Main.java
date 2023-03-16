public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println(service.calculate(1, 9.99, 1_000_000));
        System.out.println(service.calculate(2, 9.99, 1_000_000));
        System.out.println(service.calculate(3, 9.99, 1_000_000));
    }
}

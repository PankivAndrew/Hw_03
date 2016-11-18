package Payment;

/**
 * Created by Pankiv on 18.11.2016.
 */
public class CreditCartPaymentStrategy implements IPayment{
    @Override
    public void pay(double price) {
        System.out.println("You payed with credit card" + price + "dollars");
    }
}

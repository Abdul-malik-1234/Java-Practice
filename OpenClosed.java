abstract class PaymentMethod{
    public abstract void processPayment(double amount);//Pure virtual function
}

class CreditCardPaymentProcessor extends PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of "+ amount);
    }
}

class PayPalPaymentProcessor extends PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing PayPal payment of "+amount);
    }
}

class OpenClosed{
    public static void main(String[] args){
        CreditCardPaymentProcessor c=new CreditCardPaymentProcessor();
        PayPalPaymentProcessor p=new PayPalPaymentProcessor();
        c.processPayment(2500);
        p.processPayment(3600);
    }
}
package Oops;

public interface MultipleInheritance {
//    Payment System: In a financial application, a PaymentProcessor class might
//    implement interfaces for different payment methods
//    (e.g., CreditCardPayment, PayPalPayment, CryptoPayment),
//    allowing it to support multiple payment types in one class.
    // Payment interface
    interface CreditCardPayment {
        void processCreditCard(double amount);

        default void paymentDetails() {
            System.out.println("Processing via Credit Card.");
        }
    }

    // Another Payment interface
    interface PayPalPayment {
        void processPayPal(double amount);

        default void paymentDetails() {
            System.out.println("Processing via PayPal.");
        }
    }

    // PaymentProcessor class implementing both interfaces
    class PaymentProcessor implements CreditCardPayment, PayPalPayment {
        @Override
        public void processCreditCard(double amount) {
            System.out.println("Credit Card payment of $" + amount);
        }

        @Override
        public void processPayPal(double amount) {
            System.out.println("PayPal payment of $" + amount);
        }

        // Resolving paymentDetails method ambiguity
        @Override
        public void paymentDetails() {
            CreditCardPayment.super.paymentDetails();
            PayPalPayment.super.paymentDetails();
        }
    }

    public class Main {
        public static void main(String[] args) {
            PaymentProcessor processor = new PaymentProcessor();
            processor.processCreditCard(100);   // Output: Credit Card payment of $100
            processor.processPayPal(200);       // Output: PayPal payment of $200
            processor.paymentDetails();         // Output: Processing via Credit Card.
            //         Processing via PayPal.
        }
    }

}

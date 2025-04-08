package Oops;

public class PracticePolymorphism {
//• Polymorphism is	a	concept	in	which	we	can	execute	a	single
//    operation	in	different	ways.
//            • polymorphism is	same as	generalization.
//Consider a Payment System where different payment methods (CreditCard, PayPal, Cash) are used to process payments.
//    All payment methods share a common interface or superclass,
//        but each one has its specific processing logic.
// Superclass or Interface
static class PaymentMethod {
    void pay(double amount) {
        System.out.println("Processing a generic payment of RS" + amount);
    }
}

    // Subclass for Credit Card Payment
    static class CreditCard extends PaymentMethod {
        @Override
        void pay(double amount) {
            System.out.println("Processing credit card payment of RS" + amount);
        }
    }

    // Subclass for PayPal Payment
    static class PayPal extends PaymentMethod {
        @Override
        void pay(double amount) {
            System.out.println("Processing PayPal payment of rS" + amount);
        }
    }

    // Subclass for Cash Payment
    static class Cash extends PaymentMethod {
        @Override
        void pay(double amount) {
            System.out.println("Processing cash payment of rS" + amount);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            //  PaymentMethod references
            PaymentMethod[] payments = {
                    new CreditCard(),
                    new PayPal(),
                    new Cash()
            };

            for (PaymentMethod payment : payments) {
                payment.pay(100);  // Polymorphic behavior
            }
        }
    }

}

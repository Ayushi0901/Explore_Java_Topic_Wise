package Oops;

public class PracticeAbstraction {
    //Scenario: Scenario: Payment System
//In a payment system, different payment methods (like CreditCard, PayPal, Cash)
// may be used to make a payment. However, the main abstraction is the
// which could have an abstract method pay() that is implemented differently for each specific payment type.
    abstract  static class PaymentMethod {
        public abstract void pay(double amount);
    }

    // Concrete class for CreditCard payment method
   static class CreditCard extends PaymentMethod {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card.");
        }
    }

    // Concrete class for PayPal payment method
   static class PayPal extends PaymentMethod {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using PayPal.");
        }
    }

    // Concrete class for Cash payment method
    static class Cash extends PaymentMethod {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Cash.");
        }
    }


    public static void main(String[] args) {
        // Payment methods are abstracted
        PaymentMethod paymentMethod1 = new CreditCard();
        PaymentMethod paymentMethod2 = new PayPal();
        PaymentMethod paymentMethod3 = new Cash();

        // Calling the abstract method for each payment method
        paymentMethod1.pay(100.00); // CreditCard payment
        paymentMethod2.pay(50.50);  // PayPal payment
        paymentMethod3.pay(20.00);  // Cash payment
    }

}

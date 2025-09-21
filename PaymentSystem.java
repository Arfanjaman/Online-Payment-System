// Main class to demonstrate the payment system
public class PaymentSystem {
    public static void main(String[] args) {
        System.out.println("Online Payment System - Part B Implementation\n");
        
        // Create different payment methods
        Payment creditCard = new CreditCardPayment("1234567890123456", "John Doe");
        Payment paypal = new PayPalPayment("john.doe@email.com");
        Payment mobileBanking = new MobileBankingPayment("+1234567890", "Bank of America");
        
        // Create platform instances
        WebApp webPlatform = new WebApp("University Web Portal");
        MobileApp mobilePlatform = new MobileApp("University Mobile App");
        
        // Demonstrate payments from Web Platform
        System.out.println("*** WEB PLATFORM PAYMENTS ***\n");
        webPlatform.processPayment(creditCard, 1500.00);
        webPlatform.processPayment(paypal, 750.50);
        webPlatform.processPayment(mobileBanking, 2000.75);
        
        // Demonstrate payments from Mobile Platform
        System.out.println("*** MOBILE PLATFORM PAYMENTS ***\n");
        mobilePlatform.processPayment(creditCard, 500.25);
        mobilePlatform.processPayment(paypal, 1200.00);
        mobilePlatform.processPayment(mobileBanking, 850.50);
        
        System.out.println("*** Payment System Demo Completed ***");
    }
}
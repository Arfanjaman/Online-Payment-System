// Main class to demonstrate the Online Payment System
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Online Payment System - Part B Implementation ===\n");
        
        // Create different payment methods
        Payment creditCard = new CreditCardPayment("1234567890123456", "John Doe");
        Payment paypal = new PayPalPayment("john.doe@email.com");
        Payment mobileBanking = new MobileBankingPayment("+1234567890", "Bank of America");
        
        // Create platform instances
        WebApp webPlatform = new WebApp("University Web Portal");
        MobileApp mobilePlatform = new MobileApp("University Mobile App");
        
        System.out.println("*** PAYMENTS FROM WEB PLATFORM ***\n");
        
        // Demonstrate Credit Card payment from Web Platform
        webPlatform.processPayment(creditCard, 1500.00);
        
        // Demonstrate PayPal payment from Web Platform
        webPlatform.processPayment(paypal, 750.50);
        
        // Demonstrate Mobile Banking payment from Web Platform
        webPlatform.processPayment(mobileBanking, 2000.75);
        
        System.out.println("*** PAYMENTS FROM MOBILE PLATFORM ***\n");
        
        // Demonstrate Credit Card payment from Mobile Platform
        mobilePlatform.processPayment(creditCard, 500.25);
        
        // Demonstrate PayPal payment from Mobile Platform
        mobilePlatform.processPayment(paypal, 1200.00);
        
        // Demonstrate Mobile Banking payment from Mobile Platform
        mobilePlatform.processPayment(mobileBanking, 850.50);
        
        System.out.println("=== Payment System Demo Completed Successfully ===");
        System.out.println("\nKey Features Demonstrated:");
        System.out.println("✓ Abstract Payment class with polymorphism");
        System.out.println("✓ Multiple payment methods (Credit Card, PayPal, Mobile Banking)");
        System.out.println("✓ Different platforms (Web App, Mobile App)");
        System.out.println("✓ Same payment methods work across different platforms");
    }
}
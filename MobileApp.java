// MobileApp Platform class
public class MobileApp {
    private String appName;
    
    public MobileApp(String appName) {
        this.appName = appName;
    }
    
    public void processPayment(Payment paymentMethod, double amount) {
        System.out.println("=== " + appName + " - Mobile Platform ===");
        paymentMethod.makePayment(amount);
    }
}
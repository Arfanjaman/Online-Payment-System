// WebApp Platform class
public class WebApp {
    private String platformName;
    
    public WebApp(String platformName) {
        this.platformName = platformName;
    }
    
    public void processPayment(Payment paymentMethod, double amount) {
        System.out.println("=== " + platformName + " - Web Platform ===");
        paymentMethod.makePayment(amount);
    }
}
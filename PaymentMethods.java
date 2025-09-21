// Credit Card Payment implementation
class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;
    
    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
        getTransactionId() {
              System.out.println("From main branch");
        }
        getPaymentDate() {
              System.out.println("From branch");
        }

    @Override
    public void makePayment(double amount) {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: ****-****-****-" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Amount: $" + amount);
        System.out.println("Credit Card Payment Successful!\n");
    }
}

// PayPal Payment implementation
class PayPalPayment extends Payment {
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }
    
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing PayPal Payment...");
        System.out.println("PayPal Email: " + email);
        System.out.println("Amount: $" + amount);
        System.out.println("PayPal Payment Successful!\n");
    }
}

// Mobile Banking Payment implementation
class MobileBankingPayment extends Payment {
    private String phoneNumber;
    private String bankName;
    
    public MobileBankingPayment(String phoneNumber, String bankName) {
        this.phoneNumber = phoneNumber;
        this.bankName = bankName;
    }
    
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing Mobile Banking Payment...");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Bank: " + bankName);
        System.out.println("Amount: $" + amount);
        System.out.println("Mobile Banking Payment Successful!\n");
    }
}
// Credit Card Payment implementation
class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;
    
    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
        getPaymentDate() {
              System.out.println("From branch");
        }

    @Override
    public void makePayment(double amount) {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: ****-****-****-" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Amount: $" + amount);
        System.out.println("Credit Card Payment Successful!\n");
    }
}

// PayPal Payment implementation
class PayPalPayment extends Payment {
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }
    
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing PayPal Payment...");
        System.out.println("PayPal Email: " + email);
        System.out.println("Amount: $" + amount);
        System.out.println("PayPal Payment Successful!\n");
    }
}

// Mobile Banking Payment implementation
class MobileBankingPayment extends Payment {
    private String phoneNumber;
    private String bankName;
    
    public MobileBankingPayment(String phoneNumber, String bankName) {
        this.phoneNumber = phoneNumber;
        this.bankName = bankName;
    }
    
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing Mobile Banking Payment...");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Bank: " + bankName);
        System.out.println("Amount: $" + amount);
        System.out.println("Mobile Banking Payment Successful!\n");
    }
}
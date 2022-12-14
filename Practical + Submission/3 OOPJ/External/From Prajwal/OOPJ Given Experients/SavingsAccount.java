
class SavingsAccount {
    private static float annualInterestRate = 1.0F;
    private float savingsBalance;

    public SavingsAccount() {
        this.savingsBalance = 0;
    }

    public SavingsAccount(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {
        return (savingsBalance + (savingsBalance * annualInterestRate) / 12);
    }

    public static void modifyInterestRate(float rate) {
        annualInterestRate = rate;
    }

}

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00F); 
        SavingsAccount saver2 = new SavingsAccount(3000.00F); 
        SavingsAccount.modifyInterestRate(4);
        System.out.print("New balance of Saver1 after 1 month with 4% intrest : ");
        System.out.println(saver1.calculateMonthlyInterest());
        System.out.print("New balance of Saver2 after 1 month with 4% intrest : ");
        System.out.println(saver2.calculateMonthlyInterest());
        
        SavingsAccount.modifyInterestRate(5);
        System.out.print("New balance of Saver1 after 1 month with 5% intrest : ");
        System.out.println(saver1.calculateMonthlyInterest());
        System.out.print("New balance of Saver2 after 1 month with 5% intrest : ");
        System.out.println(saver2.calculateMonthlyInterest());
        

    }
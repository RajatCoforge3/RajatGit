package Pac1;
class SavingsAccount extends Account {
 
    final double MIN_BALANCE = 500;
 
    public SavingsAccount(double balance) {
        super(balance);
    }
 
    @Override
    public boolean withdraw(double amt) {
        if (balance - amt >= MIN_BALANCE) {
            balance -= amt;
            return true;
        }
        return false;
    }
}
 
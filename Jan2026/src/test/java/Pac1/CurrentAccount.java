package Pac1;

class CurrentAccount extends Account {
	 
    private double overdraftLimit = 1000;
 
    public CurrentAccount(double balance) {
        super(balance);
    }
 
    @Override
    public boolean withdraw(double amt) {
        if (balance + overdraftLimit >= amt) {
            balance -= amt;
            return true;
        }
        return false;
    }
}
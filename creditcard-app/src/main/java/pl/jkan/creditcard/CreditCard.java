package pl.jkan.creditcard;

class CreditCard {
    private double balance = 0;
    private double cardlimit = 0;
    private boolean blocked = false;
    public void assignLimit(double limit) {
        balance = limit;
        cardlimit = limit;
    }   
    
    public boolean isBlocked() {
        return this.blocked;
    }
    public void block() {
        this.blocked = true;
    }
    
    public double getLimit() {
        return 2000;
    }
    
    public void withdraw(double money) {
        balance = balance - money;
    }
    
    public double getCountBalance() {
        return balance;
    }
}
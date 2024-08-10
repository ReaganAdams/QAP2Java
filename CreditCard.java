// Defines a CreditCard class with owner, balance, and credit limit
public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); // Use copy constructor
        this.balance = new Money(0); // Initialize balance to 0
    }

    public Money getBalance() {
        return new Money(balance); // Return a copy
    }

    public Money getCreditLimit() {
        return new Money(creditLimit); // Return a copy
    }

    public String getPersonals() {
        return owner.toString(); // Return the owner's information
    }

    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) > 0) {
            System.out.println("Exceeds credit limit");
        } else {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}

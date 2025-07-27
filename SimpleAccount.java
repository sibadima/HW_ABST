//обычный счёт, с которого можно платить,
// пока на нём есть деньги, и пополнять сколько угодно раз.

public class SimpleAccount extends Account {

    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

//обычный счёт, с которого можно платить,
// пока на нём есть деньги, и пополнять сколько угодно раз.

public class SimpleAccount extends Account {

    public SimpleAccount(long balance) {
        super(balance);

    }

    //покупка со счета, переопределяем метод
    @Override
    public boolean pay(long amount) {
        if (amount <= 0) {
            return false;
        }
        if (balance >= amount) { //проверка достаточно ли средств на счете
            balance -= amount;
            return true;
        }
        return false; //возвращаем false, если д/с не достаточно
    }
}

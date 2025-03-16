//кредитный счёт, который может уходить в минус до кредитного лимита,
//указанного в конструкторе, но не может уходить в плюс.

public class CreditAccount extends Account {
    private long creditLimit;

    //конструктор
    public CreditAccount(long balance, long creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    //покупка со счета, переопределяем метод
    @Override
    public boolean pay(long amount) {
        if (amount <= 0) {
            return false; //нельзя оплатить отрицательную сумму или ноль
        }
        if (balance - amount >= -creditLimit) { //проверка превышения кредитного лимита
            balance -= amount;
            return true;
        }
        return  false; //возвращаем false если кредитный лимит превышен
    }

    //пополнение счета
    @Override
    public boolean add (long amount) {
        if (amount <= 0) {
            return false; //нельзя пополнить на отриц. сумму или на ноль
        }
        if (balance + amount > 0) {
            return false; //по условию счет должен быть меньше или равен 0
        }
        balance += amount;
        return true;
    }
}

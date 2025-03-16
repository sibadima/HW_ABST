public abstract class Account {
    protected long balance; //текущий баланс счета

    public Account(long balance) {
        this.balance = balance;
    }

    //пополнение счета на amount, возвращает true, если пополнение успешно
    public boolean add(long amount) {
        if (amount <= 0) {
            return false; //нельзя пополнить на отриц. сумму
        }
        balance += amount;
        return true;
    }

    //метод покупки со счета на amount, возвращает true, если покупка успешна, иначе false
    public abstract boolean pay(long amount);

    // перевод денег со счёта, у которого был вызван метод, на счёт из параметра на сумму в размере amount,
    // возвращает true, если пополнение успешно, и false, если иначе;
    public boolean transfer(Account account, long amount) {
        if (amount <= 0) {
            return false; //нельзя переводить отрицательную сумму или ноль
        }
        boolean paymentSuccess = pay(amount); //пытаемся списать деньги
        if (paymentSuccess) {
            boolean addSuccess = account.add(amount); //пытаемся зачислить деньги
            if (!addSuccess) {
                add(amount); //если зачисление не удалось, возвращаем деньги
            }
            return addSuccess; //возвращаем результат зачисления
        }
        return false; //возвращаем false, если перевод не удался
    }

    //вывод текущего баланса
    public long getBalance() {
        return balance;
    }

}

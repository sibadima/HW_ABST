public class Main {
    public static void main(String[] args) {
        // создаем счет с балансом 5000
        SimpleAccount simpleAccount = new SimpleAccount(5000);
        System.out.println("Баланс счета: " + simpleAccount.getBalance());

        //оплатим 500 со счета
        simpleAccount.pay(500);
        System.out.println("Баланс счета после оплаты: " + simpleAccount.getBalance());

        //создаем кредитный счет с балансом 0 руб. и кредитным лимитом 40_000
        CreditAccount creditAccount = new CreditAccount(0, 40_000);
        System.out.println("Баланс кредитного счета: " + creditAccount.getBalance());

        //платим с кредитного счета
        creditAccount.pay(30_000);
        System.out.println("Баланс кредитного счета после оплаты: " + creditAccount.getBalance());

        //переведем деньги с обычного счета на кредитный
        long transferAmount = 4000;
        System.out.println("Сумма перевода: " + transferAmount);
        simpleAccount.transfer(creditAccount, transferAmount);
        System.out.println("Баланс обычного счета после перевода: " + simpleAccount.getBalance());
        System.out.println("Баланс кредитного счета после пополнения с обычного счета: " + creditAccount.getBalance());

    }

}
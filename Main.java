public class Main {
    static CreditAccount credit = new CreditAccount(-400_000);
    static SimpleAccount debit = new SimpleAccount();

    public static void main(String[] args) {
       showInfo();
       debit.add(200_000);
       credit.add(200_000);
       showInfo();
       debit.pay(300_000);
       credit.pay(300_000);
       showInfo();
       debit.transfer(credit, 150_000);
       showInfo();


    }

    static void showInfo() {
        System.out.println("На счету дебита: " + debit.getBalance());
        System.out.println("На счету кредита: " + credit.getBalance());

    }
}

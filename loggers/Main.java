package loggers;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger logger = new SimpleLogger();
        logger.log("Сходил в магазин");
        Thread.sleep(1000);
        logger.log("Купил бутылочку пива");
        Thread.sleep(1000);
        logger.log("Не хватило денег. ERROR");
        Thread.sleep(1000);
        logger.log("Вечер не удался");
        Thread.sleep(1000);
    }
}

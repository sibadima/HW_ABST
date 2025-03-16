package loggers;

import java.time.LocalDateTime;

public class SimpleLogger implements Logger {
    private int counter = 0;
    @Override
    public void log(String msg) {
        counter++;
        System.out.printf("%s#%d [%s] %s\n",
                msg.toLowerCase().contains("error") ? "ERROR" : "INFO",
                counter,
                LocalDateTime.now(),
                msg);
    }
}

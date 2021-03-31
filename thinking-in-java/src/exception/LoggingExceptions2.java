package exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingExceptions2 {
    private static Logger logger = Logger.getLogger("LoggingExceptions2");
    static void logException(Exception e){
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        logger.severe(sw.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e){
            logException(e);
        }
    }
}

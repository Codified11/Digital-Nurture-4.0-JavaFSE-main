package Week_1.Design_Patterns_and_Principles.SingletonPatternExample;

// file - Logger.java
public class Logger {

    // step 2 - private static instance of Logger
    private static Logger instance;

    // private constructor
    private Logger(){
        System.out.println("Logger Initialized");
    }

    // step 3 - public static method to get the instance
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    // Example logging method
    public void log(String message){
        System.out.println("Log: " + message);
    }
}

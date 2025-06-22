package Week_1.Design_Patterns_and_Principles.SingletonPatternExample;

//file - TestSingleton.java
// this file is for testing the code functionality
public class TestSingleton {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the first message.");
        logger2.log("This is the second message.");

        // Verifying if both logger1 and logger2 point to the same instance or not
        if(logger1 == logger2){
            System.out.println("Both looger1 and logger2 are the same instance.");
        }
        else{
            System.out.println("Different instances found! Singleton failed.");
        }
    }
}




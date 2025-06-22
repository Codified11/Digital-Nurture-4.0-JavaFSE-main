package Week_1.Design_Patterns_and_Principles.FactoryMethodPatternExample;

// file - ExcelDocument.java
public class ExcelDocument implements Document {
    public void open(){
        System.out.println("Opening an Excel document.");
    }
}

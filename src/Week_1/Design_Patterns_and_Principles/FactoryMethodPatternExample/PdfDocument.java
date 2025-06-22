package Week_1.Design_Patterns_and_Principles.FactoryMethodPatternExample;

// file - PdfDocument.java
public class PdfDocument implements Document {
    public void open(){
        System.out.println("Opening a PDF document.");
    }
}

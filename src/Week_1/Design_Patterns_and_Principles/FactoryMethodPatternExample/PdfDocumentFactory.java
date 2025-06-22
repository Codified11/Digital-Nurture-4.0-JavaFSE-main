package Week_1.Design_Patterns_and_Principles.FactoryMethodPatternExample;

// file - PdfDocumentFactory
public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument(){
        return new PdfDocument();
    }
}

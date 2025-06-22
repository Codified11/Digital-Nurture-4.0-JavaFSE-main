package Week_1.Design_Patterns_and_Principles.FactoryMethodPatternExample;

// file - ExcelDocumentFactory
public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument(){
        return new ExcelDocument();
    }
}

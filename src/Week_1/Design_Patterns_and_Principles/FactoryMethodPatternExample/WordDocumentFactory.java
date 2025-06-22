package Week_1.Design_Patterns_and_Principles.FactoryMethodPatternExample;

// file - WordDocumentFactory
public class WordDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new WordDocument();
    }
}

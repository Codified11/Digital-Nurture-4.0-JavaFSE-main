package Week_1.Algorithms_Data_Structures.Excercise_2_Ecommerce_Platform_Search_Function;

//file - Product.java
public class Product {
    int productId;
    String productName;
    String category;

    public Product (int productId, String productName, String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString(){
        return "[ " + productId + " - " + productName+ " - " + category +" ]";
    }
}

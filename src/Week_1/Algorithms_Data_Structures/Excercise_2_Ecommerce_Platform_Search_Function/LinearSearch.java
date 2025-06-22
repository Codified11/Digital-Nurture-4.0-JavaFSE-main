package Week_1.Algorithms_Data_Structures.Excercise_2_Ecommerce_Platform_Search_Function;

// file - LinearSearch.java
// this file for the implementation of Linear Search
public class LinearSearch {
    public static Product linearSearch(Product[] products, String name){
        for (Product p : products){
            if(p.productName.equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }
}

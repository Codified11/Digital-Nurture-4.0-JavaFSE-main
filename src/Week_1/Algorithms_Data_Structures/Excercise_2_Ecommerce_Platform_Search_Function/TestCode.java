package Week_1.Algorithms_Data_Structures.Excercise_2_Ecommerce_Platform_Search_Function;

// file - TestCode.java
// this file is to test the code of both Searching techniques
public class TestCode {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shoes" , "Fashion"),
                new Product(3, "Smartphone", "ELectronics"),
                new Product(4, "Book" , "Education")
        };

        // Linear Search
        Product findProductLS =  LinearSearch.linearSearch(products, "Book");
        System.out.println("Linear Search Find Product : " + findProductLS);

        // Binary Search
        BinarySearch.sortProducts(products);
        Product findProductBS = BinarySearch.binarySearch(products , "book");
        System.out.println("Bianry Search Find Product : "+ findProductBS);
    }
}

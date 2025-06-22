package Week_1.Algorithms_Data_Structures.Excercise_2_Ecommerce_Platform_Search_Function;

import java.util.Arrays;
import java.util.Comparator;

// file - BinarySearch.java
// this file for the implementation of Binary Search
public class BinarySearch {
    public static Product binarySearch(Product[] products, String name){
        int left =0,
            right = products.length-1;
        while(left<=right){
            int mid = left +(right - left)/2;
            int compare = products[mid].productName.compareToIgnoreCase(name);

            if(compare == 0){
                return products[mid];
            }
            else if(compare <0){
                left  = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return null;
    }

    // Binary Search use sorted array so need to sort array  of products firstly.
    public static void sortProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }
}

package Week_1.Algorithms_Data_Structures.Excercise_7_Financial_Forecasting;

// file - FinancialForecast.java
public class FinancialForecast {

    // Recursive method use to calculate future value
    public static double futureValueRecursive(double presentValue, double growthRate, int years){
        // Base case
        if(years == 0){
            return presentValue;
        }

        // Recursive case
        return (1+growthRate) * futureValueRecursive(presentValue, growthRate, years -1);
    }

}

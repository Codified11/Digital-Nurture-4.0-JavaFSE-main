package Week_1.Algorithms_Data_Structures.Excercise_7_Financial_Forecasting;

// file - TestCode.java
// this file use to test the code
public class TestCode {
    public static void main(String[] args) {
        double presentValue = 10000;        // starting amount
        double growthRate = 0.05;        // 5% annual growth
        int years = 5;                    // for 5 years

        double result = FinancialForecast.futureValueRecursive(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: ₹%.3f\n", years, result);
    }
}

package arraymethods;

public class SumArrayByRow {

    public static void main(String[] args) {
        double shopping[][] = {
            {1.2, 2.3, 3.4},
            {20, 30.90},
            {1, 2, 3, 4.7, 5.7, 6.9}
        };
        
        double tots[]= getTotals(shopping);
        System.out.println("Totals for " + tots.length + " days; ");
        for (int i = 0; i < tots.length; i++) {
            System.out.format("tots[%d] = $%.2f\n", i, tots[i]);
        }
    }
    
    public static double[] getTotals(double prices[][]){
        double totals[] = new double[prices.length];
        //totals needs to have the same as number of rows in prices
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices[i].length; j++) {
                totals[i] += prices[i][j];
                
            }
            
        }
        return totals;
    }

}

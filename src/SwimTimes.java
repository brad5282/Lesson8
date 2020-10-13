
public class SwimTimes {

   
    public static void main(String[] args) {
        String atheletes[]={"BOB","SUE","AMY","JOE"};
        double times[][] = {
            {12.8,14.2,11.7},
            {13.8,11.2},
            {10.9,9.8,10.7,12.2},
            {12.8,10.4}
        };
        double avgtimes[] = getAverages(times);
        for (int i = 0; i < atheletes.length; i++) {
            System.out.print(atheletes[i] + "\t");
            for (int j = 0; j < times[i].length; j++) {
                System.out.print(times[i][j]+ " | ");
                
            }
            System.out.format("AVG: %.1f\n", avgtimes[i]);
        }//go to next athtelete
        }
    
//method returns a 1D array of average times, given a 2d grid of times

public static double[] getAverages(double t[][]){
    double avg[]=new double [t.length];
    for (int i = 0; i < t.length; i++) {
        for (int j = 0; j < t[i].length; j++) {
            avg[i] += t[i][j];
            
        }
        avg[i] = avg[i]/t[i].length;//get average
        
    }
    return avg;
}

    
}

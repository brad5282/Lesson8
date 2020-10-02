
public class Array2DEx1 {

    public static void main(String[] args) {
        int x[][] = new int[4][5];
        //2D array of 4 rows x 5 columns
        
        //x[3][2] = 50;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                int num = 10 * row + col;
                x[row][col] = num;
                System.out.format( "%5d | ", x[row][col]);
                
            }
            System.out.println("");
            
        }
        // make and initialize a 2D array
        System.out.println("\n----------------------------------------\n");
        int marks[][]={
            {1,2,3,4,5,6,7},
            {1,2,3,4,5},
            {1,2,3,4},
            {1,2,3,4,5,6}
        };
        //print marks
        //marks.length - # of rows(length going down)
        //marks[row].length = # of columns (across) for each row
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.format( "%5d | ", marks[row][col]);
                
            }
            System.out.println("");
            
        }
    }
    
}

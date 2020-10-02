
import java.util.logging.Level;
import java.util.logging.Logger;


public class SortingExample {

    static int arr[] = new int[100];

    public static void main(String[] args) {
        // fill the array with 100 random numbers from 1-1000
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000 + 1);
            System.out.print(arr[i] + " | ");
            if ((i + 1) % 10 == 0)//every 10th #
            {
                System.out.println("");
            }
        }
        System.out.println("\nSorting in 3 seconds");
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
            
        }
        System.out.println("----------------------------");
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = findSmallestLocation(i);
            swap(i, smallest);
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
            if ((i + 1) % 10 == 0)//every 10th #
            {
                System.out.println("");
            }
        }
        
        
    }
    //find smallest loc: return loc of smallest number 
    //given a start point in the list
    public static int findSmallestLocation(int startPoint){
        int smallestLoc = startPoint;
        //store the number at the start point
        int smallestNum = arr[startPoint];
        //go thru list from start point to end
        for (int i = startPoint+1; i < arr.length; i++) {
            if(arr[i]< smallestNum){
            smallestLoc = i;
            smallestNum=arr[i];
            
        }
    }
        return smallestLoc;
    }
    
    public static void swap(int loc1, int loc2){
        int temp = arr[loc1];
        arr[loc1] = arr[loc2];
        arr[loc2] = temp;
    }

}

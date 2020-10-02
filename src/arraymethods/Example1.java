
package arraymethods;


public class Example1 {

   
    public static void main(String[] args) {
        int abc[] = {1, 2, 3, 4, 5};
        changeTo10(abc);
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i]+ ", ");
        }
        
    }
    
    public static void changeTo10(int x[]){
        for (int i = 0; i < x.length; i++) {
            x[i] = 10;
        }
        
    }
    
}

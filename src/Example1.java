
public class Example1 {

    
    public static void main(String[] args) {
        int x[] = {67,7,45,98,0,0,0,0}; // makes int x an array
        int logicalSize = 4;
        //logicalSize = number of actual items stored 
        //it is also the location where the next new item will go
        
        int abc[] = new int[5], xyz[]= new int[10];
        xyz = abc;// ok. creates a pointer to abc
        //abc and xyz both point to the same set of numbers
        
        abc[4] = 50;
        System.out.println(xyz[4]);
        
        xyz[1]=99;
        for (int i = 0; i < abc.length; i++) {
            System.out.format("abc[%d] = %d\n",i,abc[i]);
            
        }
        
        
        x[1] = 100; // 2nd location
        int ii = 4;
        x[ii - 1]=94;
        int count7=0;
        for (int i = 0; i < logicalSize; i++) {
            System.out.format("x[%d] = %d\n", i, x[i]);
            if (x[i]==7) count7++;
            
        }
        //System.out.println("There are " + count7 + " 7's in the list");//will only be 2 7's due to the 100 replacement
        //System.out.println(""+ x[10]); won't work, there is no location 10
        System.out.println("Adding 5th assignment mark");
        if(logicalSize < x.length){
            x[logicalSize] = 82;
            logicalSize++;
        }
        System.out.println("Updated lisst of Marks");
        for (int i = 0; i < logicalSize; i++) {
            System.out.format("x[%d] = %d\n", i, x[i]);
        //logicalSize --; // reduces the length of the list    
        }
    }
    
}

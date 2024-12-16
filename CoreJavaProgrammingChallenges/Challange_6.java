
/*
 *
 * Task 6 : Excute static and instance block and how many times it is called  
 * 
 * 
 * 
*/

public class Challange_6 {

        static int counter=0;

    static
    {
        System.out.println("---------------  Calling the [ static ] block fore once.  ---------------\n");
    }
    {
        counter++;
        System.out.println("Calling [ instance ] block for the ["+counter+"] time.");
         
    }
    
}

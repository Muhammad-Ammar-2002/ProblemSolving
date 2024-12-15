/*
 *
 * Task 4 : generate 20 random number with range [100:200]  
 * 
 * 
 * 
 * 

*/

import java.util.Random;

public class Challange_4 {

    static Random r=new Random();

    public static void randomValue()
    {
       //-------------   clear code  --------------------
       for(int i=0;i<20;i++)
       {
        System.out.print(100+r.nextInt(101)+" ");
       }

        //---------------  bad code   -----------------------
        // int counter=0;
        // int value=r.nextInt(200);

        //     while (counter<20) {
        //         if(value>100 )
        //         {
        //              System.out.print(value+" " );
        //              value=r.nextInt(200);
        //              counter++;
        //         }else
        //         {
        //             value=r.nextInt(200);
        //         }
                
        //     }

        
    }
    
}

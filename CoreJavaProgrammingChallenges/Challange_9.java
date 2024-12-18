/*
 * 
 * Task 9 : Display the multiples of 3 || 5 from 0 to 50 
 * 
 * 
 * use continue;
 */


public class Challange_9 {



    public static void Display_multiples(int n1,int n2,int size)
    {
        for(int i=0;i<size;i++)
        {
            if(i%n1==0 || i%n2==0)
            {
           
                if(i%n1==0 && i%n2==0)
                    continue;
            
                System.out.print(i+" ");
            }
            
             
             
        }
        
    }

   
}

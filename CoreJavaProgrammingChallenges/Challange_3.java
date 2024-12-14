/*
 *
 * Task 3 : get number from user and 
 * print is it odd or even
 * and if it is even print the category of it [0:10]  || [11:20] || [>20]
 * 
 * use  nested if;
 * 

*/
public class Challange_3 {

    public static void numStatus(int num)
    {
        if(num>=0)
        {
            if(num%2!=0)
            {
                   System.out.println("The number you submited is [odd]");

            }else
            {
                if(num<=10)
                {
                   System.out.println("The number you submited is [even] and lies in [0:10] group");

                }else if(num>10 && num<=20)
                {
                   System.out.println("The number you submited is [even] and lies in [11:20] group");

                }else
                {
                   System.out.println("The number you submited is [even] and is greater than 20");


                }
            }

        }else{
            System.out.println("The number you submited is [less than zero]");
        }
         

    }
    
}

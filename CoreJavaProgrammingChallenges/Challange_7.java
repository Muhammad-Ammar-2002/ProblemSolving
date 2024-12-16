/*
 * 
 * Task 7 : print the sum of two variables in string format and handle conversion exception
 * 
 * 
 * use Integer.parseInt()
 */


public class Challange_7 {



    public static void addTwoNumbersInStringFormat(String n1,String n2)
    {
        
        try {
                    System.out.println("The sum of ["+n1+"] + ["+n2+"] = "+(Integer.parseInt(n1)+Integer.parseInt(n2)));
                    
                } catch (NumberFormatException e) {
                    System.out.println("In correct input format in ["+n1+"] or ["+n2+"]");
                }
    }
}

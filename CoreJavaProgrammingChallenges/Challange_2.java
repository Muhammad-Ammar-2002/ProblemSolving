/*
 *
 * Task 2 : call all of the class constructors when you are creating a new object
 * 
 * use  this();
 * 
 */

public class Challange_2 {

    Challange_2()
    {
        System.out.println("default constructor");

    }

    Challange_2(String s1)
    {
        this();
        System.out.println("default constructor with one paramater: ["+s1+"]");
        
    }
    Challange_2(String s1,String s2)
    {
        this("one param");
        System.out.println("default constructor with two paramaters: ["+s1 +"] and ["+ s2+"]");
        
    }
    
}

/*
 * 
 * Task 8 : access static method m1() and non-static method m2() using This 
 * 
 * 
 * create non-static method that calls both and then create object from class
 */


public class Challange_8 {



    public void access()
    {
        // this.m1(); not good
        m1(); // OR Challange_8.m1()
        this.m2();
    }

    public static void m1()
    {
        System.out.println("Static method.");
    }

    public  void m2()
    {
        System.out.println("Non-static method.");
    }
}

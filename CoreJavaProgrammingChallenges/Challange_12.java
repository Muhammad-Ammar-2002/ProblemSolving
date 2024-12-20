/*
 * 
 * Task 12 : prove that jvm create parent class before child class every time
 * 
 * 
 * use constructors
 */



public  class Challange_12 {



  public static class Parent {
  
    Parent()
    {
      System.out.println("Parent class");
    }
  }

  public static class Child extends Parent {
  
  Child()
    {
      System.out.println("Child class");
    }
  }

   
}

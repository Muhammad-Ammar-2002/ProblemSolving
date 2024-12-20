/*
 * 
 * Task 11 : Sum of array elements
 * 
 * 
 * use foreach
 */



public class Challange_11 {



  
public static void arraySumOfElements(int...arr)
{
  int sum=0;
  for(int i : arr)
  {
    sum+=i;
  }
  System.out.println(sum);
}

   
}

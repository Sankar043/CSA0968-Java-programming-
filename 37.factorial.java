import java.util.*;
import java.io.*;
class factorial
{
public static void main(String[] arg)
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number:");
   int num=sc.nextInt();
   if(num>0)
   {
      int fact=1;
      for(int i=1;i<=num;i++)
      {
         fact=fact*i; 
      }
       System.out.println(num+" factorial is: "+fact);  
    }
   
}
}

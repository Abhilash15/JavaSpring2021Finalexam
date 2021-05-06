/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author S542295
 */
public class Throw {
public static void validate(int age)
{  
	     if(age<23)  
	      throw new ArithmeticException("not valid");  
	     else  
              System.out.println("Question9 : Abhilash Dhumala");
	      System.out.println("welcome to vote");  
	   }  
	   public static void main(String args[])
{  
	      validate(13);  
              System.out.println("rest of the code...");  
	  }  
}

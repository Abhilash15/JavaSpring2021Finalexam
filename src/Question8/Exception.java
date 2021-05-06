/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author S542295
 */
public class Exception {
	public static void main(String args[])
 {
		  int d = 0;
		  int n = 30;
                  System.out.println("Question8 : Abhilash Dhumala");
		  try {
		   int fraction = n / d;
                   
		   System.out.println("This line will not be Executed");
		  } catch (ArithmeticException e) 
{
		   System.out.println("In the catch Block due to Exception = " + e);
		  }
		  System.out.println("End Of Main");
		 }
}


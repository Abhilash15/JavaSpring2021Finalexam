/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

import java.io.IOException;

/**
 *
 * @author S542295
 */
public class ThrowsExample
{
	void m()throws IOException
{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException
{  
	    m();  
	  }  
	  void p() throws IOException
{  
	   try
{  
	    n();  
	   }catch(Exception e){
               System.out.println("Question9 : Abhilash Dhumala");
               System.out.println("exception handled");
}  
	  }  
	  public static void main(String args[]) throws IOException
{  
		  ThrowsExample obj=new ThrowsExample();  
	   obj.p(); 
	   System.out.println("normal flow...");  
	  }  
}



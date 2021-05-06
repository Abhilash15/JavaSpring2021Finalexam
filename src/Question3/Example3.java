/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author S542295
 */
public class Example3 {
 public static void main(String args[])  
{  
double d = 155.44;  
//converting double data type into long data type  
long l = (long)d;  
//converting long data type into int data type  
int i = (int)l;  
System.out.println("Question3 : Abhilash Dhumala");
System.out.println("Before conversion: "+d);  
//fractional part lost  
System.out.println("After conversion into long type: "+l);  
//fractional part lost  
System.out.println("After conversion into int type: "+i);  
}   
}
   

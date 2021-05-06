/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author S542295
 */
public class UnCheckedExceptions {
     public static void main(String args[]) 
{
		String crunchifyArr[] = { "Crunchify", "Google", "Yahoo", "Amazon", "eBay" };
String myString = crunchifyArr[7]; // This throws ArrayIndexOutOfBoundException
		System.out.println(myString);
	}
}



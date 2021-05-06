/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_5;

/**
 *
 * @author S542295
 */
public class MainDriver {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 5: Abilash Dumala");
	ComparableCircle Circle1 = new ComparableCircle(8);
	ComparableCircle Circle2 = new ComparableCircle(16);
	System.out.println("Circle1: ");
	System.out.println(Circle1);
	System.out.println("Circle2: ");
	System.out.println(Circle2);
	System.out.println((Circle1.compareTo(Circle2) == 1 ? "Circle1 " : "Circle2") + " is the larger then two Circles");
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author S542295
 */
public class Rectangle extends Shape {
  
    public static void main(String args[]) 
{
        Rectangle obj = new Rectangle();
        obj.b = 200;
        obj.calculateArea();
    }
    public void calculateArea() 
{
        System.out.println("Area is " + (b * b));
    }

}

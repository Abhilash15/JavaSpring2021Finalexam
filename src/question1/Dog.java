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
public class Dog implements Pet{
    public void test() {
        System.out.println("abhilash dhummala -S542295");
        System.out.println("Interface Method Implemented");
    }
    public static void main(String args[]) 
{
        Pet p = new Dog();
        p.test();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

/**
 *
 * @author S542295
 */
public class Example {

    /**
     * @param args the command line arguments
     */
   public static int arr[] = {12, 15, 670, 51, 21};
    
    /* Recursive Method to search x in arr[l..r] */
    static int recSearch(int arr[], int l, int r, int x)
    {
         if (r < l)
            return -1;
         if (arr[l] == x)
            return l;
         if (arr[r] == x)
            return r;
         return recSearch(arr, l+1, r-1, x);
    }
     
    // Driver method
    public static void main(String[] args)
    {
       int x = 211;
        
       //Method call to find x
       System.out.println("Question10 : Abhilash Dhumala");
       int index = recSearch(arr, 0, arr.length-1, x);
       if (index != -1)
          System.out.println("Element " + x + " is present at index " +
                                                   index);
       else
           System.out.println("Element " + x + " is not present");
       }
}


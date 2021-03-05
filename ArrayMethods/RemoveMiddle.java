package ArrayMethods;

import java.util.Random;

public class RemoveMiddle
{
   public void removeMiddle(int[] arr)
   {
      int size = arr.length;
       // Size is even
      if (size % 2 == 0) {
          
          arr[size/2] = 0;
          arr[size/2 - 1] = 0;
          
          for (int i = size/2 - 1; i < size; i++) {
              
              //System.out.print(i + "------");
              if (i < size - 2) {
                  arr[i] = arr[i + 2]; }
              else {
                  arr[i] = 0; }
                  
          }
          
        }
        
      // Size is odd  
      else {
          arr[size/2] = 0;
          for (int i = size/2; i < size; i++) {
              
              if (i < size - 1) {
                  arr[i] = arr[i + 1]; }
              else {
                  arr[i] = 0; }
          }
        }
          
      
         // Figure out starting point for removal


         // Remove middle two elements


      // Size is odd

         // Figure out starting point for removal


         // Remove middle element


   }

   public static void main(String[] args)
   {
      int[] randoms = new int[11];
      RemoveMiddle util = new RemoveMiddle();
      Random generator = new Random();

      // Create a test array containing random numbers
      for (int i = 0; i < randoms.length; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Remove the middle element(s)
      util.removeMiddle(randoms);

      // Print again to see new order.
      for (int i = 0; i < randoms.length; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      randoms = new int[10];
      // Create a test array with an even number of elements
      for (int i = 0; i < randoms.length; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Remove the middle element(s)
      util.removeMiddle(randoms);

      // Print again to see new order.
      for (int i = 0; i < randoms.length; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();
   }
}

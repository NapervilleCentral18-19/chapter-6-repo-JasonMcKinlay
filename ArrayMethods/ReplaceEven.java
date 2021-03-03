package ArrayMethods;

import java.util.Random;

public class ReplaceEven
{
   public void replaceEven(int[] arr)
   {
       for (int i = 0; i < arr.length - 1; i++) {
           if (arr[i] % 2 == 0) {
               arr[i] = 0; }
        }
   }

   public static void main(String[] args)
   {
      int[] randoms = new int[10];
      ReplaceEven util = new ReplaceEven();
      Random generator = new Random();

      // Create a test array containing random numbers.
      for (int i = 0; i < 10; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Replace the even elements.
      util.replaceEven(randoms);

      // Print again to see new elements.
      for (int i = 0; i < 10; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();
   }
}

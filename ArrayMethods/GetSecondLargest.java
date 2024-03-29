package ArrayMethods;

//package ArrayMethods;

 

import java.util.Random;

public class GetSecondLargest
{
   public int getSecondLargest(int[] arr)
   {
      // One way to do it: Find maximum once.
      int count = 0;
      int max = 0;
      
      for (int num:arr) {
          if (count != 0) {
              if (arr[count] > arr[count - 1]) {
                  max = arr[count]; }
              }
          count++; }

      // 2. Find the max again, ignoring the real max.
      int oldMax = max;
      count = 0;
      for (int num:arr) {
          if (count != 0) {
              if (arr[count] > arr[count - 1] && arr[count] != oldMax) {
                  max = arr[count]; }
              }
          count++; }

      return max;

   }

   public static void main(String[] args)
   {
      int[] randoms = new int[10];
      Random generator = new Random();

      // Create a test array containing random numbers.
      for (int i = 0; i < randoms.length; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Find the second largest.
      GetSecondLargest util = new GetSecondLargest();
      System.out.println("The second largest number is "
            + util.getSecondLargest(randoms));
   }
}

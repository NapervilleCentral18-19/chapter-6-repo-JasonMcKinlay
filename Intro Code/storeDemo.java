import java.util.*;

public class storeDemo
{

   public static void main(String[] args)
   {
      Store myStore = new Store();

      Scanner in = new Scanner(System.in);
      boolean done = false;
      int i = 0;

      while (!done)
      {
         System.out.println("Enter the price: (enter 0 to end) ");
         double d = in.nextDouble();
         if (d == 0)
         {
            done = true;
         }
         else
         {
             System.out.println("Enter the name: ");
             String name = in.next();
             myStore.addSales(name, d);
             System.out.print("\n");
         }
      }


      System.out.println("\nBest customer's name: "
            + myStore.nameOfBestCustomer());
            
      /**
       * Sample Output
       * 
       * Enter the price: (enter 0 to end) 
       * 39.99
       * Enter the name: 
       * Jason
       * 
       * Enter the price: (enter 0 to end) 
       * 29.99
       * Enter the name: 
       * Spongebob
       * 
       * Enter the price: (enter 0 to end) 
       * 37.99
       * Enter the name: 
       * Alan
       * 
       * Enter the price: (enter 0 to end) 
       * 52.49
       * Enter the name: 
       * Hermione
       * 
       * Enter the price: (enter 0 to end) 
       * 0
       * 
       * Best customer's name: Hermione
       */      
   }
}

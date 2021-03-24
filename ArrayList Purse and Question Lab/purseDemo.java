
/**
 * Write a description of class purseDemo here.
 *
 * @author Jason McKinlay
 * @version 3/19/21
 * Client class for purse
 */
import java.util.Scanner;
public class purseDemo
{
    public static void main (String[] args) {
        Purse myPurse = new Purse();
        Scanner in = new Scanner(System.in);
        boolean done = false;
        
        
        while (!done) {
            System.out.println("A - Add a coin\nR - Remove a coin\n? - Display purse\nE - Exit");
            String choice = in.next();
        
            if (choice.equals("A")) {
                System.out.println("\nEnter the type of coin: ");
                String sType = in.next();
                char type = sType.charAt(0);
                
                myPurse.add(new Coin(type));
            }
        
            else if (choice.equals("R")) {
                System.out.println("\nEnter the type of coin: ");
                String sType = in.next();
                char type = sType.charAt(0);
                
                myPurse.remove(new Coin(type));
            }
            
            else if (choice.equals("?")) {
                System.out.println("\n" + myPurse + "\n");
            }
            
            else if (choice.equals("E")) {
                done = true;
            }
            
        }
        
    }
}

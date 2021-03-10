
/**
 * Write a description of class gameOfNim here.
 *
 * @author Jason McKinlay & Kalani Staudacher
 * @version 3/10/21
 * Game Of Nim
 */

import java.util.Scanner;
public class gameOfNim
{
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int[] stones = {3, 5, 8};
        displayNim(stones);                  
        
        boolean runGame = true;
        int total = 0;
        while (runGame) {
            
            
            
            
            for (int i = 0; i < stones.length - 1; i++) {
                total += stones[i];
                if (total == 1) {
                    runGame = false; }
                
            }
        }
        
        
        
    }
    
    public static void displayNim (int[] stones) {
        
    
        for (int i = 0; i < stones.length; i++) {
            for (int j = 0; j < stones[i]; j++) {
                System.out.print("O"); }
            System.out.print("\n");
        }
        
    }
}

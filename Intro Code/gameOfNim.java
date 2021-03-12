
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
        //displayNim(stones);                  
        
        boolean runGame = true;
        int pile, amt, total;
        int pCount = 1; //if odd, player 1's turn, if even, player 2's turn
        
        while (runGame) {
            
            total = 0;
            displayNim(stones);
            System.out.println("--------\n");
            
            if (pCount % 2 != 0) {
                System.out.println("P1's turn: Which pile do you want to take from? ");
                pile = keyboard.nextInt();
                System.out.println("How many stones do you want to take? ");
                amt = keyboard.nextInt();
                
                if (amt > stones[pile - 1]) {
                    System.out.println("Error, took too many stones"); }
                else {
                    stones[pile - 1] -= amt; }
            }
            
            else {
                System.out.println("P2's turn: Which pile do you want to take from? ");
                pile = keyboard.nextInt();
                System.out.println("How many stones do you want to take? ");
                amt = keyboard.nextInt();
                
                if (amt > stones[pile - 1]) {
                    System.out.println("Error, took too many stones");
                }
                else {
                    stones[pile - 1] -= amt; }
                }
                
            
            for (int i = 0; i < stones.length; i++) {
                total += stones[i]; }
            if (total <= 1) {
                runGame = false; }
                
            pCount++;
    }
    
    pCount++;
    if (pCount % 2 != 0) {
        System.out.println("Player 1 wins!"); }
    else {
        System.out.println("Player 2 wins!"); }
        
        
        
    }
    
    public static void displayNim (int[] stones) {
        
    
        for (int i = 0; i < stones.length; i++) {
            for (int j = 0; j < stones[i]; j++) {
                System.out.print("O"); }
            System.out.print("\n");
        }
        
    }
}

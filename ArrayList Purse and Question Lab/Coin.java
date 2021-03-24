/**
*  Edit class to fullfill Purse Requirements
*
*  Jason McKinlay
*  3/19/21
*  Coin class
*/

import java.util.Random;

public class Coin
{
   private double value;
   private char type;

   /**-----------------------------------------------------------------
   *  Constructor for coin
   */
   public Coin (char type)
   {
      this.type = type;
      if (type == 'P') {
          value = 0.01; }
          
      if (type == 'N') {
          value = 0.05; }
          
      if (type == 'D') {
          value = 0.1; }
          
      if (type == 'Q') {
          value = 0.25; }
   }
   
   /**-----------------------------------------------------------------
   *  Overloaded constructor for coin
   */
   public Coin (double value)
   {
      this.value = value;
      if (value == 0.01) {
          type = 'P'; }
          
      if (value == 0.05) {
          type = 'N'; }
          
      if (value == 0.1) {
          type = 'D'; }
          
      if (value == 0.25) {
          type = 'Q'; }
   }

   /**-----------------------------------------------------------------
    * getValue() - returns value of Coin
    * @return double of value
    */
   public double getValue()
   {
       return value;
   }
   
   /**-----------------------------------------------------------------
    * getType() - returns type of Coin
    * @return char of type
    */
   public char getType()
   {
       return type;
   }
   
   /**-----------------------------------------------------------------
   *  Returns the type of coin as a String and the value
           @return String
   */
   public String toString()
   {
      if (type == 'P') {
          return "Penny\t" + value;
      }
      else if (type == 'N') {
          return "Nickel\t" + value;
      }
      else if (type == 'D') {
          return "Dime\t" + value;
      }
      else {
          return "Quarter\t" + value;
      }
   }
}


/**
 * Write a description of class MagicSquare here.
 *
 * @author Jason McKinlay
 * @version 3/12/21
 * Magic Square Class
 */
public class MagicSquare
{
    private int magicNum = 0;
    private int[][] arr;
    /**
     * Constructor for objects of class MagicSquare
     */
    public MagicSquare(int[][] array)
    {
        arr = array;
        for (int row = 0; row < arr.length; row++) {
            magicNum += arr[row][0];
        }
    }

    /**
     * isMagic - returns whether or not 2D array given is magic or not
     *
     * @return boolean of whether or not the square is magic or not
     */
    public boolean isMagic ()
    {
        int total1 = 0, total2 = 0;
        magicNum = getMagicNum();
        
        //Adds up sum of each row + each column
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                total1 += arr[row][col];
            }
            if (total1 != magicNum) {
                return false; }
            else {
                total1 = 0; }
        }
        
        //Adds up sum of array diagonally
        for (int num = 0; num < arr.length; num++) {
            total1 += arr[num][num]; //gets the sum of array diagonally from top left to bottom right
            total2 += arr[(arr.length - 1) - num][num]; //gets the sum of array diagonally from top right to bottom left
        }
        if (total1 != magicNum || total2 != magicNum) {
                return false; }
            else {
                total1 = 0;
                total2 = 0; }
                
        return true;
    }
    
    /**
     * getMagicNum()
     * @return int of magic num
     */
    public int getMagicNum ()
    {
        magicNum = 0;
        
        for (int row = 0; row < arr.length; row++) {
            magicNum += arr[row][0]; }
           
        return magicNum;
    }
    
    /**
     * setMagicSquare()
     * @param 2D array of ints
     */
    public void setMagicSquare (int[][] array) 
    {
        arr = array;
    }
    
    
    /**
     * toString()
     * @return formatted String of the array
     */
    public String toString ()
    {
        String table = "";
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                table += arr[row][col] + "  ";
            }
            table += "\n";
        }
        return table;
    }
}

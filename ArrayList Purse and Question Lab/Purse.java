/**
 * Write a description of class Purse here.
 *
 * @author Jason McKinlay
 * @version 3/19/21
 * Purse Class
 */
import java.util.*;

public class Purse
{
    private ArrayList <Coin> pocket = new ArrayList<Coin>();
    
    /**
     * Default constructor for Purse
     */
    public Purse()
    {
        pocket.add(new Coin('Q'));
        pocket.add(new Coin('Q'));
        pocket.add(new Coin('Q'));
        pocket.add(new Coin('Q'));
        pocket.add(new Coin('N'));
    }
    
    /**
     * Overloaded constructor for ArrayList of Coins
     */
    public Purse(ArrayList <Coin> coins)
    {
        pocket = coins;
    }
    
    /**
     * add() - adds a coin to the ArrayList
     * @param Coin
     */
    public void add(Coin coin)
    {
        pocket.add(coin);
    }
    
    /**
     * remove() - removes a coin from the ArrayList
     * @param Coin
     */
    public void remove(Coin coin)
    {
        for (int i = 0; i < pocket.size(); i++) {
            if (pocket.get(i).getType() == coin.getType()) {
                pocket.remove(i);
            }
        }
        //pocket.remove(coin);
    }
    
    /**
     * getTotal() - returns the total of all coins in pocket
     * @return double of total values
     */
    public double getTotal()
    {
        double total = 0;
        for (Coin coin:pocket) {
            total += coin.getValue();
        }

        return total;
    }

    /**
     * getNumberOfPenny() - returns amt of pennies in pocket
     * @return int of total amt of pennies
     */
    public int getNumberOfPenny()
    {
        int amt = 0;
        for (Coin coin:pocket) {
            if (coin.getType() == 'P') {
               amt++;
            }
        }
        
        return amt;
    }

    /**
     * getNumberOfNickels() - returns amt of nickels in pocket
     * @return int of total amt of nickels
     */
    public int getNumberOfNickels()
    {
        int amt = 0;
        for (Coin coin:pocket) {
            if (coin.getType() == 'N') {
               amt++;
            }
        }
        
        return amt;
    }
    
    /**
     * getNumberOfDimes() - returns amt of dimes in pocket
     * @return int of total amt of dimes
     */
    public int getNumberOfDimes()
    {
        int amt = 0;
        for (Coin coin:pocket) {
            if (coin.getType() == 'D') {
               amt++;
            }
        }
        
        return amt;
    }
    
    /**
     * getNumberOfQuarters() - returns amt of quarters in pocket
     * @return int of total amt of quarters
     */
    public int getNumberOfQuarters()
    {
        int amt = 0;
        for (Coin coin:pocket) {
            if (coin.getType() == 'Q') {
               amt++;
            }
        }
        
        return amt;
    }
    
    
    public String toString()
    {
        String purse = getNumberOfPenny() + " Pennies\t0.01\n";
        purse += getNumberOfNickels() + " Nickels\t0.05\n";
        purse += getNumberOfDimes() + " Dimes   \t0.10\n";
        purse += getNumberOfQuarters() + " Quarters\t0.25\n";
        purse += "Total\t" + getTotal();
        return purse;
    }

}
//end of purse


/**
 * Write a description of class Store here.
 *
 * @author Jason McKinlay
 * @version 3/19/21
 * Store Class
 */

import java.util.*;
public class Store
{
    
    ArrayList <Customer> customers;

    /**
     * Constructor for objects of class Store
     */
    public Store()
    {
        customers = new ArrayList<Customer>();
    }

    /**
     * addSales() - adds a customer and the amount they purchased to the ArrayList
     *
     * @param String of customer's name, double of amount of $ they spent
     */
    public void addSales(String customerName, double amount)
    {
        Customer customer = new Customer(customerName, amount);
        customers.add(customer);
    }
    
    /**
     * nameOfBestCustomer() - returns the name of whoever purchased the most
     * @return String of customer's name
     */
    public String nameOfBestCustomer() 
    {
        double max = 0; //will be set to whichever customer has the max amount of purchases
        String bestCustomer = "";
        
        for (Customer person:customers) {
            if (person.getAmount() > max) {
                bestCustomer = person.getName();
                max = person.getAmount();
            }
        }
        
        return bestCustomer;
    }
}

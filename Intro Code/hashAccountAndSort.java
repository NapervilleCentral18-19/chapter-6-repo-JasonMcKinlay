
/**
 * Write a description of class hashAccountAndSort here.
 *
 * @author Jason McKinlay
 * @version 3/26/21
 * Hash Account And Sort
 */
public class hashAccountAndSort
{
    public static void main (String[] args) 
    {
        Account acc1 = new Account("Homer Simpson", 0001, 1090.45, 1);
        Account acc2 = new Account("Homer Simpson", 0002, 786.54, 2);
        Account acc3 = new Account("Bart Simpson", 1564, 4571.60, 1);
        Account acc4 = new Account("Liz Wilson", 1349, 2034.52, 2);
        Account acc5 = new Account("Jack Hagested", 2389, 280.67, 1);
        Account acc6 = new Account("Jack Hagested", 2391, 1008.53, 2);
        Account acc7 = new Account("Emy Hayes", 3598, 1260.84, 1);
        Account acc8 = new Account("Doug Dralle", 4562, 5783.90, 1);
        Account acc9 = new Account("Eric Willhelm", 3208, 3420.75, 1);
        Account acc10 = new Account("Julie Noris", 4568, 9041.49, 2);
        
        Account[] arr = {acc1, acc2, acc3, acc4, acc5, acc6, acc7, acc8, acc9, acc10};
        
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[index]) < 0) {
                    index = j;
                }
                Account temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        
        for (Account acc:arr) {
            //System.out.println(acc.hashCode());
            System.out.println(acc); 
        }
        
        
        
    }
}

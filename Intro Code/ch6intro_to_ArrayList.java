/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;
import java.util.ArrayList;//yes AL are in util

public class ch6intro_to_ArrayList

{
    final static int MAX = 20;

public static void main (String[] args)
{
    //ArrayList notes
/**/
    // <> indicates the type of ArrayList
    //<type of object> & only use objects
    /*
    ArrayList <String> farm = new ArrayList<>();

    farm.add("cow");farm.add("chicken");
    for (int i = 0; i<20;i++)
    {
        farm.add("cow");
        farm.add("chicken");
        farm.add("chicken");
        farm.add("duck");
        farm.add("horse");

    }
    farm.add("dog");farm.add("dog");farm.add("dog");
    farm.add("pig");farm.add("pig");farm.add("pig");
    farm.add("pig");farm.add("pig");farm.add("pig");

    System.out.println(farm);

    int count = 0;
    //int size = farm.size(); going backward thru AL will delete all
    for (int i = farm.size() - 1; i > -1; i--)
    {
        //.get() return the object at the index
        if(farm.get(i).equals("chicken"))
            count++;

        if (farm.get(i).equals("chicken")) 
            farm.remove(i);
            


        
    }

    System.out.println("There are " + count + " chickens");
    //.add(obj) where does it add the object??? - at the end
    //.add(index, obj) added at index
    farm.add(1,"wife");
    farm.add(1, "daughter");
    String emy = farm.get(1);
    //.set(index, obj)
    String obj = farm.set(2, "son");

    System.out.println(farm);

    ArrayList <String> list = new ArrayList<>();
    */
    //ArrayList <int> list1 = new ArrayList<>();// no primitive data types
    
    ArrayList <Integer> list1 = new ArrayList<>();
    Random generator = new Random();
    for (int i = 0; i < 10; i++) {
        list1.add(generator.nextInt(100));
    }
    
    int sum = 0;
    ArrayList <Integer> list2 = new ArrayList<>();
    for (int i = list1.size() - 1; i >= 0; i--) {
        list2.add(list1.get(i));
        sum += list1.get(i);
    }
    
    sum /= 10;
    list2.add(0, sum);
    list2.add(list2.size(), sum);
    
    System.out.println(list1);
    System.out.println(list2);
    
    //ArrayList <CD> mycds = new ArrayList<>();

    //for(int i = 0; i<3; i++)
    //{
/*
    mycds.add(new CD("Wilco","Jeff Tweety",12.99,16);
    mycds.add(new CD("Throwup","Britiny Spears",12.99,16);
    mycds.add(new CD("Oxygen","CatFish and the Bottlemen",12.99,16);

    System.out.print(mycds);
*/
    //}

}// end of main

}// end of class












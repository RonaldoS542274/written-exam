/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneDarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S542274
 */
 class Main
 {
   public static void removeDuplicate(ArrayList<Integer> list)
   {
     //ArrayList to store resultant distinct elements
     ArrayList <Integer> res = new ArrayList<Integer> ();
     
     //temp value to get element from list
     int v;
     for(int i=0;i<10;i++)
     {
       v = list.get(i);
       
       //check if v already present in res
       //indexOf(v) == -1 means not present in the list
       if(res.indexOf(v) == -1)
       {
         res.add(v);
       }
     }
     
     //print result using for each loop
     for(Integer i : res)
     {
       System.out.print(i+" ");
     }
   }
   
   public static void main(String args[])
   { 
     Scanner in = new Scanner(System.in);
     
     //create list 
     ArrayList <Integer> list = new ArrayList <Integer> ();
     
     //ask the user to enter 10 integers
     System.out.println("Enter 10 integers to a list");
     
     //add 10 integers to the list
     for(int i=0;i<10;i++)
     {
       list.add(in.nextInt());
     }
     
     //call the function to remove duplicates
     removeDuplicate(list);
   }
 }

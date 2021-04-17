/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vipparthi_2.darray;

import java.util.Scanner;

/**
 *
 * @author S542274
 */
public class Example {
  
   public static boolean equals(int[][] M1, int[][] M2)
   {
       int count = 0;
      
       for(int i = 0; i < 3; i++)
       {
           for(int j = 0; j < 3; j++)
           {
               if(M1[i][j] == M2[i][j]) // comparing the both arrays
               {
                   count++;
               }
               else
               {
                   break;
               }
           }
       }
      
       if(count == 9)
       {
           return true; // if identical
       }
       else
       {
           return false; // if not identical
       }
      
   }
  
   public static void main(String[] args) {
      
       Scanner s = new Scanner(System.in);
       int a[][] = new int[3][3];
       int b[][] = new int[3][3];
       System.out.println("Enter list 1: ");
       for(int i = 0; i < 3; i++)
       {
           for(int j = 0; j < 3; j++)
           {
               a[i][j] = s.nextInt(); // read list1
           }
       }
      
       System.out.println("Enter list 2: ");
       for(int i = 0; i < 3; i++)
       {
           for(int j = 0; j < 3; j++)
           {
               b[i][j] = s.nextInt(); // read list2
           }
       }
      
       boolean result = equals(a, b); // call the function equals
       if(result)
       {
           System.out.println("The two arrays are strictly identical");
       }
       else
       {
           System.out.println("The two arrays are not strictly identical");
       }
   }

}
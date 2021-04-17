/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S542274
 */

class Main{
    public static void main(String[] args) {
        ArrayList<Object> obj = new ArrayList<Object>();
        obj.add(new Loan(35000,10.5,5));
        obj.add(new Date());
        obj.add("Test");
        
        for(Object x : obj){
            System.out.println(x.toString());
        }
    }
}


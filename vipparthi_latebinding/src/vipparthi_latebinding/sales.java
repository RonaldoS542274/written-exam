/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vipparthi_latebinding;

/**
 *
 * @author S542274
 */
class Sales{
   void print(){
       System.out.println("This is base class");
   }
}

class DiscountSale extends Sale{
   void print(){ //since this is of void type and overriding, hence this
       // is late binding, and if the method is static then it would be called
       // early binding.
       System.out.println("This is derived class");
   }
}

class A{
   public static void main(String[] args) {
       Sale A = new Sale();
       Sale B = new DiscountSale();
       A.print();
       B.print();
   }
}
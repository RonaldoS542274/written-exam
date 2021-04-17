/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vipparthi_person;

/**
 *
 * @author S542274
 */
public class Person {
public String name;
public String address;
public String phone;
public String email;

public Person(String name, String address, String phone, String email) {
this.name = name;
this.address = address;
this.phone = phone;
this.email = email;
}
@Override
public String toString() {
return this.getClass().getName() + "\n" + name;
}
}

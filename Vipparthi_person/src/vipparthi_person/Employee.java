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
public class Employee extends Person {
public String office;
public double salary;

public Employee(String name, String address, String phone, String email) {
super(name, address, phone, email);
}
}
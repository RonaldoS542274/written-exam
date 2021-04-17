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
public class Student extends Person {
// capitalize CLASS_STATUS variable is a typical Java convention
// for variables that have been declared as final (aka: constant)
public final String CLASS_STATUS;
public Student(String name, String address, String phone, String email, String classStatus) {
super(name, address, phone, email);
CLASS_STATUS = classStatus;
}
}


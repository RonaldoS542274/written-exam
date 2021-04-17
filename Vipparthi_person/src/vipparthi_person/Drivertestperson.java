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
public class Drivertestperson {

    public static void main(String[] args) {
Person person = new Person("John Doe", "123 Somewhere", "415-555-1212", "johndoe@somewhere.com");
Person student = new Student("Mary Jane", "555 School Street", "650-555-1212", "mj@abc.com", "junior");
Person employee = new Employee("Tom Jones", "777 B Street", "408-888-9999", "tj@xyz.com");
Person faculty = new Faculty("Jill Johnson", "999 Park Ave", "925-222-3333", "jj@abcxyz.com");
Person staff = new Staff("Jack I. Box", "21 Jump Street", "707-212-1112", "jib@jack.com");

System.out.println(person.toString() + "\n");
System.out.println(student.toString() + "\n");
System.out.println(employee.toString() + "\n");
System.out.println(faculty.toString() + "\n");
System.out.println(staff.toString() + "\n");
}
}
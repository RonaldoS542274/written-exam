/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

/**
 *
 * @author S542274
 */
class Loan{
    double amount;
    double rate;
    int time;
    Loan(){

    }

    public Loan(double amount, double rate, int time) {
        this.amount = amount;
        this.rate = rate;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }
}

class Circle{
    double x,y,r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}

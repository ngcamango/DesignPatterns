/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.designpatterns.decoratorpattern;

/**
 *
 * @author ngcamango
 */
public class WingDecorator extends AnimalDecorator{
    public WingDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String describe() {
            animal.describe();
           // System.out.println("I have wings.");
            fly();
            return("I have wings.");
    }

    public void fly() {
            System.out.println("I can fly.");
    }
}

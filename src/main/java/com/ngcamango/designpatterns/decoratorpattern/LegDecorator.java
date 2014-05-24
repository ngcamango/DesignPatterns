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
public class LegDecorator extends AnimalDecorator{
    public LegDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String describe() {
            animal.describe();
            //return("I have legs.");
            dance();
            return("I have legs.");
    }

    public void dance() {
            System.out.println("I can dance.");
    }
}

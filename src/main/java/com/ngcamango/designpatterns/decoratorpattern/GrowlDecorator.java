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
public class GrowlDecorator extends AnimalDecorator{
    public GrowlDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String describe() {
            animal.describe();
            growl();
            return("I growl.");
    }

    public void growl() {
            System.out.println("Grrrrr.");
    }
}

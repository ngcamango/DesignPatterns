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
public class LivingAnimal implements Animal{
    @Override
    public String describe() {
            return("\nI am an animal.");
    }
}

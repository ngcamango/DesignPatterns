/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.designpatterns.abstractfactorypattern;

import com.ngcamango.designpatterns.abstractfactorypattern.animals.Animal;
import com.ngcamango.designpatterns.abstractfactorypattern.animals.Cat;
import com.ngcamango.designpatterns.abstractfactorypattern.animals.Dog;

/**
 *
 * @author ngcamango
 */
public class MammalFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if ("dog".equals(type)) {
                return new Dog();
        } else {
                return new Cat();
        }
    }

}
    

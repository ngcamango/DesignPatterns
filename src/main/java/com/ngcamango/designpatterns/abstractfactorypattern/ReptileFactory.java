/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.designpatterns.abstractfactorypattern;

import com.ngcamango.designpatterns.abstractfactorypattern.animals.Animal;
import com.ngcamango.designpatterns.abstractfactorypattern.animals.Snake;
import com.ngcamango.designpatterns.abstractfactorypattern.animals.Tyrannosaurus;

/**
 *
 * @author ngcamango
 */
public class ReptileFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if ("snake".equals(type)) {
                return new Snake();
        } else {
                return new Tyrannosaurus();
        }
    }

}

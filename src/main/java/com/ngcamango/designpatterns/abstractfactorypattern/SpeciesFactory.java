/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.designpatterns.abstractfactorypattern;

import com.ngcamango.designpatterns.abstractfactorypattern.animals.Animal;

/**
 *
 * @author ngcamango
 */
public abstract class SpeciesFactory {
    public abstract Animal getAnimal(String type);
}

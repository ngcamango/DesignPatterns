/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.designpatterns.momentopattern;

/**
 *
 * @author ngcamango
 */
public class DietInfoCaretaker {
    
    Object objMemento;

    public void saveState(DietInfo dietInfo) {
            objMemento = dietInfo.save();
    }

    public void restoreState(DietInfo dietInfo) {
            dietInfo.restore(objMemento);
    }
}

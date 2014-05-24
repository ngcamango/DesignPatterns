/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.designpatterns.iteratorpattern;

/**
 *
 * @author ngcamango
 */
public class Item {
    String name;
    float price;

    public Item(String name, float price) {
            this.name = name;
            this.price = price;
    }

    public String toString() {
            return name + ": $" + price;
    }
}

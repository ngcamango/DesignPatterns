/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.designpatterns.observerpattern;

/**
 *
 * @author ngcamango
 */
public class WeatherCustomer1 implements WeatherObserver{
    @Override
	public void doUpdate(int temperature) {
		System.out.println("Weather customer 1 just found out the temperature is:" + temperature);
	}
}

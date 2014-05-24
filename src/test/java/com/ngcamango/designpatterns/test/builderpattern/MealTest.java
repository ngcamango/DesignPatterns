/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.designpatterns.test.builderpattern;

import com.ngcamango.designpatterns.builderpattern.ItalianMealBuilder;
import com.ngcamango.designpatterns.builderpattern.JapaneseMealBuilder;
import com.ngcamango.designpatterns.builderpattern.Meal;
import com.ngcamango.designpatterns.builderpattern.MealBuilder;
import com.ngcamango.designpatterns.builderpattern.MealDirector;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ngcamango
 */
public class MealTest {
    
    public MealTest() {
    }

    @Test
    public void testMeal() {
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        //Assert.assertEquals(meal, "red wine,pizza,bread");
        System.out.println("meal is: " + meal);

        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealDirector.getMeal();
        //Assert.assertEquals(meal, "sake,chicken teriyaki,miso soup");
        System.out.println("meal is: " + meal);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

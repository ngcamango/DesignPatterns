/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.designpatterns.test.adapterpattern;

import com.ngcamango.designpatterns.adapterpattern.TemperatureClassReporter;
import com.ngcamango.designpatterns.adapterpattern.TemperatureInfo;
import com.ngcamango.designpatterns.adapterpattern.TemperatureObjectReporter;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ngcamango
 */
public class TemperatureTest {
    
    public TemperatureTest() {
    }

        @Test
        public void testTemperature() {
        {
            // class adapter
            System.out.println("class adapter test");
            TemperatureInfo tempInfo = new TemperatureClassReporter();
            testTempInfo(tempInfo);

            // object adapter
            System.out.println("\nobject adapter test");
            tempInfo = new TemperatureObjectReporter();
            testTempInfo(tempInfo);

        }

        
    }
        
    public static void testTempInfo(TemperatureInfo tempInfo) 
    {
        tempInfo.setTemperatureInC(0);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());

        tempInfo.setTemperatureInF(85);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());
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

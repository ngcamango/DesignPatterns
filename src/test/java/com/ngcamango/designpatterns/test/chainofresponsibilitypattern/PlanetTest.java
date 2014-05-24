/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.designpatterns.test.chainofresponsibilitypattern;

import com.ngcamango.designpatterns.chainofresponsibilitypattern.EarthHandler;
import com.ngcamango.designpatterns.chainofresponsibilitypattern.MercuryHandler;
import com.ngcamango.designpatterns.chainofresponsibilitypattern.PlanetEnum;
import com.ngcamango.designpatterns.chainofresponsibilitypattern.PlanetHandler;
import com.ngcamango.designpatterns.chainofresponsibilitypattern.VenusHandler;
import org.testng.Assert;
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
public class PlanetTest {
    
    public PlanetTest() {
    }

    @Test
    public void testPlanet() {
        PlanetHandler chain = setUpChain();

        chain.handleRequest(PlanetEnum.VENUS);
        chain.handleRequest(PlanetEnum.MERCURY);
        chain.handleRequest(PlanetEnum.EARTH);
        chain.handleRequest(PlanetEnum.JUPITER);
	
    }
    
    public static PlanetHandler setUpChain() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);

        return mercuryHandler;
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

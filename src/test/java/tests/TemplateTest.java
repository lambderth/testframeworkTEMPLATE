package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestComponents.BaseTest;

public class TemplateTest extends BaseTest {

    @Test
    public void searchOnGoogle() {
        templatePage.searchSomething("Busqueda de prueba");
        
        // Mock assertions
        Assert.assertEquals(true, true);
        
        // Just for show, don't use this
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

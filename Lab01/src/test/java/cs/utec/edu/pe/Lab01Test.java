package cs.utec.edu.pe;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Lab01Test {
    @Test(invocationCount = 1000, threadPoolSize = 80)
    public void test01(){
        Lab01 aplicativosTaxi = new Lab01();
        Assert.assertEquals(62, aplicativosTaxi.precio("UBER", 50,20 ));
    }
    @Test
    public void test02(){
        Lab01 aplicativosTaxi = new Lab01();
        Assert.assertEquals(66, aplicativosTaxi.precio("Cabify", 50,20 ));
    }
    @Test
    public void test03(){
        Lab01 aplicativosTaxi = new Lab01();
        Assert.assertEquals(61.7, aplicativosTaxi.precio("TaxiBeat", 50,20 ));
    }
}

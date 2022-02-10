package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.FactoryMethod.ConcreteFactory;
import src.FactoryMethod.ConcreteProduct;
import src.FactoryMethod.ProductType;

public class Tester {
    
    @Test 
    public void testFactoryMethod() {
        ConcreteFactory testFactory = new ConcreteFactory();
        ConcreteProduct testProduct = (ConcreteProduct)testFactory.getProduct(ProductType.OPTION1);
        assertEquals(ConcreteProduct.class, testProduct.getClass());
    }

}
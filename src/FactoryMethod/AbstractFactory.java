package src.FactoryMethod;

import java.util.ArrayList;

public abstract class AbstractFactory {

    public ArrayList<IProduct> getMany(int pQuantity, ProductType pType){
        ArrayList<IProduct> products = new ArrayList<>();
        for (int productIndex = 0; productIndex < pQuantity; productIndex++) {
            products.add(new ConcreteProduct());     
        }
        return products;
    }

    public IProduct getProduct(ProductType pType){
        return new ConcreteProduct();
    }
    
}
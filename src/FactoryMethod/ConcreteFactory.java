package src.FactoryMethod;

import java.util.ArrayList;

public class ConcreteFactory extends AbstractFactory {
    
    @Override
    public ArrayList<IProduct> getMany(int pQuantity, ProductType pType){
        ArrayList<IProduct> products = new ArrayList<>();
        switch (pType) {
            case OPTION1:
                for (int productIndex = 0; productIndex < pQuantity; productIndex++) {
                    products.add(new ConcreteProduct());
                }
                break;
            case OPTION2:
            for (int productIndex = 0; productIndex < pQuantity; productIndex++) {
                products.add(new ConcreteProduct2());
            }
                break;
            default:
                for (int productIndex = 0; productIndex < pQuantity; productIndex++) {
                    products.add(null);
                }
                break;
        }

        return products;
    }

    @Override
    public IProduct getProduct(ProductType pType){
        switch (pType) {
            case OPTION1:
                return new ConcreteProduct();
            case OPTION2:
                return new ConcreteProduct2();
            default:
                return null;
        }
    }
}

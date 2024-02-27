package com.java.creational.factorymethod;

public class FactoryMethod {

    public abstract class ProductOrderCreator {
        public void orderProduct(String productName, long amount) {
            final Product product = newProduct(productName);
            storeOrder(product, amount);
        }

        protected abstract Product newProduct(String productName);

        private void storeOrder(Product product, long amount) {};
    }

    public class ProductOrderCreatorImpl extends ProductOrderCreator {
        private static final long DEFAULT_PRICE = 1000;

        @Override
        protected Product newProduct(String productName) {
            final Product product;
            if (productName.endsWith("FREE!")) {
                product = new FreeProduct();
            } else {
                final PricedProduct pricedProduct = new PricedProduct();
                pricedProduct.price = DEFAULT_PRICE;
                product = pricedProduct;
            }
            product.name = productName;
            return product;
        }
    }

    public static void main(String[] args) {
        final ProductOrderCreator creator = new ProductOrderCreatorImpl();
        creator.orderProduct("Book FREE!", 1);
        creator.orderProduct("Computer", 2);
    }
}

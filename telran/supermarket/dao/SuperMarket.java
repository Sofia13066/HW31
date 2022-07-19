package telran.supermarket.dao;

import telran.supermarket.model.Product;

public interface SuperMarket extends Iterable<Product> {
    boolean addProduct(Product product);

    Product removeProduct(long barcode);

    Product findByBarCode(long barcode);

    Iterable<Product> findByCategory(String category);

    Iterable<Product> findByBrand(String brand);

    Iterable<Product> findProductWithEpxDate();

    int skuQuantity();
}

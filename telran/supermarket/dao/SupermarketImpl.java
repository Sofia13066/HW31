package telran.supermarket.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import telran.supermarket.model.Product;

public class SupermarketImpl implements SuperMarket {
    Collection<Product> products = new ArrayList<Product>();
    int skuQuantity;

    @Override
    public boolean addProduct(Product product) {
        if (products.contains(product)) {
            return false;
          }
        products.add(product);
        skuQuantity++;
        return true;
    }

    @Override
    public Product removeProduct(long barcode) {
        Product removed = ((SupermarketImpl) products).findByBarCode(barcode);
        products.remove(((SupermarketImpl) products).findByBarCode(barcode));
        skuQuantity--;
        return removed;
    }

    @Override
    public Product findByBarCode(long barcode) {
        Product result = null;
    Iterator<Product> iterator = products.iterator();
    while(iterator.hasNext() && result==null) {
        Product a = iterator.next();
        if(barcode == a.getBarCode()) {
            result = a;
        }
    }
    return result;
        // Product temp = null;
        // for (Product element : products) {
        //     if (element.getBarCode() == barcode) {
        //         temp = ((ArrayList<Product>) products).get(((ArrayList<Product>) products).indexOf(element));
        //     }
        // }
        // return temp;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        
        return findEl("category", category);
    }

    private Iterable<Product> findEl(String string, String category) {
        return null;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        
        return findEl("brand", brand);
    }

    @Override
    public Iterable<Product> findProductWithEpxDate() {
        return findEl("expDate", "");
    }

    @Override
    public int skuQuantity() {
        return skuQuantity;
    }

    @Override
    public Iterator<Product> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}

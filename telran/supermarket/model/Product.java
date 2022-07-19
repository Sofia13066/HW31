package telran.supermarket.model;

import java.time.LocalDate;

public class Product {
    private long barCode;
    private String name;
    private String category;
    private String brand;
    private double price;
    private LocalDate expDate;

    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (barCode ^ (barCode >>> 32));
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (barCode != other.barCode)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Product [barCode=" + barCode + ", brand=" + brand + ", category=" + category + ", expDate=" + expDate
                + ", name=" + name + ", price=" + price + "]";
    }

    
    public long getBarCode() {
        return barCode;
    }
    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public LocalDate getExpDate() {
        return expDate;
    }
    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
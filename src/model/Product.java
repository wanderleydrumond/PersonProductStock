package model;

public class Product {
    private String name;
    private Integer stock;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double calcTotal() {
        if (getStock() == null || getPrice() == null) {
            return 0.;
        }
        return getStock() * getPrice();
    }
}
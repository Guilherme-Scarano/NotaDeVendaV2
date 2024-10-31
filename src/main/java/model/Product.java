package model;

import java.math.BigDecimal;

public class Product {
    private String description;
    private BigDecimal price;

    public Product(String description, BigDecimal price) {
        setDescription(description);
        setPrice(price);
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.price = price;
    }
}

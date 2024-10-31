package model;

import java.math.BigDecimal;

public class SaleItem {
    private Product product;
    private int quantity;

    public SaleItem(Product product, int quantity) {
        setProduct(product);
        setQuantity(quantity);
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getSubtotal() {
        return product.getPrice().multiply(new BigDecimal(quantity));
    }

    @Override
    public String toString() {
        return String.format("%s - Quantidade: %d - Subtotal: R$ %.2f",
                product.getDescription(),
                quantity,
                getSubtotal());
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva.");
        }
        this.quantity = quantity;
    }
}
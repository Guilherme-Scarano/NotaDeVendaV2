package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<SaleItem> items = new ArrayList<>();

    public void addProduct(String description, BigDecimal price, int quantity) {
        Product product = new Product(description, price);
        SaleItem item = new SaleItem(product, quantity);
        items.add(item);
    }

    public BigDecimal getTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (SaleItem saleItem : items) {
            total = total.add(saleItem.getSubtotal());
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("Itens da venda:");
        for (SaleItem item : items) {
            System.out.printf("%s - Quantidade: %d - Subtotal: R$ %.2f%n",
                    item.getProduct().getDescription(),
                    item.getQuantity(),
                    item.getSubtotal());
        }
        System.out.printf("Valor total da venda: R$ %.2f%n", getTotal());
    }
}
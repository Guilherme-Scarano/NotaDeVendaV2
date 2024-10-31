package view;

import model.Sale;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();
        
        sale.addProduct("Arroz Tatiana", new BigDecimal("30"), 2);
        sale.addProduct("Feijão Feijó", new BigDecimal("20"), 1);
        sale.addProduct("Macarrão Santa Amália", new BigDecimal("15"), 6);

        sale.printReceipt();
    }
}
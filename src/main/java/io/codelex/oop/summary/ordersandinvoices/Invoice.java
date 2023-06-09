package io.codelex.oop.summary.ordersandinvoices;

import java.text.DecimalFormat;

public class Invoice {
    private static final double VAT_RATE = 0.21;

    private final Order order;
    private final String invoiceNumber;
    private InvoiceStatus status;
    private final double priceWithoutVAT;
    private final double priceWithVAT;

    public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
        if (order.getItems().isEmpty()) {
            throw new WrongOrderException("Cannot create an invoice with an empty order.");
        }
        this.order = order;
        this.invoiceNumber = invoiceNumber;
        this.status = InvoiceStatus.APPROVED;
        this.priceWithoutVAT = calculatePriceWithoutVAT();
        this.priceWithVAT = calculatePriceWithVAT();
    }

    public void send() {
        this.status = InvoiceStatus.SENT;
    }

    private double calculatePriceWithoutVAT() {
        double total = 0.0;
        for (SellableThing sellable : order.getItems()) {
            if (sellable instanceof Item) {
                Item item = (Item) sellable;
                total += item.getPrice();
            } else if (sellable instanceof Service) {
                Service service = (Service) sellable;
                total += service.getPrice();
            }
        }
        return total;
    }

    private double calculatePriceWithVAT() {
        return priceWithoutVAT * (1 + VAT_RATE);
    }

    public String generateInvoiceText() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        sb.append(String.format("= INVOICE NUMBER: %s", invoiceNumber)).append(" ").append("=\n");
        sb.append(String.format("= STATUS: %s", status)).append(" ").append("=\n");
        sb.append(order.getItemsList());
        sb.append(String.format("= SUM: %.2f EUR", priceWithoutVAT)).append(" ").append("=\n");
        sb.append(String.format("= VAT (21%%): %.2f EUR", priceWithVAT - priceWithoutVAT)).append(" ").append("=\n");
        sb.append(String.format("= TOTAL: %.2f EUR", priceWithVAT)).append(" ").append("=\n");

        return sb.toString();
    }
}

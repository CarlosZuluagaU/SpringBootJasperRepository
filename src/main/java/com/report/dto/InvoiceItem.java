package com.report.dto;

import java.math.BigDecimal;

public class InvoiceItem {
    private String description;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal total;

    // Getters y Setters
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public BigDecimal getUnitPrice() { return unitPrice; }
    public void setUnitPrice(BigDecimal unitPrice) { this.unitPrice = unitPrice; }
    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal total) { this.total = total; }
}

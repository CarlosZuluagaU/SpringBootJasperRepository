package com.report.dto;

import java.math.BigDecimal;

public class TotalsData {
    private BigDecimal subtotal;
    private BigDecimal tax;
    private BigDecimal grandTotal;

    // Getters y Setters
    public BigDecimal getSubtotal() { return subtotal; }
    public void setSubtotal(BigDecimal subtotal) { this.subtotal = subtotal; }
    public BigDecimal getTax() { return tax; }
    public void setTax(BigDecimal tax) { this.tax = tax; }
    public BigDecimal getGrandTotal() { return grandTotal; }
    public void setGrandTotal(BigDecimal grandTotal) { this.grandTotal = grandTotal; }
}

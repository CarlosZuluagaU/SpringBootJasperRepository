package com.report.dto;

import java.util.List;

public class InvoiceData {
    private CustomerData customer;
    private List<InvoiceItem> items;
    private TotalsData totals;
    private String paymentMethod;

    // Getters y Setters
    public CustomerData getCustomer() { return customer; }
    public void setCustomer(CustomerData customer) { this.customer = customer; }
    public List<InvoiceItem> getItems() { return items; }
    public void setItems(List<InvoiceItem> items) { this.items = items; }
    public TotalsData getTotals() { return totals; }
    public void setTotals(TotalsData totals) { this.totals = totals; }
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
}
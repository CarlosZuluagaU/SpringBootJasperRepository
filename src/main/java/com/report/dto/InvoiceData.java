package com.report.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class InvoiceData {
    // Getters y Setters
    private CustomerData customer;
    private List<InvoiceItem> items;
    private TotalsData totals;
    private String paymentMethod;

}
package com.report.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class InvoiceItem {
    // Getters y Setters
    private String description;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal total;

}

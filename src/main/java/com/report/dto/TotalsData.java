package com.report.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class TotalsData {
    // Getters y Setters
    private BigDecimal subtotal;
    private BigDecimal tax;
    private BigDecimal grandTotal;

}

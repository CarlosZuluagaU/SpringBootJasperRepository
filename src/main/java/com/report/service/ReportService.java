
package com.report.service;

import com.report.dto.InvoiceData;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportService {

    public byte[] generateInvoicePdf(InvoiceData data) throws Exception {
        File file = ResourceUtils.getFile("classpath:templates/report/invoice_template.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

        JRBeanCollectionDataSource itemDataSource = new JRBeanCollectionDataSource(data.getItems());

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("customerName", data.getCustomer().getCustomerName());
        parameters.put("customerID", data.getCustomer().getCustomerID());
        parameters.put("customerAddress", data.getCustomer().getCustomerAddress());
        parameters.put("customerPhone", data.getCustomer().getCustomerPhone());
        parameters.put("invoiceDate", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        parameters.put("paymentMethod", data.getPaymentMethod());
        parameters.put("subtotal", data.getTotals().getSubtotal());
        parameters.put("tax", data.getTotals().getTax());
        parameters.put("grandTotal", data.getTotals().getGrandTotal());

        parameters.put("ItemDataSource", itemDataSource);

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

        return JasperExportManager.exportReportToPdf(jasperPrint);
    }
}
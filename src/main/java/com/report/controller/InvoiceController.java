package com.report.controller;

import com.report.dto.InvoiceData;
import com.report.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invoices")
// @CrossOrigin permite que el frontend (HTML) se comunique con este backend
@CrossOrigin(origins = "*")
public class InvoiceController {

    @Autowired
    private ReportService reportService;

    @PostMapping("/generate")
    public ResponseEntity<byte[]> generateInvoice(@RequestBody InvoiceData invoiceData) {
        try {
            byte[] pdfReport = reportService.generateInvoicePdf(invoiceData);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            // El nombre del archivo que se descargará
            headers.setContentDispositionFormData("attachment", "factura.pdf");

            return ResponseEntity.ok().headers(headers).body(pdfReport);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }
}
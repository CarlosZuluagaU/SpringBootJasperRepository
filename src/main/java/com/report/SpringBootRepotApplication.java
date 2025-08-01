package com.report;

import net.sf.jasperreports.engine.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringBootRepotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRepotApplication.class, args);
	}

	@Bean
	CommandLineRunner init() {
		return args -> {
			String destinationPath= "src/main/resources/static/reports.pdf";

			String FilePath= "src/main/resources/templates/report/Report.jrxml";
			// Initialization logic can go here if needed


			LocalDateTime localDateTime = LocalDateTime.now();
			DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			Map<String, Object> parameters = new HashMap<>();
			parameters.put("voucher_id", "000001234"	);
			parameters.put("Current_Date", formatter.format(localDateTime));
			parameters.put("AmountPaid", new BigDecimal("1000.00"));
			parameters.put("Payment_Method", "Cash");
			parameters.put("Parent_Name", "Carlos Andres");
			parameters.put("Child_Name", "Carlos Andres Jr.");
			parameters.put("imageDir", "classpath:static/images/");

			JasperReport report = JasperCompileManager.compileReport(FilePath);
			JasperPrint print= JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
			JasperExportManager.exportReportToPdfFile(print, destinationPath);
			System.out.println("Report generated successfully at: " + destinationPath);

		};
	}
}

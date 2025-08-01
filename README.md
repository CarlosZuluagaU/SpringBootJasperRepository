# Invoice Generator with Spring Boot and JasperReports

This project is a complete web application that allows for the dynamic generation of PDF invoices from an interactive web form. It serves as a demonstration of how to integrate a Java backend with the powerful JasperReports reporting library.

---

## 🚀 Features

-   **Interactive Web Form:** A modern user interface created with HTML and Tailwind CSS to input invoice data.
-   **Automatic Calculations:** Subtotal, VAT, and total are calculated in real-time on the frontend.
-   **Robust Backend:** Built with Spring Boot, it exposes a REST API to receive invoice data.
-   **Dynamic PDF Generation:** Uses JasperReports to populate a `.jrxml` template with the received data and generate a professional PDF.
-   **Automatic Download:** The generated PDF is automatically downloaded in the user's browser.
-   **Professional Design:** The invoice template includes styles, tables for items, a logo, and a signature.

---

## 🛠️ Technologies Used

### Backend
-   **Java 17:** Main programming language.
-   **Spring Boot 3:** Framework for creating the application and web server.
-   **JasperReports:** Library for generating PDF reports.
-   **Maven:** Dependency management and project build tool.

### Frontend
-   **HTML5:** Structure of the web form.
-   **Tailwind CSS:** CSS framework for rapid and modern design.
-   **JavaScript (Vanilla):** For form interactivity, calculations, and communication with the backend.

---

## 📂 Project Structure

The project is organized as follows to maintain a clear separation of concerns:


.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── report
│   │   │           ├── controller  // InvoiceController.java
│   │   │           ├── dto         // DTO Classes (InvoiceData, etc.)
│   │   │           ├── service     // ReportService.java
│   │   │           └── InvoiceApplication.java
│   │   └── resources
│   │       ├── static
│   │       │   ├── images          // LogoZulu.png, firmaZulu.png
│   │       │   └── invoice_form.html  // The frontend
│   │       └── templates
│   │           └── report
│   │               └── invoice_template.jrxml  // Jasper Template
├── pom.xml         // Maven dependencies
└── README.md       // This file


---

## ⚙️ How to Run the Project

Follow these steps to get the application up and running:

### Prerequisites
-   **JDK 17** or higher installed.
-   **Apache Maven** installed.
-   An IDE like **IntelliJ IDEA** or Eclipse.

### Steps

1.  **Clone or Download the Project:**
    Get all the files and open them in your IDE.

2.  **Verify the Images:**
    Make sure your logo (`LogoZulu.png`) and signature (`firmaZulu.png`) are located in the `src/main/resources/static/images/` folder.

3.  **Start the Backend:**
    -   Open the `InvoiceApplication.java` class.
    -   Run the `main()` method.
    -   Wait for the console to display the message `Tomcat started on port 8080`.

4.  **Open the Frontend:**
    -   Find the `invoice_form.html` file in the `src/main/resources/static/` folder.
    -   Right-click on it and select `Open in > Browser`.

5.  **Generate an Invoice!**
    -   Fill in the data on the form.
    -   Add some products or services.
    -   Click the "Generate PDF Invoice" button. The file will be downloaded automatically.

---

## 📄 License

This project is under the MIT License. See the `LICENSE` file for more details.

---

Created by **Zuluaga** - 2025

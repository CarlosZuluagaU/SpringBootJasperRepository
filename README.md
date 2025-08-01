# Generador de Facturas con Spring Boot y JasperReports

Este proyecto es una aplicación web completa que permite generar facturas dinámicas en formato PDF a partir de un formulario web interactivo. Es una demostración de cómo integrar un backend de Java con la potente librería de reportes JasperReports.

---

## 🚀 Características

-   **Formulario Web Interactivo:** Una interfaz de usuario moderna creada con HTML y Tailwind CSS para ingresar los datos de la factura.
-   **Cálculos Automáticos:** El subtotal, IVA y total se calculan en tiempo real en el frontend.
-   **Backend Robusto:** Construido con Spring Boot, expone una API REST para recibir los datos de la factura.
-   **Generación Dinámica de PDF:** Utiliza JasperReports para poblar una plantilla `.jrxml` con los datos recibidos y generar un PDF profesional.
-   **Descarga Automática:** El PDF generado se descarga automáticamente en el navegador del usuario.
-   **Diseño Profesional:** La plantilla de la factura incluye estilos, tablas para items, logo y firma.

---

## 🛠️ Tecnologías Utilizadas

### Backend
-   **Java 17:** Lenguaje de programación principal.
-   **Spring Boot 3:** Framework para la creación de la aplicación y el servidor web.
-   **JasperReports:** Librería para la generación de los reportes en PDF.
-   **Maven:** Gestor de dependencias y construcción del proyecto.

### Frontend
-   **HTML5:** Estructura del formulario web.
-   **Tailwind CSS:** Framework de CSS para un diseño rápido y moderno.
-   **JavaScript (Vanilla):** Para la interactividad del formulario, cálculos y comunicación con el backend.

---

## 📂 Estructura del Proyecto

El proyecto está organizado de la siguiente manera para mantener una separación clara de responsabilidades:


.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── report
│   │   │           ├── controller  // InvoiceController.java
│   │   │           ├── dto         // Clases DTO (InvoiceData, etc.)
│   │   │           ├── service     // ReportService.java
│   │   │           └── InvoiceApplication.java
│   │   └── resources
│   │       ├── static
│   │       │   ├── images          // LogoZulu.png, firmaZulu.png
│   │       │   └── invoice_form.html  // El frontend
│   │       └── templates
│   │           └── report
│   │               └── invoice_template.jrxml  // Plantilla Jasper
├── pom.xml         // Dependencias de Maven
└── README.md       // Este archivo


---

## ⚙️ ¿Cómo Ejecutar el Proyecto?

Sigue estos pasos para poner en marcha la aplicación:

### Prerrequisitos
-   Tener instalado **JDK 17** o superior.
-   Tener instalado **Apache Maven**.
-   Un IDE como **IntelliJ IDEA** o Eclipse.

### Pasos

1.  **Clonar o Descargar el Proyecto:**
    Obtén todos los archivos y ábrelos en tu IDE.

2.  **Verificar las Imágenes:**
    Asegúrate de que tu logo (`LogoZulu.png`) y tu firma (`firmaZulu.png`) estén ubicados en la carpeta `src/main/resources/static/images/`.

3.  **Iniciar el Backend:**
    -   Abre la clase `InvoiceApplication.java`.
    -   Ejecuta el método `main()`.
    -   Espera a que la consola muestre el mensaje `Tomcat started on port 8080`.

4.  **Abrir el Frontend:**
    -   Busca el archivo `invoice_form.html` en la carpeta `src/main/resources/static/`.
    -   Haz clic derecho sobre él y selecciona `Open in > Browser`.

5.  **¡Generar una Factura!**
    -   Rellena los datos en el formulario.
    -   Añade algunos productos o servicios.
    -   Haz clic en el botón "Generar Factura PDF". El archivo se descargará automáticamente.

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

---

Creado por **Carlos Zuluaga** - 2025

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HolaMundo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!doctype html>");
            out.println("<html lang=\"es\">");
            out.println("<head>");
            out.println("    <meta charset=\"utf-8\">");
            out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            out.println("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
            out.println("    <title>Componentes con Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class=\"container my-5\">");
            out.println("        <h1>Mis 5 Componentes de Bootstrap</h1>");
            

            // --- COMPONENTE 1: Tarjeta (Card) ---
            out.println("        <h2 class=\"mt-5\">1. Tarjeta (Card)</h2>");
            out.println("        <div class=\"card\" style=\"width: 18rem;\">");
            out.println("            <img src=\"" + request.getContextPath() + "/resources/images/images.jpg\" class=\"card-img-top\" alt=\"Logo\">");
            out.println("            <div class=\"card-body\">");
            out.println("                <h5 class=\"card-title\">Título de Tarjeta</h5>");
            out.println("                <p class=\"card-text\">Contenido de la tarjeta.</p>");
            out.println("                <a href=\"#\" class=\"btn btn-primary\">Botón</a>");
            out.println("            </div>");
            out.println("        </div>");

            // --- COMPONENTE 2: Acordeón (Accordion) ---
            out.println("        <h2 class=\"mt-5\">2. Acordeón</h2>");
            out.println("        <div class=\"accordion\" id=\"accordionExample\"><div class=\"accordion-item\"><h2 class=\"accordion-header\" id=\"headingOne\"><button class=\"accordion-button\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">Accordion Item #1</button></h2><div id=\"collapseOne\" class=\"accordion-collapse collapse show\" aria-labelledby=\"headingOne\" data-bs-parent=\"#accordionExample\"><div class=\"accordion-body\">Contenido del primer elemento.</div></div></div><div class=\"accordion-item\"><h2 class=\"accordion-header\" id=\"headingTwo\"><button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\">Accordion Item #2</button></h2><div id=\"collapseTwo\" class=\"accordion-collapse collapse\" aria-labelledby=\"headingTwo\" data-bs-parent=\"#accordionExample\"><div class=\"accordion-body\">Contenido del segundo elemento.</div></div></div></div>");

            // --- COMPONENTE 3: Botones (Buttons) ---
            out.println("        <h2 class=\"mt-5\">3. Botones</h2>");
            out.println("        <div><button type=\"button\" class=\"btn btn-primary\">Primary</button> <button type=\"button\" class=\"btn btn-secondary\">Secondary</button> <button type=\"button\" class=\"btn btn-success\">Success</button> <button type=\"button\" class=\"btn btn-danger\">Danger</button> <button type=\"button\" class=\"btn btn-warning\">Warning</button></div>");

           
            // --- COMPONENTE 4: Carrusel (Carousel) ---
            out.println("        <h2 class=\"mt-5\">4. Carrusel</h2>");
            out.println("        <div id=\"carouselExampleSlidesOnly\" class=\"carousel slide\" data-bs-ride=\"carousel\" style=\"max-width: 600px;\">");
            out.println("            <div class=\"carousel-inner\">");

            // Imagen 1 del carrusel
            out.println("                <div class=\"carousel-item active\">");
            out.println("                    <img src=\"" + request.getContextPath() + "/resources/images/carrusel1.jpeg\" class=\"d-block w-100\" alt=\"Primera imagen\">");
            out.println("                </div>");

            // Imagen 2 del carrusel
            out.println("                <div class=\"carousel-item\">");
            out.println("                    <img src=\"" + request.getContextPath() + "/resources/images/carrusel2.jpg\" class=\"d-block w-100\" alt=\"Segunda imagen\">");
            out.println("                </div>");

            out.println("            </div>");
            out.println("        </div>");

            // --- COMPONENTE 5: Lista (List group) ---
            out.println("        <h2 class=\"mt-5\">5. Lista</h2>");
            out.println("        <ul class=\"list-group\" style=\"max-width: 300px;\"><li class=\"list-group-item disabled\" aria-disabled=\"true\">Un elemento deshabilitado</li><li class=\"list-group-item\">Un segundo elemento</li><li class=\"list-group-item\">Un tercer elemento</li></ul>");

            out.println("    </div>");
            out.println("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}

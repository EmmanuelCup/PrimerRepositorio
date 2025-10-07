<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Componentes con JSP</title>
</head>
<body>

    <div class="container my-5">
        <h1>Mis 5 Componentes de Bootstrap</h1>
        

        <h2 class="mt-5">1. Tarjeta (Card)</h2>
        <div class="card" style="width: 18rem;">
            <img src="${pageContext.request.contextPath}/resources/images/images.jpg" class="card-img-top" alt="Logo">
            <div class="card-body">
                <h5 class="card-title">Título de la Tarjeta</h5>
                <p class="card-text">Ejemplo de una tarjeta para mostrar contenido.</p>
                <a href="#" class="btn btn-primary">Ver más</a>
            </div>
        </div>

        <h2 class="mt-5">2. Acordeón (Accordion)</h2>
        <div class="accordion" id="accordionExample">
            <div class="accordion-item">
                <h2 class="accordion-header" id="headingOne">
                    <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                        Accordion Item #1
                    </button>
                </h2>
                <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
                    <div class="accordion-body">
                        Contenido del primer elemento.
                    </div>
                </div>
            </div>
            <div class="accordion-item">
                <h2 class="accordion-header" id="headingTwo">
                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                        Accordion Item #2
                    </button>
                </h2>
                <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
                    <div class="accordion-body">
                        Contenido del segundo elemento.
                    </div>
                </div>
            </div>
        </div>

        <h2 class="mt-5">3. Botones</h2>
        <div>
            <button type="button" class="btn btn-primary">Primary</button>
            <button type="button" class="btn btn-secondary">Secondary</button>
            <button type="button" class="btn btn-success">Success</button>
            <button type="button" class="btn btn-danger">Danger</button>
            <button type="button" class="btn btn-warning">Warning</button>
        </div>

        <h2 class="mt-5">4. Carrusel</h2>
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel" style="max-width: 600px;">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="${pageContext.request.contextPath}/resources/images/carrusel1.jpeg" class="d-block w-100" alt="Descripción de la imagen 1">
                </div>
                <div class="carousel-item">
                    <img src="${pageContext.request.contextPath}/resources/images/carrusel2.jpg" class="d-block w-100" alt="Descripción de la imagen 2">
                </div>
            </div>
        </div>

        <h2 class="mt-5">5. Lista</h2>
        <ul class="list-group" style="max-width: 300px;">
            <li class="list-group-item disabled" aria-disabled="true">Un elemento deshabilitado</li>
            <li class="list-group-item">Un segundo elemento</li>
            <li class="list-group-item">Un tercer elemento</li>
        </ul>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
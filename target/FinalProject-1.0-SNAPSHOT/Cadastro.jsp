<%-- 
    Document   : Cadastro
    Created on : 25/10/2019, 09:42:43
    Author     : Pedro Portes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css">
        <script src="js/navbar-ontop.js"></script>
    </head>
    <body>
        <%@include  file="/header.jsp" %>
        <div class="py-5 text-center" style="	background-image: url(https://pingendo.com/site-assets/cover.jpg);	background-position: top left;	background-size: 100%;	background-repeat: repeat;">
            <div class="container">
                <div class="row" style="">
                    <div class="mx-auto col-lg-6 col-10">
                        <h1 style="" class="" contenteditable="true">Registrar</h1>
                        <form class="text-left" action="CadastroServlet" method="POST">
                            <div class="form-group"> <label for="form16" contenteditable="true">Nome Completo:</label> <input type="text" class="form-control" id="nome" name="nome"> </div>
                            <div class="form-group"> <label for="form17">Email:&nbsp;</label> <input type="text" class="form-control" id="email" name="email" placeholder="exemplo@gmail.com"> </div>
                            <div class="form-group"> <label for="form18">Confirme seu Email:</label> <input type="email" class="form-control" id="form18"> </div>
                            <div class="form-row">
                                <div class="form-group col-md-6"> <label for="form19">Senha</label> <input type="password" class="form-control" id="senha" name="senha" placeholder="••••••••"> </div>
                                <div class="form-group col-md-6"> <label for="form20">Confirmar Senha:&nbsp;</label> <input type="password" class="form-control" id="form20" placeholder="••••••••"> </div>
                            </div >
                            <button type="submit" class="btn btn-primary" >Registrar-se</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <%@include  file="/footer.jsp" %>
    </body>
</html>

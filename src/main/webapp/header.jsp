<%-- 
    Document   : header
    Created on : 9 de nov de 2019, 16:00:26
    Author     : Raphael Policena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
    </head>
    <body>
        <!--Header -->
        <nav class="navbar navbar-expand-md fixed-top navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="#"><b>Sistema do Pedro</b></a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbar3SupportedContent" aria-controls="navbar3SupportedContent" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
                <div class="collapse navbar-collapse text-center justify-content-end" id="navbar3SupportedContent">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="#what">What</a>
                        </li>
                        <li class="nav-item mx-2 mb-2 my-md-0">
                            <a class="nav-link" href="#who">Who</a>
                        </li>
                    </ul>
                    <%
                        if (session.getAttribute("user") == null) {
                    %>
                    <a class="btn navbar-btn btn-outline-light" href="Login.jsp">Login</a>
                    <%
                    } else {
                    %>
                    <div class="btn-group" >
                        <button class="btn btn-light dropdown-toggle" data-toggle="dropdown"> ${user.nome} </button>
                        <div class="dropdown-menu"> <a class="dropdown-item" href="index.jsp">Acessar dados</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item fa fa-sign-out" href="Logout"> Sair</a>
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div>
            </div>
        </nav>
    </body>
</html>

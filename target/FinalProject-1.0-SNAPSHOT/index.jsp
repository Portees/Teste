<%-- 
    Document   : index
    Created on : 9 de nov de 2019, 15:59:07
    Author     : Raphael Policena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- PAGE settings -->
        <link rel="icon" href="https://templates.pingendo.com/assets/Pingendo_favicon.ico">
        <title>Smke</title>
        <meta name="description" content="Free Bootstrap 4 Pingendo Smke template single landing page team">
        <meta name="keywords" content="Pingendo smke free template bootstrap 4">
        <!-- CSS dependencies -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/colorful.css">
        <!-- Script: Navbar on-top -->
        <script src="js/navbar-ontop.js"></script>
    </head>

    <body>
        <%@include  file="/header.jsp" %>
        <div class="py-5 text-center cover d-flex flex-column bg-primary">
            <div class="container my-auto">
                <div class="row">
                    <div class="mx-auto col-lg-6 col-md-8">
                        <h1 class="display-1 mb-0 mt-5 big-title">SP</h1>
                        <h3 class="mb-4"><b>Sistema do Pedro</b></h3>
                        <p>Seja bem vindo ao sistema do pedro</p>
                    </div>
                </div>
            </div>
            <div class="container mt-auto">
                <div class="row">
                    <div class="mx-auto col-lg-6 col-md-8 col-10">
                        <a href="#mission"><i class="d-block fa fa-angle-down fa-2x"></i></a>
                    </div>
                </div>
            </div>
        </div>
        <div class="py-5 filter-dark cover bg-fixed" style="background-image: url('assets/team/planes.jpg');background-position:center bottom;background-size:cover;" id="mission">
            <div class="container my-auto">
                <div class="row">
                    <div class="col-md-8 p-3 text-white">
                        <h2 class="mb-4">Our Smission</h2>
                        <p class="lead"><i>Lorem ipsum dolor sit amet,&nbsp;<br>consectetur adipisici elit,&nbsp;<br>sed eiusmod tempor incidunt&nbsp;<br>ut labore et dolore magna aliqua.</i></p>
                    </div>
                </div>
            </div>
        </div>
        <div class="py-5 bg-light" id="what">
            <div class="container">
                <div class="row text-center">
                    <div class="col-md-10 mx-auto px-4">
                        <h2 class="text-muted mb-4">What do we do</h2>
                        <div class="row text-left">
                            <div class="p-3 col-lg-4 col-md-6">
                                <div class="row mb-3">
                                    <div class="text-center col-3"><i class="d-block mx-auto fa text-muted fa-4x fa-flask"></i></div>
                                    <div class="align-self-center d-flex align-items-center px-0 px-md-2 col-9">
                                        <h5 class="mb-0"><b>&nbsp; &nbsp;Test</b></h5>
                                    </div>
                                </div>
                                <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod.</p>
                            </div>
                            <div class="p-3 col-lg-4 col-md-6">
                                <div class="row mb-3">
                                    <div class="text-center col-3"><i class="d-block mx-auto fa text-muted fa-4x fa-fire"></i></div>
                                    <div class="align-self-center d-flex align-items-center px-0 px-md-2 col-9">
                                        <h5 class="mb-0"><b>&nbsp; Light up</b></h5>
                                    </div>
                                </div>
                                <p class="text-muted">Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid.</p>
                            </div>
                            <div class="p-3 col-lg-4">
                                <div class="row mb-3">
                                    <div class="text-center col-3"><i class="d-block mx-auto fa text-muted fa-4x fa-fighter-jet"></i></div>
                                    <div class="align-self-center d-flex align-items-center px-0 px-md-2 col-9">
                                        <h5 class="mb-0"><b>&nbsp; Rock it</b></h5>
                                    </div>
                                </div>
                                <p class="text-muted">Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="text-center py-5">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h2 class="text-muted" >Clean your way - reach perfection</h2>
                    </div>
                </div>
                <div class="row">
                    <div class="text-right col-md-6">
                        <div class="row my-5">
                            <div class="order-lg-2 text-center col-lg-2 col-3"> <span class="fa-stack fa-2x">
                                    <i class="fa fa-circle fa-stack-2x text-primary"></i>
                                    <i class="fa fa-stack-1x fa-battery-full text-white"></i>
                                </span> </div>
                            <div class="text-lg-right text-left order-lg-1 col-lg-10 col-9">
                                <h4>Power booster</h4>
                                <p>Lorem ipsum dolor sit amet, consectetur.</p>
                            </div>
                        </div>
                        <div class="row my-5">
                            <div class="order-lg-2 text-center col-lg-2 col-3"> <span class="fa-stack fa-2x">
                                    <i class="fa fa-circle fa-stack-2x text-secondary"></i>
                                    <i class="fa fa-stack-1x fa-bolt text-white"></i>
                                </span> </div>
                            <div class="text-lg-right text-left order-lg-1 col-lg-10 col-9">
                                <h4>Real energies</h4>
                                <p>Adipisici elit, sed eiusmod tempor incidunt.</p>
                            </div>
                        </div>
                        <div class="row mt-5">
                            <div class="order-lg-2 text-center col-lg-2 col-3"> <span class="fa-stack fa-2x">
                                    <i class="fa fa-circle fa-stack-2x"></i>
                                    <i class="fa fa-stack-1x fa-bomb text-white"></i>
                                </span> </div>
                            <div class="text-lg-right text-left order-lg-1 col-lg-10 col-9">
                                <h4>Be ready for action</h4>
                                <p> ut labore et dolore magna aliqua.&nbsp; Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid.</p>
                            </div>
                        </div>
                    </div>
                    <div class="text-left col-md-6">
                        <div class="row my-5">
                            <div class="text-center col-lg-2 col-3"> <span class="fa-stack fa-2x">
                                    <i class="fa fa-circle fa-stack-2x text-danger"></i>
                                    <i class="fa fa-stack-1x text-white fa-dot-circle-o"></i>
                                </span> </div>
                            <div class="col-lg-10 col-9">
                                <h4>Focus your target</h4>
                                <p>Ex ea commodi consequat. Quis aute iure reprehenderit.</p>
                            </div>
                        </div>
                        <div class="row my-5">
                            <div class="text-center col-lg-2 col-3"> <span class="fa-stack fa-2x">
                                    <i class="fa fa-circle fa-stack-2x text-info"></i>
                                    <i class="fa fa-stack-1x text-white fa-gamepad"></i>
                                </span> </div>
                            <div class="col-lg-10 col-9">
                                <h4>Take it seriously</h4>
                                <p>In voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                            </div>
                        </div>
                        <div class="row mt-5">
                            <div class="text-center col-lg-2 col-3"> <span class="fa-stack fa-2x">
                                    <i class="fa fa-circle fa-stack-2x text-warning"></i>
                                    <i class="fa fa-stack-1x text-white fa-rocket"></i>
                                </span> </div>
                            <div class="col-lg-10 col-9">
                                <h4>Take off</h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="py-5 section bg-light">
            <div class="container p-3">
                <div class="row align-items-center mb-4">
                    <div class="col-lg-3">
                        <h2 class="mb-3">Only happy mates with us</h2>
                    </div>
                    <div class="pl-lg-4 col-lg-8  mb-2">
                        <p class="lead mb-0 text-muted">Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.&nbsp; Ut enim ad minim veniam.</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12"> </div>
                </div>
                <div class="row d-flex align-items-center justify-content-between">
                    <div class="col-md-2 col-4">
                        <img class="center-block img-fluid d-block" src="assets/team/logo_4.png"> </div>
                    <div class="col-md-2 col-4">
                        <img class="center-block img-fluid d-block" src="assets/team/logo_2.png"> </div>
                    <div class="col-md-2 col-4">
                        <img class="center-block img-fluid d-block" src="assets/team/logo_1.png"> </div>
                    <div class="col-md-2 col-4">
                        <img class="center-block img-fluid d-block" src="assets/team/logo_3.png"> </div>
                    <div class="col-md-2 col-4">
                        <img class="center-block img-fluid d-block" src="assets/team/logo_5.png"> </div>
                    <div class="col-md-2 col-4">
                        <img class="center-block img-fluid d-block" src="assets/team/logo_6.png"> </div>
                </div>
            </div>
        </div>
        <div class="py-5 text-center" id="who">
            <div class="container">
                <div class="row">
                    <div class="col-md-12"> </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <h2 class="mb-4">Smke team</h2>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 px-4 mb-4 col-6 px-lg-5">
                        <a data-toggle="modal" data-target=".yellow" href="">
                            <div class="card project">
                                <img class="card-img rounded-circle" src="assets/team/yellow.jpg" alt="Card image">
                                <div class="card-body p-0">
                                    <p class="mt-3 mb-1"><b>Yellow</b></p>
                                    <p class="text-muted m-0"><small>CEO</small></p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-4 px-4 mb-4 col-6 px-lg-5">
                        <a data-toggle="modal" data-target=".cyan" href="">
                            <div class="card project">
                                <img class="card-img rounded-circle" src="assets/team/cyan.jpg" alt="Card image">
                                <div class="card-body p-0">
                                    <p class="mt-3 mb-1"><b>Cyan</b></p>
                                    <p class="text-muted m-0"><small>Managing Partner</small></p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-4 px-4 mb-4 col-6 px-lg-5">
                        <a data-toggle="modal" data-target=".red" href="">
                            <div class="card project">
                                <img class="card-img rounded-circle" src="assets/team/red.jpg" alt="Card image">
                                <div class="card-body p-0">
                                    <p class="mt-3 mb-1"><b>Red</b></p>
                                    <p class="text-muted m-0"><small>VP</small></p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-4 px-4 mb-4 col-6 px-lg-5">
                        <a data-toggle="modal" data-target=".purple" href="">
                            <div class="card project">
                                <img class="card-img rounded-circle" src="assets/team/purple.jpg" alt="Card image">
                                <div class="card-body p-0">
                                    <p class="mt-3 mb-1"><b>Purple</b></p>
                                    <p class="text-muted m-0"><small>CFO</small></p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-4 px-4 mb-4 col-6 px-lg-5">
                        <a data-toggle="modal" data-target=".white" href="">
                            <div class="card project">
                                <img class="card-img rounded-circle" src="assets/team/white.jpg" alt="Card image">
                                <div class="card-body p-0">
                                    <p class="mt-3 mb-1"><b>White</b></p>
                                    <p class="text-muted m-0"><small>Consultant</small></p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-4 px-4 mb-4 col-6 px-lg-5">
                        <a data-toggle="modal" data-target=".blue" href="">
                            <div class="card project">
                                <img class="card-img rounded-circle" src="assets/team/blue.jpg" alt="Card image">
                                <div class="card-body p-0">
                                    <p class="mt-3 mb-1"><b>Blue</b></p>
                                    <p class="text-muted m-0"><small>Field Researcher</small></p>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </div>
        <div class="text-white bg-dark" id="where">
            <div class="container">
                <div class="row">
                    <div class="p-5 col-md-6">
                        <h3><b>Smke</b></h3>
                        <p class="">
                            <a href="#" target="_blank">Quai Gustave-Ador 35 <br>1207 - Geneve (CH)</a>
                        </p>
                        <p class="">
                            <a href="#">hello@smke.io</a>
                        </p>
                        <p class="mb-3">
                            <a href="#">+41 798 65 61 19&nbsp;</a>
                        </p>
                        <a href="#" target="_blank"><i class="fa d-inline fa-lg mr-3 text-white fa-linkedin"></i></a>
                        <a href="#" target="_blank"><i class="fa fa-facebook d-inline fa-lg mr-3 text-white"></i></a>
                    </div>
                    <div class="p-5 col-md-6">
                        <h3>Get in touch</h3>
                        <form>
                            <div class="form-group">
                                <input type="email" class="form-control form-control-sm" placeholder="Email" required="required" name="email"> </div>
                            <div class="form-group">
                                <input type="text" class="form-control form-control-sm" id="inlineFormInput" placeholder="Subject" required="required" name="subject"> </div>
                            <div class="form-group"><textarea class="form-control p-1 form-control-sm" id="exampleTextarea" rows="3" placeholder="Your message" name="message"></textarea></div>
                            <button type="submit" class="btn btn-outline-light btn-sm">SUBMIT</button>
                        </form>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 mt-3">
                        <p class="text-center text-muted">© Copyright 2018 Pingendo - All rights reserved. </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade yellow">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header bg-light">
                        <h5 class="modal-title"><b>Yellow</b> - CEO</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"> <span aria-hidden="true">×</span> </button>
                    </div>
                    <div class="modal-body bg-light">
                        <div class="row">
                            <div class="col-md-4 px-3">
                                <img class="img-fluid d-block mx-auto rounded-circle" src="assets/team/yellow.jpg"> </div>
                            <div class="col-md-8 p-2">
                                <p class="">Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.&nbsp; <br>
                                    <br>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                                <a target="_blank" href="#"><i class="d-block  fa fa-lg fa-linkedin text-muted"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade cyan">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header bg-light">
                        <h5 class="modal-title"><b>Cyan</b> - Managing Partner</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"> <span aria-hidden="true">×</span> </button>
                    </div>
                    <div class="modal-body bg-light">
                        <div class="row">
                            <div class="col-md-4 px-3">
                                <img class="img-fluid d-block mx-auto rounded-circle" src="assets/team/cyan.jpg"> </div>
                            <div class="col-md-8 p-2">
                                <p class="">Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.&nbsp; <br>
                                    <br>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                                <a href="#" target="_blank"><i class="d-block  fa fa-lg fa-linkedin text-muted"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade red">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header bg-light">
                        <h5 class="modal-title"><b>Red</b> - Vice President</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"> <span aria-hidden="true">×</span> </button>
                    </div>
                    <div class="modal-body bg-light">
                        <div class="row">
                            <div class="col-md-4 px-3">
                                <img class="img-fluid d-block mx-auto rounded-circle" src="assets/team/red.jpg"> </div>
                            <div class="col-md-8 p-2">
                                <p class="">Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat.</p>
                                <a href="#" target="_blank"><i class="d-block  fa fa-lg fa-linkedin text-muted"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade purple">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header bg-light">
                        <h5 class="modal-title"><b>Purple</b> - CFO</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"> <span aria-hidden="true">×</span> </button>
                    </div>
                    <div class="modal-body bg-light">
                        <div class="row">
                            <div class="col-md-4 px-3">
                                <img class="img-fluid d-block mx-auto rounded-circle" src="assets/team/purple.jpg"> </div>
                            <div class="col-md-8 p-2">
                                <p class="">Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.&nbsp; <br>
                                    <br>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                                <a href="#" target="_blank"><i class="d-block  fa fa-lg fa-linkedin text-muted"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade white">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header bg-light">
                        <h5 class="modal-title"><b>White</b> - Consultant</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"> <span aria-hidden="true">×</span> </button>
                    </div>
                    <div class="modal-body bg-light">
                        <div class="row">
                            <div class="col-md-4 px-3">
                                <img class="img-fluid d-block mx-auto rounded-circle" src="assets/team/white.jpg"> </div>
                            <div class="col-md-8 p-2">
                                <p class="">Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.&nbsp; <br>
                                    <br>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade blue">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header bg-light">
                        <h5 class="modal-title"><b>Blue</b> - Field Researcher</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"> <span aria-hidden="true">×</span> </button>
                    </div>
                    <div class="modal-body bg-light">
                        <div class="row">
                            <div class="col-md-4 px-3">
                                <img class="img-fluid d-block mx-auto rounded-circle" src="assets/team/blue.jpg"> </div>
                            <div class="col-md-8 p-2">
                                <p class="">Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.&nbsp; <br>
                                    <br>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include  file="/footer.jsp" %>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <!-- Script: Smooth scrolling between anchors in the same page -->
        <script src="js/smooth-scroll.js"></script>
    </body>

</html>

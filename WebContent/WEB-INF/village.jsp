 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>TEST | Sen_Forage | IN SYSTEM</title>
  <style type="text/css">
  <%@include file="/public/css/main.css"%>
  <%@include file="/public/css/client.css"%>
  </style> 

  <link rel="shortcut icon" href="public/image/favicon.ico" type="image/x-icon">
  <script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>

<body  onload="invisible();">
  <!-- STARTING : CONTAINER GENERAL -->
  <div class="wrapper">
    <!-- STARTING : SIDEBAR -->
    <div class="sidebar">
      <h2><img class="sidebar_logo" src="public/image/logo-senforage1.png" alt="LOGO SEN-FORAGE" title="Vous d'Abord"></h2>
      <ul>
        <li><a href="../../index.php"><i class="fas fa-home"></i>Accueil</a></li>
        <li class="active"><a href="#"><i class="fas fa-user-tie"></i>Creer un Village</a></li>
        <li class=""><a href="ClientServlet"><i class="fas fa-address-card"></i>Creer un Client</a></li>
        <li><a href="ConnexionServlet"><i class="fas fa-exchange-alt"></i>Deconnexion</a></li>  
      </ul>
      <div class="extra_option">
        <a href="javascript:return false;" title="Changer de Langue"><i class="fas fa-language"></i></a>
        <a href="javascript:return false;" title="Afficher Aide"><i class="fas fa-question-circle"></i></a>
        <a href="javascript:return false;" title="Se Déconnecter"><i class="fas fa-power-off"></i></a>
      </div>
    </div>
    <!-- ENDING : SIDEBAR -->

    <!-- STARTING : MAIN CONTENT -->
    <div class="main_content">
      <div class="header">
        <div class="next_nav">
          <!-- MENU HAUT - PARTIE GAUCHE -->
          <div class="display_header">
            <h2>SEN-FORAGE <span class="breadcrumb">>> Creation Village</span></h2>
          </div>
          <!-- MENU HAUT - PARTIE DROITE -->
          <ul class="nav">
            <li class="nav-item">
              <a class="nav-link" href="#">
                <i class="fas fa-clock" aria-hidden="true"></i> <span class="">Time / Date</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">
                <i class="fas fa-comments" aria-hidden="true"></i> <span class="">Support</span>
              </a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link" href="#" id="">
                <i class="fas fa-user" aria-hidden="true"></i> <span class="">Village</span>
              </a>
            </li>
          </ul>
        </div>
      </div>
      <!-- // CONTENU CENTRAL :  -->
      <div class="info">
        <header>
          <hr />
        <center>
           <h1>INFORMATION VILLAGE </h1>
        </center>
    </header>
      <nav>
           VILLAGE
       <div class="first1">
        <button id="xewel" name="nouveau" value="1">Nouveau-Village</button>
        <button id="courant" name="courant" value="2">Village-Existant</button>
        
       </div>
      </nav>    
      <div class="introduction">
       <form  method="post" action="VillageServlet" id="creerAccountForm">
        <div id="compte">
        <label for="numagence"> Nom-Village </label><strong>*</strong>
        <input type="text" name="nomvillage" id="nomvillage" class="normale"  />
        <span id="nom_manquant"></span><br />
        <input type="submit" value="Enregistrer">    
        </form>
       </div>
      </div>
      <table>
    <tr>
      <th>ID</th><th>Nom-Village</th>
    </tr>
    <c:forEach items="${villages}" var="p" >
    <tr>
      <td>${p.id}</td>
      <td>${p.nom}</td>
    </tr>
    </c:forEach>
    </table>
    
   
      <!-- FIN CONTENU CENTRAL -->
    </div>
    <!-- ENDING MAIN CONTENT -->
  </div>
  <!-- ENDING CONTAINER GENERAL -->
      
    <!-- Main JS -->
    <script src="../../public/js/global.js"></script>
    <script src="../../public/js/compt.js"></script>

</body>

</html>
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

<body onload="cache();">
  <!-- STARTING : CONTAINER GENERAL -->
  <div class="wrapper">
    <!-- STARTING : SIDEBAR -->
    <div class="sidebar">
      <h2><img class="sidebar_logo" src="public/image/logo-senforage1.png" alt="LOGO Sen-Forage" title="Vous d'Abord"></h2>
      <ul>
        <li><a href="#"><i class="fas fa-home"></i>Accueil</a></li>
        <li class=""><a href="VillageServlet"><i class="fas fa-user-tie"></i>Creer un Village</a></li>
        <li  class="active"><a href="#"><i class="fas fa-address-card"></i>Creer un Client</a></li>
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
            <h2>SenForage <span class="breadcrumb">>> Creation CLient</span></h2>
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
                <i class="fas fa-user" aria-hidden="true"></i> <span class="">Account</span>
              </a>
            </li>
          </ul>
        </div>
      </div>
      <!-- // CONTENU CENTRAL :  -->
      <div class="info">
          <header>
          <hr />
           <h1>INFORMATION CLIENT </h1>
    </header>
        
      <div class="introduction">
      <form  method="post" action="ClientServlet" id="creerClientForm">
      <div id="nom">
       <label for="nom"> Nom client :</label><strong>*</strong>
       <input type="text" name="nom" id="nom" class="normale" />
       <span id="nom_manquant"></span><br /><br />
      
       <label for="adresse">adresse client :</label><strong>*</strong>
       <input type="text" name="adresse" id="adresse"  class="normale"/>
       <span id="adresse_manquant"></span><br /><br />

       <label for="telephone"> Numero telephone :</label><strong>*</strong>
       <input type="tel" name="telephone" id="telephone"  class="normale"/>
       <span id="phone_manquant"></span><br /><br />

       <select name="id_village" id="client">
          <option value="">Choisir village</option>
          
                  <c:forEach items="${villages}" var="p">
                      <option value="${p.id}">
                          ${p.id}
                          ${p.nom}
                      </option>
                  </c:forEach>
             

      </select>

        <input type="submit" id="envoyer" value="Enregistrer" class="envoie"  />
       </form>
        <p> Les champs avec <strong>*</strong> sont obligatoire</p>
      </div>
      </div>
     
      <!-- FIN CONTENU CENTRAL -->
    </div>
    <!-- ENDING MAIN CONTENT -->
  </div>
  <!-- ENDING CONTAINER GENERAL -->
      
    <!-- Main JS -->
    <script src="../../public/js/global.js"></script>
    <script src="../../public/js/client.js"></script>
</body>

</html>
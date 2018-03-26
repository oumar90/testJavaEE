<%-- 
    Document   : _nav
    Created on : 26 mars 2018, 12:45:18
    Author     : oumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<body>
  <!-- Dropdown Structure -->
<ul id="dropdown1" class="dropdown-content">
  <li><a href="#!">one</a></li>
  <li><a href="#!">two</a></li>
  <li class="divider"></li>
  <li><a href="#!">three</a></li>
</ul>
  <nav class="white" role="navigation">
    <div class="nav-wrapper container">
      <a id="logo-container" href="#" class="brand-logo">FreeLearning</a>
      <ul class="right hide-on-med-and-down">
      <li><a href="sass.html">Sass</a></li>
      <li><a href="badges.html">Components</a></li>
      <!-- Dropdown Trigger -->
      <li>
        <a class="dropdown-button" href="#!" data-activates="dropdown1">Dropdown<i class="material-icons right"></i></a></li>
    </ul>
      </div>
  </nav>
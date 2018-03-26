package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/_header.jsp");
    _jspx_dependants.add("/WEB-INF/_nav.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("  <title>Home</title>\n");
      out.write("\n");
      out.write("  <!-- CSS  -->\n");
      out.write("  <link href=\"css/materialize.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("  <link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>  \n");
      out.write("  \n");
      out.write("</head>");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <!-- Dropdown Structure -->\n");
      out.write("<ul id=\"dropdown1\" class=\"dropdown-content\">\n");
      out.write("  <li><a href=\"#!\">one</a></li>\n");
      out.write("  <li><a href=\"#!\">two</a></li>\n");
      out.write("  <li class=\"divider\"></li>\n");
      out.write("  <li><a href=\"#!\">three</a></li>\n");
      out.write("</ul>\n");
      out.write("  <nav class=\"white\" role=\"navigation\">\n");
      out.write("    <div class=\"nav-wrapper container\">\n");
      out.write("      <a id=\"logo-container\" href=\"#\" class=\"brand-logo\">FreeLearning</a>\n");
      out.write("      <ul class=\"right hide-on-med-and-down\">\n");
      out.write("      <li><a href=\"sass.html\">Sass</a></li>\n");
      out.write("      <li><a href=\"badges.html\">Components</a></li>\n");
      out.write("      <!-- Dropdown Trigger -->\n");
      out.write("      <li>\n");
      out.write("        <a class=\"dropdown-button\" href=\"#!\" data-activates=\"dropdown1\">Dropdown<i class=\"material-icons right\"></i></a></li>\n");
      out.write("    </ul>\n");
      out.write("      </div>\n");
      out.write("  </nav>");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <form class=\"col s12\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"input-field col s6\">\n");
      out.write("          <input placeholder=\"Placeholder\" id=\"first_name\" type=\"text\" class=\"validate\">\n");
      out.write("          <label for=\"first_name\">First Name</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-field col s6\">\n");
      out.write("          <input id=\"last_name\" type=\"text\" class=\"validate\">\n");
      out.write("          <label for=\"last_name\">Last Name</label>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"input-field col s12\">\n");
      out.write("          <input disabled value=\"I am not editable\" id=\"disabled\" type=\"text\" class=\"validate\">\n");
      out.write("          <label for=\"disabled\">Disabled</label>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"input-field col s12\">\n");
      out.write("          <input id=\"password\" type=\"password\" class=\"validate\">\n");
      out.write("          <label for=\"password\">Password</label>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"input-field col s12\">\n");
      out.write("          <input id=\"email\" type=\"email\" class=\"validate\">\n");
      out.write("          <label for=\"email\">Email</label>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col s12\">\n");
      out.write("          This is an inline input field:\n");
      out.write("          <div class=\"input-field inline\">\n");
      out.write("            <input id=\"email_inline\" type=\"email\" class=\"validate\">\n");
      out.write("            <label for=\"email_inline\">Email</label>\n");
      out.write("            <span class=\"helper-text\" data-error=\"wrong\" data-success=\"right\">Helper text</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

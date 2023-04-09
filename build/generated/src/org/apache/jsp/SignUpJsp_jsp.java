package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUpJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign Up Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form id=\"form\" action=\"FirstTime\" method=\"post\" class=\"form\" >\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <!--<h2 class=\"logo\"><img src=\"d1.png\"></h2>-->\n");
      out.write("            <h2>SIGN UP</h2>\n");
      out.write("            <div class=\"text_field\">\n");
      out.write("                <input id=\"firstEmail\" name=\"firstEmail\" type=\"text\" placeholder=\"Email\" required oninput=\"validateEmail()\"> <br>\n");
      out.write("            <span id=\"emailError\" style=\"color: red;\"></span>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"text_field\">\n");
      out.write("            <input id=\"firstPassword\" name=\"firstPassword\" type=\"text\" placeholder=\"Password\" required oninput=\"validatePassword()\"> <br>\n");
      out.write("            <span id=\"passError\" style=\"color: red;\"></span>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"text_field\">\n");
      out.write("            <input id=\"firstPasswordAgain\" name=\"firstPasswordAgain\" type=\"text\" placeholder=\"Re-enter Password\" required oninput=\"validateConfPassword()\"> <br>\n");
      out.write("            <span id=\"confpassError\" style=\"color: red;\"></span>\n");
      out.write("            </div> \n");
      out.write("            <Button class=\"btn\">Sign up</Button>\n");
      out.write("            <!--<input class=\"btn\" type=\"submit\" value=\"Sign up\">-->\n");
      out.write("            <br> <h3>Already have an account? <a href=\"http://localhost:23667/AdmissionPortal/LoginAdmission_EN.html\" class=\"register-link\">Log In</a></h3>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

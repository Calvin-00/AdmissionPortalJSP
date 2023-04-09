package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Log In Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\n");
      out.write("        <form id=\"form\" action=\"LoginManager\" method=\"post\">\n");
      out.write("            <h1>Log In</h1>\n");
      out.write("            <div class=\"input-control\">\n");
      out.write("                <label for=\"username\">Email</label>\n");
      out.write("                <input id=\"usernameLogins\" name=\"email\" type=\"text\" required oninput=\"validateEmailLogIn()\">\n");
      out.write("                <span id=\"emailError\" style=\"color: red;\"></span>\n");
      out.write("                <div class=\"error\"></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"input-control\">\n");
      out.write("                <label for=\"password\">Password</label>\n");
      out.write("                <input id=\"passwordLogins\" name=\"password\" type=\"password\" required oninput=\"validatePasswordLogIn()\">\n");
      out.write("                <span id=\"passError\" style=\"color: red;\"></span>\n");
      out.write("                <div class=\"error\"></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <button type=\"submit\">Log In</button>\n");
      out.write("            <div class=\"login-register\">\n");
      out.write("                        <h3>Don't have an account? <a href=\"SignUpJsp.jsp\" class=\"register-link\">Register</a></h3>\n");
      out.write("                    </div>\n");
      out.write("            </form> \n");
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

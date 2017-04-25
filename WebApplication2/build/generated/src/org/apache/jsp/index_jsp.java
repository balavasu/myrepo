package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<form method=\"post\" action=\"insert.jsp\">\n");
      out.write("<table>\n");
      out.write("<tr><td>First Name:</td><td><input type=\"text\" name=\"fname\"></td></tr>\n");
      out.write("<tr><td>Last Name:</td><td><input type=\"text\" name=\"lname\"></td></tr>\n");
      out.write("<tr><td>Email:</td><td><input type=\"text\" name=\"email\"></td></tr>\n");
      out.write("<tr><td>Password:</td><td><input type=\"password\" name=\"pass\"></td></tr>\n");
      out.write("<tr><td>Confirm Password:</td><td><input type=\"password\" name=\"cpass\"></td></tr>\n");
      out.write("<tr><td>Date Of Birth</td><td><input type=\"text\" name=\"dob\"></td></tr>\n");
      out.write("<tr><td>Age:</td><td><input type=\"text\" name=\"age\"></td></tr>\n");
      out.write("<tr><td>Gender</td><td><input type=\"text\" name=\"gender\"></td></tr>\n");
      out.write("<tr><td>Address:</td><td><input type=\"text\" name=\"address\"></td></tr>\n");
      out.write("<tr><td>Country</td><td><input type=\"text\" name=\"country\"></td></tr>\n");
      out.write("<tr><td>State:</td><td><input type=\"text\" name=\"state\"></td></tr>\n");
      out.write("<tr><td>City</td><td><input type=\"text\" name=\"city\"></td></tr>\n");
      out.write("<tr><td>Telephone No:</td><td><input type=\"text\" name=\"tno\"></td></tr>\n");
      out.write("<tr><td>Mobile:</td><td><input type=\"text\" name=\"mobile\"></td></tr>\n");
      out.write("<tr><td></td><td><input type=\"submit\" value=\"Submit\"></td></tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</html>");
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

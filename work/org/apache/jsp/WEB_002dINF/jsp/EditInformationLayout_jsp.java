/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.24
 * Generated at: 2018-08-30 10:55:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditInformationLayout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1530699152359L));
    _jspx_dependants.put("jar:file:/C:/acquire/StudentManagement/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425955270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function ClickSave()\r\n");
      out.write("{\r\n");
      out.write("\tvar form = document.getElementById(\"save\");\r\n");
      out.write("\tform.method = \"post\";\r\n");
      out.write("\tform.action = '/StudentManagement/Edit.do';\r\n");
      out.write("\tform.submit();\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("function ClickBack()\r\n");
      out.write("{\r\n");
      out.write("\tlocation.replace('/StudentManagement/studentList.do');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form name=\"form\" id=\"save\">\r\n");
      out.write("\t<h2>Edit Student Information</h2>\r\n");
      out.write("\t<input type=\"hidden\" name=\"StID\" id=\"StID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${studid1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>Student Name</td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"StName\" id=\"StName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>Address</td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"StAddress\" id=\"StAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${saddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>Phone Number</td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"StPhoneNum\" id=\"StPhoneNum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sphoneno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>Year</td>\r\n");
      out.write("\t<td><select name=\"StYear\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${syear}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t<option value=\"FYear\" selected>First Year</option>\r\n");
      out.write("\t<option value=\"SYear\">Second Year</option>\r\n");
      out.write("\t<option value=\"TYear\">Third Year</option>\r\n");
      out.write("\t<option value=\"FourthYear\">Fourth Year</option>\r\n");
      out.write("\t<option value=\"FifthYear\">Fifth Year</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>Major</td>\r\n");
      out.write("\t<td><select id=\"major\" name=\"StMajor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${smajor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t<option value=\"none\" selected>None(1st and 2nd year)</option>\r\n");
      out.write("    <option value=\"SE\" >Software Engineering</option>\r\n");
      out.write("    <option value=\"BIS\">Business Information System</option>\r\n");
      out.write("    <option value=\"KE\">Knowledge Engineering</option>\r\n");
      out.write("    <option value=\"HPC\">High Performance Computing</option>\r\n");
      out.write("    <option value=\"CSystem\">Computer System</option>\r\n");
      out.write("    <option value=\"CN\">Computer Networking</option>\r\n");
      out.write("    <option value=\"ES\">Embedded System</option>\r\n");
      out.write("    <option value=\"CT\">Computer Technology(3rd Year Students only)</option>\r\n");
      out.write("    <option value=\"CS\">Computer Science(3rd Year Students only)</option>\r\n");
      out.write("    </select>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>Email</td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"email\" id=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${semail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>D.O.B</td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"dob\" id=\"dob\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sdob}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>Gender</td>\r\n");
      out.write("\t<td><input type=\"radio\" name=\"gender\" id=\"male\" value=\"Male\">Male\r\n");
      out.write("\t<input type=\"radio\" name=\"gender\" id=\"female\" value=\"Female\">Female\r\n");
      out.write("\t<input type=\"hidden\" id=\"gender\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sgender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>Father Name</td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"fatherName\" id=\"fatherName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sfather}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>NRC</td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"nrc\" id=\"nrc\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${snrc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<input type=\"button\" value=\"Save\" onclick=\"ClickSave()\">\r\n");
      out.write("\t<input type=\"button\" value=\"Back\" onclick=\"ClickBack()\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t//alert(document.getElementById(\"gender\").value);\r\n");
      out.write("\tif(document.getElementById(\"gender\").value===\"Female\"){\r\n");
      out.write("\t\tdocument.getElementById(\"female\").checked = true;\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(document.getElementById(\"gender\").value===\"Male\"){\r\n");
      out.write("\t\t//alert('enter');\r\n");
      out.write("\t\tdocument.getElementById(\"male\").checked = true;\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

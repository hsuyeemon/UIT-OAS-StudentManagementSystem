/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.24
 * Generated at: 2018-08-30 10:52:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("    width:100%;\r\n");
      out.write("}\r\n");
      out.write("th {\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    background-color: #f1f1f1;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("td {\r\n");
      out.write("    text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#studentList{\r\n");
      out.write("display:none;\r\n");
      out.write("}\r\n");
      out.write("#year{\r\n");
      out.write("display:none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#major{\r\n");
      out.write("display:none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

Object result = request.getAttribute("results");
String searchKey = (String)request.getAttribute("searchKey");
String specificKey = (String)request.getAttribute("specificKey");
String location = (String)request.getAttribute("location");
System.out.println("JSP"+result);
	
      out.write("\r\n");
      out.write("<h2>Student Management</h2>\r\n");
      out.write("<hr>\r\n");
      out.write("<form action=\"studentList.do\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<select id = \"search_key\" name=\"search_key\" style=\"width:20%\" onchange=\"search_key_function()\">\r\n");
      out.write("  <option value=\"name\" selected>Student Name</option>\r\n");
      out.write("  <option value=\"year\">Academic Year</option>\r\n");
      out.write("  <option value=\"major\">Major</option>\r\n");
      out.write("</select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<select id =\"year\" name=\"year\" style=\"width:20%\">\r\n");
      out.write("\r\n");
      out.write("  <option value=\"First\" selected>First Year</option>\r\n");
      out.write("  <option value=\"Second\">Second Year</option>\r\n");
      out.write("  <option value=\"Third\">Third Year</option>\r\n");
      out.write("  <option value=\"Fourth\">Fourth Year</option>\r\n");
      out.write("  <option value=\"Final\">Final Year</option>\r\n");
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("\r\n");
      out.write("<select id =\"major\" name=\"major\" style=\"width:20%\">\r\n");
      out.write("  <option value=\"SE\" selected>Software Engineering</option>\r\n");
      out.write("  <option value=\"BIS\">Business Information System</option>\r\n");
      out.write("  <option value=\"KE\">Knowledge Engineering</option>\r\n");
      out.write("  <option value=\"HPC\">High Performance Computing</option>\r\n");
      out.write("  <option value=\"CSystem\">Computer System</option>\r\n");
      out.write("  <option value=\"CN\">Computer Networking</option>\r\n");
      out.write("  <option value=\"ES\">Embedded System</option>\r\n");
      out.write("  <option value=\"CT\">Computer Technology(3rd Year Students only)</option>\r\n");
      out.write("  <option value=\"CS\">Computer Science(3rd Year Students only)</option>\r\n");
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("<input id=\"name\" type=\"text\" name=\"name\" style=\"width:20%\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<input type=\"submit\" name=\"search\" value=\"Search\">\r\n");
      out.write("<input type=\"submit\" name=\"showAll\" value=\"Show All\">\r\n");
      out.write("<input id =\"back\" type=\"button\" name=\"back\" value=\"Back\" onclick=\"history.back()\">\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<div id=\"studentList\" style=\" overflow-x:auto\">\r\n");
      out.write("<h2>Student List</h2>\r\n");
      out.write("\r\n");
      out.write("<table id=\"studentTable\">\r\n");
      out.write("         <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <th>#</th>\r\n");
      out.write("                    <th>SID</th>\r\n");
      out.write("                    <th>Name</th>\r\n");
      out.write("                    <th>Address</th>\r\n");
      out.write("                    <th>Phone NO.</th>\r\n");
      out.write("                    <th>Academic Year</th>\r\n");
      out.write("                    <th>Major</th>\r\n");
      out.write("                    <th>Email</th>\r\n");
      out.write("                    <th>Date of Birth</th>\r\n");
      out.write("                    <th>Gender</th>\r\n");
      out.write("                    <th>Father's Name</th>\r\n");
      out.write("                    <th>NRC</th>\r\n");
      out.write("                    <th></th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<form id= \"add\">\r\n");
      out.write("<input type=\"button\" value=\"Add\" onclick=\"add()\">\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("var s = \"");
      out.print(searchKey);
      out.write("\";\r\n");
      out.write("var k = \"");
      out.print(specificKey);
      out.write("\";\r\n");
      out.write("var loc = \"");
      out.print(location);
      out.write("\";\r\n");
      out.write("//alert(loc);\r\n");
      out.write("var value = \"");
      out.print(result);
      out.write("\";\r\n");
      out.write("//alert(\"result\"+value);\r\n");
      out.write("\r\n");
      out.write("if(s!=\"null\" && k!=\"null\"){\r\n");
      out.write("document.getElementById('search_key').value=s;\r\n");
      out.write("search_key_function();\r\n");
      out.write("\t\tswitch(s){\r\n");
      out.write("        \tcase \"name\" :document.getElementById('name').value =k;break;\r\n");
      out.write("        \tcase \"year\" :document.getElementById('year').value=k;break;\r\n");
      out.write("        \tcase \"major\" :document.getElementById('major').value=k;break;\r\n");
      out.write("        \t}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    if (value == null || value == \"null\" ||value.length==0){\r\n");
      out.write("    \t//alert(\"result2\"+value);\r\n");
      out.write("        document.getElementById(\"studentList\").style.display = \"none\";\r\n");
      out.write("    }\r\n");
      out.write("   else{\r\n");
      out.write("\t  // alert(\"result3\"+value);\r\n");
      out.write("    document.getElementById(\"studentList\").style.display = \"block\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function search_key_function() {\r\n");
      out.write("        var x = document.getElementById(\"search_key\").value;\r\n");
      out.write("        //document.getElementById(\"demo\").innerHTML = \"You selected: \" + x;\r\n");
      out.write("        if(x === \"name\"){\r\n");
      out.write("        \tdocument.getElementById(\"name\").style.display = \"inline\";\r\n");
      out.write("        \tdocument.getElementById(\"year\").style.display = \"none\";\r\n");
      out.write("        \tdocument.getElementById(\"major\").style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        else if(x === \"year\"){\r\n");
      out.write("        \tdocument.getElementById(\"year\").style.display = \"inline\";\r\n");
      out.write("        \tdocument.getElementById(\"major\").style.display = \"none\";\r\n");
      out.write("        \tdocument.getElementById(\"name\").style.display = \"none\";\r\n");
      out.write("        }\r\n");
      out.write("        else if(x === \"major\"){\r\n");
      out.write("        \tdocument.getElementById(\"major\").style.display = \"inline\";\r\n");
      out.write("        \tdocument.getElementById(\"name\").style.display = \"none\";\r\n");
      out.write("        \tdocument.getElementById(\"year\").style.display = \"none\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function goBack(){\r\n");
      out.write("    \tvar loc = \"");
      out.print(location);
      out.write("\";\r\n");
      out.write("    \tif(loc == \"welcome\"){\r\n");
      out.write("    \t\t//document.getElementById(\"back\").location.href = '/StudentManagement/welcome.do;\r\n");
      out.write("    \t\tlocation.replace('/StudentManagement/welcome.do');\r\n");
      out.write("    \t}\r\n");
      out.write("    \telse if(loc == \"registeration\"){\r\n");
      out.write("    \t\t//document.getElementById(\"back\").location.href = '/StudentManagement/simple82.do;\r\n");
      out.write("    \t\tlocation.replace('/StudentManagement/welcome.do');\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    function add(){\r\n");
      out.write("    \talert(\"add\");\r\n");
      out.write("    \tvar form = document.getElementById('add');\r\n");
      out.write("    \tform.method=\"get\";\r\n");
      out.write("    \tform.action='add.do';\r\n");
      out.write("    \tform.submit();\r\n");
      out.write("    \tlocation.replace('/StudentManagement/welcome.do');\r\n");
      out.write("    \texit();\r\n");
      out.write("    }\r\n");
      out.write("    function edit(a){\r\n");
      out.write("    \talert(\"edit\");\r\n");
      out.write("    \tdocument.getElementById('studid1').value=a;\r\n");
      out.write("    \tdocument.getElementById('studid1').innerHTML=a;\r\n");
      out.write("\r\n");
      out.write("    \tvar form = document.getElementById('edit');\r\n");
      out.write("    \t//form.\r\n");
      out.write("    \tform.method=\"get\";\r\n");
      out.write("    \tform.action='Edit.do';\r\n");
      out.write("    \tform.submit();\r\n");
      out.write("    }\r\n");
      out.write("    function deleteStud(){\r\n");
      out.write("    \talert(\"delete\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \tdocument.getElementById('studid2').value=a;\r\n");
      out.write("    \tdocument.getElementById('studid2').innerHTML=a;\r\n");
      out.write("\r\n");
      out.write("    \tvar form = document.getElementById('delete');\r\n");
      out.write("    \tform.method=\"get\";\r\n");
      out.write("    \tform.action='delete.do';\r\n");
      out.write("    \tform.submit();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/studentList.jsp(114,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("data");
    // /WEB-INF/jsp/studentList.jsp(114,0) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/studentList.jsp(114,0) '${results}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${results}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/studentList.jsp(114,0) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/studentList.jsp(116,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.count != 0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <tr>\r\n");
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("                <td>\r\n");
        out.write("                <form id=\"edit\"><input type=\"button\" value=\"Edit\" onclick=\"edit(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.SID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write(")\">\r\n");
        out.write("                <input type=\"hidden\" id=\"studid1\" name=\"studidEdit\" value=\"\"/>\r\n");
        out.write("                </form>\r\n");
        out.write("                <form id=\"delete\"><input type=\"button\" value=\"Delete\" onclick=\"deleteStud(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.SID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write(")\">\r\n");
        out.write("                <input type=\"hidden\" id=\"studid2\" name=\"studidDelete\" value=\"\"/></form></td>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                    </tr>\r\n");
        out.write("                    <tr></tr><tr>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/jsp/studentList.jsp(119,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("body");
    // /WEB-INF/jsp/studentList.jsp(119,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/studentList.jsp(119,16) '${data}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${data}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <td style=\"width: 120px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${body.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}

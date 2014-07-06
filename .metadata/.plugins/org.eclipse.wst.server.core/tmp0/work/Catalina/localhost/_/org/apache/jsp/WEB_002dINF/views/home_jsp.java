/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2014-07-06 13:46:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html ng-app>\n");
      out.write("<head>\n");
      out.write("<title>Hello World, AngularJS - ViralPatel.net</title>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js\"></script>\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div ng-controller=\"BoardController\">\n");
      out.write("\t\tEmail:<input type=\"text\" ng-model=\"newcontact\" />\n");
      out.write("\t\t<button ng-click=\"addEmail()\">Add</button>\n");
      out.write("\t\t<h2>EmailList</h2>\n");
      out.write("\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li ng-repeat=\"board in boards\">\n");
      out.write("\t\t\t\t<div class=\"article-head\">\n");
      out.write("\t\t\t\t\t<h4 class=\"media-heading\">\n");
      out.write("\t\t\t\t\t\t<tr>{{board.email}} <a class=\"article-time\"\n");
      out.write("\t\t\t\t\t\t\ttitle=\"Modified by {{article.modtime}}\">작성일\n");
      out.write("\t\t\t\t\t\t\t{{board.date_created}}</a>\n");
      out.write("\t\t\t\t\t\t\t</tr> \n");
      out.write("\t\t\t\t\t\t\t<tr>내용 {{board.content}}</tr>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-danger pull-left\"\n");
      out.write("\t\t\t\t\t\t\tng-click=\"changeEmail(board)\">수정하</button>\n");
      out.write("\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tvar BoardController = function($scope, $http) {\n");
      out.write("\t\t\t$scope.boards;\n");
      out.write("\t\t\t$scope.addEmail = function() {\n");
      out.write("\t\t\t\t$http.get('addEmail').success(function(protocoldata) {\n");
      out.write("\t\t\t\t\t$scope.boards = protocoldata.boards;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t};\n");
      out.write("\t\t\t$scope.changeEmail = function(board) {\n");
      out.write("\t\t\t\t$http({\n");
      out.write("\t\t\t\t\tmethod : 'POST',\n");
      out.write("\t\t\t\t\turl : 'changeboard',\n");
      out.write("\t\t\t\t\tdata : article\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t};\n");
      out.write("\t\t};\n");
      out.write("\t</script>\n");
      out.write("\t<!-- \t\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction FetchCtrl($scope, $http, $templateCache) {\n");
      out.write("\t\t\t$scope.method = 'GET';\n");
      out.write("\t\t\t$scope.url = 'addEmail';\n");
      out.write("\n");
      out.write("\t\t\t$scope.fetch = function() {\n");
      out.write("\t\t\t\t$scope.code = null;\n");
      out.write("\t\t\t\t$scope.response = null;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$http({\n");
      out.write("\t\t\t\t\tmethod : $scope.method,\n");
      out.write("\t\t\t\t\turl : $scope.url,\n");
      out.write("\t\t\t\t\tcache : $templateCache\n");
      out.write("\t\t\t\t}).success(function(data, status) {\n");
      out.write("\t\t\t\t\talert('aaa');\n");
      out.write("\t\t\t\t\t$scope.status = status;\n");
      out.write("\t\t\t\t\t$scope.data = data;\n");
      out.write("\t\t\t\t}).error(function(data, status) {\n");
      out.write("\t\t\t\t\talert(data);\n");
      out.write("\t\t\t\t\t$scope.data = data || \"Request failed\";\n");
      out.write("\t\t\t\t\t$scope.status = status;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t};\n");
      out.write("\n");
      out.write("\t\t\t$scope.updateModel = function(method, url) {\n");
      out.write("\t\t\t\t$scope.method = method;\n");
      out.write("\t\t\t\t$scope.url = url;\n");
      out.write("\t\t\t};\n");
      out.write("\t\t}\n");
      out.write("\t</script> -->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
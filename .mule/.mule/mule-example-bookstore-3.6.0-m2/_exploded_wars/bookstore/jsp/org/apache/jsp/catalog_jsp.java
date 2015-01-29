package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.mule.example.bookstore.Book;
import org.mule.example.bookstore.CatalogService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public final class catalog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"en-us\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<title>On-line Bookstore</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body link=\"#FFFFFF\" vlink=\"#FFFFFF\" alink=\"#FFFFFF\" bgcolor=\"#000055\" text=\"#FFFFFF\">\r\n");
      out.write("\r\n");

    String field = request.getParameter("title");
    String title = field != null ? field : "";
    field = request.getParameter("author");
    String author = field != null ? field : "";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<center><h3>Welcome to the Mule-powered On-line Bookstore</h3></center>\r\n");
      out.write("<hr/>\r\n");
      out.write("    \r\n");
      out.write("<h2>Search for a book</h2>\r\n");
      out.write("<form method=\"POST\" name=\"submitRequest\" action=\"\">\r\n");
      out.write("    <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>Title: </td>\r\n");
      out.write("            <td><input type=\"text\" name=\"title\" value=\"");
      out.print(title);
      out.write("\"/></td>\r\n");
      out.write("           </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>Author: </td>\r\n");
      out.write("            <td><input type=\"text\" name=\"author\" value=\"");
      out.print(author);
      out.write("\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <input type=\"hidden\" name=\"submitted\" value=\"true\"/>\r\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"Search\" />\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");

    String submitted = request.getParameter("submitted");

    if (submitted != null) 
    {
        // Invoke the CXF web service
        JaxWsProxyFactoryBean pf = new JaxWsProxyFactoryBean();
        pf.setServiceClass(CatalogService.class);
        pf.setAddress(CatalogService.URL);
        CatalogService catalog = (CatalogService) pf.create();

        Collection <Book> books = catalog.getBooks();
        // Something in the way CXF marshalls the response converts an empty collection to null
        if (books == null)
        {
            books = new ArrayList();
        }
        
      out.write("\r\n");
      out.write("        Your search returned the following book(s):<br/>\r\n");
      out.write("        <br/>\r\n");
      out.write("\r\n");
      out.write("        <table>\r\n");
      out.write("        <tr><th>Title</th><th>Author</th><th>Price</th><th/></tr>\r\n");
      out.write("        ");

        Book book;
        for (Iterator<Book> i = books.iterator(); i.hasNext();)
        {
            book = i.next();
            if (book.getTitle().contains(title) && book.getAuthor().contains(author))
            {
            
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(book.getTitle());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(book.getAuthor());
      out.write("</td>\r\n");
      out.write("                    <td>$");
      out.print(book.getPrice());
      out.write("</td>\r\n");
      out.write("                    <td><a href=\"");
      out.print(request.getContextPath());
      out.write("/order.jsp?id=");
      out.print(book.getId());
      out.write("\">Order this book</a></td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("        ");

            }
        }
        
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    ");

     } 
     
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr/>\r\n");
      out.write("<center><i>\r\n");
      out.write("For more information about the Bookstore example go <a target=\"_blank\" href=\"http://www.mulesoft.org/documentation/display/MULE3EXAMPLES/Bookstore+Example\">here</a>.\r\n");
      out.write("</i></center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

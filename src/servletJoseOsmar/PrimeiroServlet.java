package servletJoseOsmar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PrimeiroServlet", urlPatterns = "/PrimeiroServlet")
public class PrimeiroServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext contexto = getServletContext();
        contexto.setAttribute("user", "José Osmar");
        contexto.setAttribute("email", "joseosmarmartins@hotmail.com");

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Primeiro Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Primeiro Servlet</h1>");
        out.println("<form method='get' action='SegundoServlet'>");
        out.println("<input type='submit' name='btnl' value='Segundo Servlet'/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}

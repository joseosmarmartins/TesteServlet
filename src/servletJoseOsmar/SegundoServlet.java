package servletJoseOsmar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SegundoServlet", urlPatterns = "/SegundoServlet")
public class SegundoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext contexto = getServletContext();
        String user = (String) contexto.getAttribute("user");
        String email = (String) contexto.getAttribute("email");

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Segundo Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<br><h1>USER: " + user + "</h1></br>");
        out.println("<br><h1>E-MAIL: " + email + "</h1></br>");
        out.println("</body>");
        out.println("</html>");
    }
}

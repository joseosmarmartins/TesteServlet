package servletJoseOsmar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ExemploSendRedirect")
public class ExemploSendRedirect extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> ExemploSendRedirect Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> ExemploSendRedirect Servlet</h1>");
        out.println("<form method='post' action='ExemploSendRedirect'>");

        out.println("<label>Nome:</label>");
        out.println("<input type='text' name='nome'/>");

        out.println("<input type='submit' value='Enviar'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        resp.sendRedirect("/SegundoServlet?name=" + nome);
    }
}

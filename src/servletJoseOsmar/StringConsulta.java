package servletJoseOsmar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StringConsulta")
public class StringConsulta extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Método GET</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Método GET</h1>");
        out.println("<h3>Query String: " + request.getQueryString() + "<br></h3>");
        out.println("<form method='get' action='StringConsulta'>");
        out.println("Nome Usuário:");
        out.println("<input type='text' name='nomeUsuario'/> <br>");
        out.println("Senha: ");
        out.println("<input type='password' name='senhaUsuario'/>");
        out.println("<input type='submit' value='Enviar'/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}

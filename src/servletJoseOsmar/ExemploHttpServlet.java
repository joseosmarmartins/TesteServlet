package servletJoseOsmar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExemploHttpServlet")
public class ExemploHttpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> M�todo GET</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> M�todo GET</h1>");
        out.println("<form method='post' action='ExemploHttpServlet'>");
        out.println("Nome Usu�rio:");
        out.println("<input type='text' name='nomeUsuario'/> <br>");
        out.println("Senha: ");
        out.println("<input type='password' name='senhaUsuario'/>");
        out.println("<input type='submit' value='Enviar'/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("nomeUsuario");
        String senha = request.getParameter("senhaUsuario");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Metodo POST</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> USER: "+ user+"</h1> <br>");
        out.println("<h1> SENHA: "+ senha+"</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}

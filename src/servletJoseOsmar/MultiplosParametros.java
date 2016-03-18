package servletJoseOsmar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MultiplosParametros")
public class MultiplosParametros extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Multiplos Valores</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Multiplos Valores</h1>");
        out.println("<form method='post' action='MultiplosParametros'>");
        out.println("Estilo Musical: <br>");
        out.println("<input type='checkbox' name='estilo' value='sertanejo'/>Sertanejo<br>");
        out.println("<input type='checkbox' name='estilo' value='funk'/>Funk<br>");
        out.println("<input type='checkbox' name='estilo' value='rock'/>Rock<br>");
        out.println("<input type='submit' value='Enviar'/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] values = req.getParameterValues("estilo");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (values != null) {
            int lenght = values.length;
            out.println("Estilos Selecionados: <br>");
            for (int i = 0; i < lenght; i ++) {
                out.println(values[i] + "<br>");
            }
        }
    }
}

package servletJoseOsmar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/CabecalhosHttp")
public class CabecalhosHttp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        Enumeration headers = req.getHeaderNames();
        while (headers.hasMoreElements()) {
            String header = ((String) headers.nextElement());
            out.println(header + ":" + req.getHeader(header) + "<br>");
        }
    }
}

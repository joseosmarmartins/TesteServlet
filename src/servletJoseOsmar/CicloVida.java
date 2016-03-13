package servletJoseOsmar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="CicloVida", urlPatterns={"/primeiro", "/helloWorld"}, initParams={
        @WebInitParam(name="User", value="José Osmar"),
        @WebInitParam(name="Email", value="joseosmarmartins@hotmail.com")
})
public class CicloVida extends HttpServlet {

    public CicloVida() {
        super();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Inicializando...");
        String user = config.getInitParameter("User");
        String email = config.getInitParameter("Email");

        System.out.println(user);
        System.out.println(email);
    }

    @Override
    public void destroy() {
        System.out.println("Finalizando...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Aguardando....");
    }
}

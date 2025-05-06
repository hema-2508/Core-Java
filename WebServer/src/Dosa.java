import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//dry is a alias name(reference name) to create copy, loadOnStartup is used to define/tell when to start
//GenericServlet is the subclass of Servet
@WebServlet(urlPatterns = "/dry", loadOnStartup = 1)
public class Dosa extends GenericServlet {
    public Dosa() {
        System.out.println("server is loaded");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service is overloaded in Dosa");
    }
}
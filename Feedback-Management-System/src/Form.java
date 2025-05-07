import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit", loadOnStartup = 1)
public class Form extends GenericServlet {
    public Form(){
        System.out.println("Running form");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name= servletRequest.getParameter("name");
        String email= servletRequest.getParameter("email");
        String number= servletRequest.getParameter("number");
        String feedback= servletRequest.getParameter("feedback");
        System.out.println("name : "+name);
        System.out.println("mail : "+email);
        System.out.println("number : "+number);
        System.out.println("feedback : "+feedback);

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter() ;
        writer.println("hey "+name+" Thanks for the task");

    }
}

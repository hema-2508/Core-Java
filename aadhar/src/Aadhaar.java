import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit", loadOnStartup = 1)
public class Aadhaar extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String number= servletRequest.getParameter("number");
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter() ;
        if(number.length()==12){
            writer.println(" Your aadhar number is valid and the number is : "+number);
        }
        else {

            writer.println(" Your aadhar number is not valid ");
        }


    }
}

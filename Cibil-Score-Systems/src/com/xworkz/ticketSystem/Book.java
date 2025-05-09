package com.xworkz.ticketSystem;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/book")
public class Book extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int score = 0;
        int income=0;
        int loan=0;
        int creditUtilization=0;
        int paymentHistory=0;
        String name = servletRequest.getParameter("name");
        String incomeStr = servletRequest.getParameter("income");
        String loanStr = servletRequest.getParameter("loan");
        String creditUtilStr = servletRequest.getParameter("credit_utilization");
        String paymentHistoryStr = servletRequest.getParameter("payment_history");

        if (incomeStr != null && incomeStr!= ""){
            income = Integer.parseInt(incomeStr);
        }
        if (loanStr != null && loanStr!= ""){
            loan = Integer.parseInt(loanStr);
        }
        if (creditUtilStr != null && creditUtilStr!= ""){
            creditUtilization = Integer.parseInt(creditUtilStr);
        }
        if (paymentHistoryStr != null && paymentHistoryStr!= ""){
            paymentHistory = Integer.parseInt(paymentHistoryStr);
        }

        if (income > 50000) {
            score += 30;
        }
        if (loan < 100000) {
            score += 20;
        }
        if (creditUtilization < 30) {
            score += 20;
        }
        if (paymentHistory == 1) {
            score += 30;
        }


        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1>Credit Score Estimation</h1>");
        writer.println("<p>Hello, " + name + "!</p>");
        writer.println("<p>Your estimated CIBIL score is: " + score + "</p>");
    }
}

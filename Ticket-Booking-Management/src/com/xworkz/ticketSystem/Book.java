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
        int t_price=0;
        int amount=0;
        int no_of_tickets=0;
        String name= servletRequest.getParameter("name");
        String moviename= servletRequest.getParameter("moviename");
        String prices= servletRequest.getParameter("price");
        if(prices!=null&&prices!=""){
            t_price= Integer.parseInt(prices);
        }
        String ticketsin= servletRequest.getParameter("tickets");
        if(ticketsin!=null&&ticketsin!=""){
            no_of_tickets= Integer.parseInt(ticketsin);
        }
        String email= servletRequest.getParameter("email");
        amount=t_price*no_of_tickets;
        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();
        writer.println("<h1>You have successfully booked your ticket</h1>" +
                "The amount you should pay is "+amount);


    }
}

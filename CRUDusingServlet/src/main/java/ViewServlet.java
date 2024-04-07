/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<a href='index.html'>Add New User</a>");
        out.println("<h1>User List</h1>");

        List<User> list = UserDAO.getAllUsers();

        out.print("<table border='1' width='100%'>");
        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Role</th>"
                + "<th>Edit</th><th>Delete</th></tr>");
        for (User e : list) {
            out.print("<tr><td>" + e.getId() + "</td><td>" + e.getUsername() + "</td><td>"
                    + e.getPassword() + "</td><td>" + e.getRole() + "</td><td><a href='EditServlet?id="
                    + e.getId() + "'>edit</a></td><td><a href='DeleteServlet?id="
                    + e.getId() + "'>delete</a></td></tr>");
        }
        out.print("</table>");

        out.close();
    }

 
    }

    



 
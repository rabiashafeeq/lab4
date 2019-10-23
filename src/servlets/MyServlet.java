package servlets;

import db.DbConnection;
import jdk.internal.org.jline.utils.Colors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Username =request.getParameter("Username");
        String Password=request.getParameter("Password");
        String Firstname=request.getParameter("Firstname");
        String Lastname=request.getParameter("Lastname");
        String DateofBirth=request.getParameter("DateofBirth");
        String Email =request.getParameter("Email");





        DbConnection dbConnection=new DbConnection();



        dbConnection.insertData(Username,Password,Firstname,Lastname,DateofBirth,Email);





        PrintWriter out =response.getWriter();
        out.write( "Record save succesfully");

        out.write("username is"+Username);
        out.write("password is"+Password);
        out.write("firstname is"+Firstname);
        out.write("lastname is"+Lastname);
        out.write("date of birth is"+DateofBirth);
        out.write("Email is"+Email);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

    out.write(  "you are in servlettttt" );
    }
}

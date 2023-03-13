/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ROMAN
 */
public class Consulta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html><body>");
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            String url = "jdbc:mysql://localhost/colegio";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from alumno");
            out.println("<table border = '1' align='center'>");
            out.println("<tr bgcolor='#ADD8E6'><th>COD</th><th>NOMBRE</th><th>APELLIDO</th><th>NOTA1</th><th>NOTA2</th><th>Promedio</th></tr>");
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getInt(1) + "</td>");
                out.println("<td>" + rs.getString(2) + "</td>");
                out.println("<td>" + rs.getString(3) + "</td>");
                out.println("<td>" + rs.getDouble(4) + "</td>");
                out.println("<td>" + rs.getDouble(5) + "</td>");
                out.println("<td>" + rs.getDouble(6) + "</td>");
                out.println("<tr>");
            }
            out.println("</table>");
            out.println("<br>");
            String bus = request.getParameter("NOMBRE");
            out.println("<h1>LOS RESULTADOS DE "+bus +"</h1>");
            ResultSet rs2 = st.executeQuery(("select * from alumno where Nombre= "+ "'" + bus + "'"));
            out.println("<table border = '2' aling='center'>");            
            out.println("<tr bgcolor='#ADD8E6'><th>COD</th><th>NOMBRE</th><th>APELLIDO</th><th>NOTA1</th><th>NOTA2</th><th>Promedio</th></tr>");
            while (rs2.next()) {
                out.println("<tr>");
                out.println("<td>" + rs2.getInt(1) + "</td>");
                out.println("<td>" + rs2.getString(2) + "</td>");
                out.println("<td>" + rs2.getString(3) + "</td>");
                out.println("<td>" + rs2.getDouble(4) + "</td>");
                out.println("<td>" + rs2.getDouble(5) + "</td>");
                out.println("<td>" + rs2.getDouble(6) + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

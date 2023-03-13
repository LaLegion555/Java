import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Calcula"})
public class Calcula extends HttpServlet {

    private String nombre=null;
    private String direccion=null;
    private String telefono=null;
    private int dias=0;
    private double pago=0;
    private double total;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        nombre=request.getParameter("nombre");
        direccion=request.getParameter("direccion");
        telefono=request.getParameter("telefono");
        dias=Integer.parseInt(request.getParameter("dias"));
        pago=Double.parseDouble(request.getParameter("sueldo"));
        total=dias*pago;
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calcula</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p><b>Nombre : </b>"+nombre+"</p>");
            out.println("<p><b>Direccion : </b>"+direccion+"</p>");
            out.println("<p><b>Teléfono : </b>"+telefono+"</p>");
            out.println("<p><b>Dias trabajados : </b>"+dias+"</p>");
            out.println("<p><b>Pago por el día : </b>"+pago+"</p>");
            out.println("<p><b>Total pagado al trabajador : </b>"+total+"</p>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import calculos.CalculoCDC;
import java.io.IOException;
import java.util.Vector;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CalculoCdcVO;

/**
 *
 * @author Usuario
 */
public class ServletCalculoCdc extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        double capital = Double.parseDouble(request.getParameter("labelCapital"));
        double juros = Double.parseDouble(request.getParameter("labelJuros"));
        int parcelas = Integer.parseInt(request.getParameter("labelParcelas"));
        Vector<CalculoCdcVO> vet = new Vector();
        CalculoCDC calc = new CalculoCDC();
        vet = calc.calcularJurosCompostosMes(capital, juros, parcelas);
        RequestDispatcher view =  null;
        view = request.getRequestDispatcher("paginas/calculoCDC.jsp");
        view.forward(request, response);
    } 

    // <editor-fold defaultstate="collapsed" desc="Métodos HttpServlet. Clique no sinal de + à esquerda para editar o código.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

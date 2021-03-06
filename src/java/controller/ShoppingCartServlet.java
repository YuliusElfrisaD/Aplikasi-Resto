/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ShoppingCart;

/**
 *
 * @author user
 */
@WebServlet(name = "shoppingCartServlet", urlPatterns = {"/shoppingCartServlet"})
public class ShoppingCartServlet extends HttpServlet {

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

        HttpSession session = request.getSession();
        String kode = request.getParameter("buy");
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        if (session.getAttribute("user") != null) {
            String nama = null, harga = null;
            ArrayList<ShoppingCart> keranjang = (ArrayList<ShoppingCart>) session.getAttribute("shoppingCart");

            if (keranjang == null) {
                keranjang = new ArrayList<ShoppingCart>();
            }

            ShoppingCart bag = new ShoppingCart(kode);
            
            try {
                DatabaseControl dbConn = new DatabaseControl();
                conn = dbConn.getConnection();
                ps = conn.prepareStatement("SELECT * FROM MAKANAN where IDMAKANAN = ?");
                ps.setString(1, kode);
                rs = ps.executeQuery();
                while (rs.next()) {
                    nama = rs.getString(2);
                    harga = rs.getString(3);
                }

                bag.setNama(nama);
                bag.setHarga(harga);

                keranjang.add(bag);
                session.setAttribute("shoppingCart", keranjang);

                RequestDispatcher rd = request.getRequestDispatcher("shoppingCart.jsp");
                rd.forward(request, response);

            } catch (SQLException ex) {
                Logger.getLogger(DatabaseControl.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    rs.close();
                    ps.close();
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShoppingCartServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("loginForm.jsp");
            rd.forward(request, response);
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

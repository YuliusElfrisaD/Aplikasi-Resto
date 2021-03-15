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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.Message;

/**
 *
 * @author user
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String id = null;
        String user = null;
        String pswd = null;
        String nama = null;

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            DatabaseControl dbConn = new DatabaseControl();
            conn = dbConn.getConnection();

            ps = conn.prepareStatement("SELECT * FROM CUSTOMERIMK WHERE USERNAME = ? UNION SELECT * FROM KASIR WHERE USERNAME = ?");
            ps.setString(1, username);
            ps.setString(2, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getString(1);
                nama = rs.getString(2);
                user = rs.getString(3);
                pswd = rs.getString(4);
            }

            RequestDispatcher rd = null;
            if (username.equals(user) && password.equals(pswd)) {
                Customer usr = new Customer(username, password);
                request.setAttribute("user", usr);
                HttpSession session = request.getSession();
                session.setAttribute("user", nama);
                
                if (id.substring(0, 3).equals("KAS")) {
                    rd = request.getRequestDispatcher("staffGui.jsp");
                }else{
                    rd = request.getRequestDispatcher("index.jsp");                    
                }

                
            } else {
                rd = request.getRequestDispatcher("loginForm.jsp");
                Message msg = new Message("Maaf, username atau password tidak valid!");
                request.setAttribute("Message", msg);
            }
            rd.forward(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseControl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
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

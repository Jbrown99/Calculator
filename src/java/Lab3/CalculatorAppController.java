/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joshuabrown
 */
@WebServlet(name = "CalculatorAppController", urlPatterns = {"/CalculatorAppController"})
public class CalculatorAppController extends HttpServlet {

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
        
            
            String calcType = request.getParameter("calculator");
            
        if(calcType.equals("rectangle")){
                
           try(PrintWriter out = response.getWriter()){     
           String length = request.getParameter("length");
           String width = request.getParameter("width");
           
           CalculatorAppService areaCalc = new CalculatorAppService();
           String responseMsg = areaCalc.areaOfRectangle(length, width);
           
           request.setAttribute("rectangleMsg", responseMsg);
            
           RequestDispatcher view =
                    request.getRequestDispatcher("/LabThreeIndex.jsp");
            view.forward(request,response);
           
            
            } catch(Exception e){
            request.setAttribute("errorMsg", e.getMessage());
            }
           
        }else if(calcType.equals("circle")){
            
            try(PrintWriter out= response.getWriter()){    
           String radius = request.getParameter("radius");
           CalculatorAppService areaCalc = new CalculatorAppService();
           String responseMsg = areaCalc.areaOfCircle(radius);
           
           request.setAttribute("circleMsg", responseMsg);
            
           RequestDispatcher view =
                    request.getRequestDispatcher("/LabThreeIndex.jsp");
            view.forward(request,response);
           
            
            } catch(Exception e){
            request.setAttribute("errorMsg", e.getMessage());
            }
           
           
                
        }else if (calcType.equals("triangle")){
            
            
            try(PrintWriter out = response.getWriter()){    
              String height = request.getParameter("height");
              String base = request.getParameter("base");
              CalculatorAppService areaCalc = new CalculatorAppService();
              String responseMsg = areaCalc.areaOfTriangle(base, height);
              
              request.setAttribute("triangleMsg", responseMsg);
            
           RequestDispatcher view =
                    request.getRequestDispatcher("/LabThreeIndex.jsp");
            view.forward(request,response);
           
            
            } catch(Exception e){
            request.setAttribute("errorMsg", e.getMessage());
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

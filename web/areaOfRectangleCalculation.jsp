<%-- 
    Document   : areaOfRectangleCalculation
    Created on : Jan 31, 2016, 5:48:48 PM
    Author     : joshuabrown
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculation Result</title>
    </head>
    <body>
        
        
        <p>The area of the rectangle is:
        <%
                
                
              Object responseObj = request.getAttribute("myMsg");
              Object errObj = request.getAttribute("errorMsg");
              
                if(responseObj != null){
                    out.println(responseObj.toString());
                }

                if(errObj != null){
                    out.println(errObj.toString());
                }
                 
        %>   
        </p>
    </body>
</html>

<%-- 
    Document   : LabTwoIndex
    Created on : Jan 31, 2016, 6:11:08 PM
    Author     : joshuabrown
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculation App</title>
    </head>
    <body>
         <h1>Calculate Area Of Rectangle</h1>
        
        <form method ="POST" action="RectangleCalculatorController">
            <label>Enter Length</label>
            <input type="text" name="length" value=""/>
            <label>Enter Width</label>
            <input type="text" name="width" value=""/>
            <input type="submit" name="submit" value="Calculate Area"/>
            
            
            <p> The Area of the Rectangle is:  
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

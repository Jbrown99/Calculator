<%-- 
    Document   : LabThreeIndex
    Created on : Jan 31, 2016, 6:31:29 PM
    Author     : joshuabrown
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CalculatorAppStyling.css">
        <title>Calculator App</title>
    </head>
    <body>
        
        
        
        <h1>Calculate Area Of Rectangle</h1>
        
        <form id="recCalc" name="recCalc" method ="POST" action="CalculatorAppController?calculator=rectangle">
            <label>Enter Length</label>
            <input type="text" name="length" value=""/>
            <label>Enter Width</label>
            <input type="text" name="width" value=""/>
            <input type="submit" name="submit" value="Calculate Area"/>
            
            
            <p> The Area of the Rectangle is:  
        <%
                
                
              Object responseObj = request.getAttribute("rectangleMsg");
              Object errObj = request.getAttribute("errorMsg");
              
                if(responseObj != null){
                    out.println(responseObj.toString());
                }

                if(errObj != null){
                    out.println(errObj.toString());
                }
              
        %>   
            </p>
            
        </form>
            
          
       <h1>Calculate the area of a Circle</h1>
        
        <form id="circCalc" name="circCalc" method ="POST" action="CalculatorAppController?calculator=circle">
            <label>Enter the Radius</label>
            <input type="text" name="radius" value=""/>
            <input type="submit" name="submit" value="Calculate Area"/>
            
            
            <p> The Area of the Circle is:  
        <%
           
                
        %>   
            </p>
            
        </form>
            
            
        <h1>Calculate the area of a Triangle</h1>
        
        <form id="triCalc" name="triCalc" method ="POST" action="CalculatorAppController?calculator=triangle">
            <label>Enter the Base</label>
            <input type="text" name="base" value=""/>
            <label>Enter the Height</label>
            <input type="text" name="height" value=""/>
            <input type="submit" name="submit" value="Calculate Area"/>
            
            
            <p> The Area of a Triangle is:  
        <%
                
               
             
              
              
        %>   
            </p>
            
        </form>    
                 
            
        
    </body>
</html>

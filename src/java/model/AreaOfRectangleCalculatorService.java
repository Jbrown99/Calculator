/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author joshuabrown
 */
public class AreaOfRectangleCalculatorService {
    
    public String areaOfRectangle(String length, String width){
        
        int rectangleLength = Integer.parseInt(length);
        int rectangleWidth = Integer.parseInt(width);
        
        int calculation = rectangleLength * rectangleWidth;
        
        String finalCalculation = Integer.toString(calculation);
        
        return finalCalculation;
        
        
    }
    
}

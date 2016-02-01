
package Lab3;



/**
 *
 * @author joshuabrown
 */
public class CalculatorAppService {
    
    public static final double pi = 3.14159265359;
    
    public String areaOfRectangle(String length, String width){
        
        int rectangleLength = Integer.parseInt(length);
        int rectangleWidth = Integer.parseInt(width);
        
        int calculation = rectangleLength * rectangleWidth;
        
        String finalCalculation = Integer.toString(calculation);
        
        return finalCalculation;
        
        
    }
    
    public String areaOfCircle(String radius){
        
        double circleRadius = Double.parseDouble(radius);
        
        double calculation = pi*(circleRadius * circleRadius);
        
        String finalCalculation = Double.toString(calculation);
        
        return finalCalculation;

        
    }
    
    public String areaOfTriangle(String base, String height){
        
        int triangleHeight = Integer.parseInt(height);
        int triangleBase = Integer.parseInt(base);
        
        int calculation = (triangleBase * triangleHeight)/2;
        
        String finalCalculation = Integer.toString(calculation);
        
        return finalCalculation;
        
    }
    
}

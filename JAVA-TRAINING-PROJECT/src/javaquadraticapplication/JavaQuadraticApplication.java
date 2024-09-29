package javaquadraticapplication;

/**
 *
 * @author Abdallah Yussif
 */
public class JavaQuadraticApplication {

    //Trying to generate the formular and see if it works
    
    public static void main(String[] args) {
        double A = 2;
        double B = 4;
        double C = 2;
        
        double subResult = ((B*B)- 4*A*C);
        double squareRoot = Math.sqrt(subResult);
        double finalResult = (-B + squareRoot) / (2*A);
        System.out.println(finalResult);
        
    }
    
}

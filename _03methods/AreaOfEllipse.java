package _03methods;

public class AreaOfEllipse {

 
     
    public static void calculateAndPrintEllipseArea() {
        
        double semiMajorAxis = 10.0;
        double semiMinorAxis = 5.0;

       
        double area = Math.PI * semiMajorAxis * semiMinorAxis;

       
        System.out.println("The area of the ellipse is: " + area);
    }

    public static void main(String[] args) {
        
        calculateAndPrintEllipseArea();
    }
}
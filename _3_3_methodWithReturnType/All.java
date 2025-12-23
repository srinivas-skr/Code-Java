package _3_3_methodWithReturnType;

public class All {

    // For Rectangle: The length and width are hard-coded inside.
    public static double getPredefinedRectangleArea() {
        double length = 12.0; // Fixed value
        double width = 5.0;  // Fixed value
        return length * width;
    }

    
    public static double getPredefinedTriangleArea() {
        double base = 8.0;  
        double height = 6.0; 
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        
        double rectangleArea = getPredefinedRectangleArea();
        System.out.println("The area of the predefined rectangle is: " + rectangleArea);

       

        // This method always returns the area of an 8x6 triangle.
        double triangleArea = getPredefinedTriangleArea();
        System.out.println("The area of the predefined triangle is: " + triangleArea);
    }
}
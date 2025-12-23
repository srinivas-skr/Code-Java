package _3_2_MethodWithParameter;

public class All {

    // 1. For Square
    public static void printSquareArea(double side) {
        double area = side * side;
        System.out.println("The area of the square is: " + area);
    }

    // 2. For Rectangle
    public static void printRectangleArea(double length, double width) {
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }

    // 3. For Triangle
    public static void printTriangleArea(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
    }

    // 4. For Circle
    public static void printCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
    
    public static void main(String[] args) {
        
        printSquareArea(5.0);
        printRectangleArea(10.0, 4.0);
        printCircleArea(3.5);
        printTriangleArea(45.6,34); //type promotion java does but not value promotion 
    }
}


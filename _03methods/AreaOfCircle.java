package _03methods;

class AreaOfCircle {
    
    
    public static void circle() {
        double pi = 3.14159;
        double radius = 7;
        double area = pi * radius * radius;
        System.out.println("The area of the Circle is: " + area);
    }

    public static void main(String[] args) {
        circle(); 
        circle();  // Calling the static method
    }
}

package _03methods;

class AreaOfTriangle {

    // Static method to calculate area
    public static void triangle() {
        double base = 10;
        double height = 5;
        double area = 0.5 * base * height;
        System.out.println("The area of the Triangle is: " + area);
    }

    public static void main(String[] args) {
        triangle(); // Calling the static method
    }
}
package _03methods;

class AreaOfSquare {

    // Static method to calculate area
    public static void square() {
        int side = 5;
        int area = side * side;
        System.out.println("The area of the Square is: " + area);
    }

    public static void main(String[] args) {
        square(); // Calling the static method
    }
}
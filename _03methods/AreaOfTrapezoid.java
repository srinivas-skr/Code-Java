package _03methods;

class AreaOfTrapezoid {

    
    public static void trapezoid() {
        double base1 = 5; // top parallel side
        double base2 = 9; // bottom parallel side
        double height = 4;
        double area = 0.5 * (base1 + base2) * height;
        System.out.println("The area of the Trapezoid is: " + area);
    }

    public static void main(String[] args) {
        trapezoid(); // Calling the static method
    }
}
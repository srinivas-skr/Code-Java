package _03methods;

class AreaOfRectangle {

    // Static method to calculate area
    public static void rectangle() {
        int width = 7;
        int height = 4;
        int area = width * height;
        System.out.println("The area of the Rectangle is: " + area);
    }

    public static void main(String[] args) {
        rectangle(); // Calling the static method
    }
}
package _03methods;

class AreaOfParallelogram {

    // Static method 
    public static void parallelogram() {
        double base = 6;
        double height = 8;
        double area = base * height;
        System.out.println("The area of the Parallelogram is: " + area);
    }

    public static void main(String[] args) {
        parallelogram(); // Calling the static method
    }
}



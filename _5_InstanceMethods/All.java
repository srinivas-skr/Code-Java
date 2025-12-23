package _5_InstanceMethods;


class All {

    // 1. Circle Area
    void area() {
        int r = 5;
        final double PI = 3.142;
        double res = PI * r * r;
        System.out.println("Circle Area: " + res);
    }

    // 2. Triangle Area
    void triangle() {
        int b = 50;
        int h = 25;
        double res = 0.5 * b * h;
        System.out.println("Triangle Area: " + res);
    }

    // 3. Rectangle Area
    int rect() {
        int w = 10;
        int h = 20;
        return w * h;
    }


    // 4. Square Area
    void Square(int a) {
        int res = a * a;
        System.out.println("Square Area: " + res);
    }


    
    public static void main(String[] args) {
        new All().area(); //NEW keyword special operator create  memory space in heap memory 
        new All().triangle(); //and Constructor initialize All non static members into heap memory 
        System.out.println(new All().rect());
        new All().Square(5);
       
        // For each call, a NEW object is created in the Heap memory  
//obj becomes eligible for garbage collection when no reference variable pointing to it jvm memory (after its execution )
        
        
        //When we dont need object for further use and use it  just for one time 
       // we create  object without refernce variables
        
    }
}
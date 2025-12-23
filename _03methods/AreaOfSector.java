package _03methods;

class AreaOfSector {

    static void sector() {
        double radius = 10;
        double angleInRadians = 1.2; // The angle MUST be in radians for this formula
        
        double area = 0.5 * radius * radius * angleInRadians;
        
        System.out.println("The area of the Sector is: " + area +" For this radius Value used is "+radius +" And angleInRadians value used is " +angleInRadians);
    }
    
    

    public static void main(String[] args) {
        sector();
    }
}
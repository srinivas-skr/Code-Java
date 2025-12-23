package _6_ReferenceVariable;

public class Student {

    int javamock; 

    static String instituteName = "Jspiders"; // // Static variable: There is only ONE copy of this for the entire class.// It is shared by all student objects.

    public static void main(String[] args) {
        System.out.println("Institute Name is: " + Student.instituteName);

        // Create the first object for Geetha.
        Student std1 = new Student(); 
        // Set the mock rating ONLY for this object. BECAUSE every object represent real world data of specific one thing only 
        std1.javamock = 1; 
        System.out.println("Geetha's mock rating is: " + std1.javamock);

        Student std2 = new Student();
        std2.javamock = 2; 
        System.out.println("sanju mock rating " + std2.javamock);


        std2.javamock = 1; 
        System.out.println("Sanju's Remock rating is: " + std2.javamock +
         " ---- Gettha mock rating is " +std1.javamock );
    }
}
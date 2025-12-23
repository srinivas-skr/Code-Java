package _01Variables;

public class Printing {

	public static void main(String[] args) {
		      
       char section='A';
       char c ='$';
       
       String s ="lcd";
       
       short sh= 32767;
       byte by = 127;
       
       int i = 701999482;
       long l =7019994821l;
       
       long ll =12-34l; // it does normal calculation here
       
       int ii = 12 -5;
       System.out.println();
       System.out.println("TRICKY JVM " +ll+" "+ii+" ");
       
       float f=1.1234567f;
       double d =1.123456789012345d;
       double dd =1.123456789012345678900000000000000000000d; 
       
       boolean b =true;
       boolean bb =false;
       
       
       
       
System.out.println("The TV Brand of my friend is "+s +" and has rating "+section    + "    ----->  In Real world char is used for user's initial ");

       
System.out.println();
System.out.println("when you know the range is small and want to save memory we go for this "+by+ "\n");

System.out.println("The monthly mess food is " +sh + "   -----> When u want to save memeory we go for this \n");




System.out.println("when we dont want to waste memory and less precision is enough like graphics in video games we go for float"+" " + f);
System.out.println();
System.out.println("When we need to calculate financial calculations,++ We use " +d+"--->can write upto 30 digit  "+dd+" but variable will not hold and \n jvm will round it up for 16th digit and value becomes inaccurate ");
System.out.println();

System.out.println("used for yes or no qp like ---->  "+"isUserLogined: "+b+" isUserAdmin: "+bb);


System.out.println("WHen we need to use very large WHOLE NUMBER WE GO FOR LONG  EXAMPLE:POPULATION COUNT OR PHONE NUMBERS  "+l);



    }


}

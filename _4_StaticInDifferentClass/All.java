package _4_StaticInDifferentClass;

 class All {
	 
	    public static void fun() {
	        double w = 8.0;
	        double h = 5.0;
	        double area = w * h;
	        System.out.println("Rectangle Area: " + area);
	    }


	    public static void fun(double w, double h) {
	        double area = w * h;
	        System.out.println("Rectangle Area: " + area);
	    }
	    
	
	    public static double meth() {
	        double base = 10.0;
	        double hght = 5.0;
	        return  0.5 * base * hght;
	       // return  System.out.println("Triangle Area: " + area);  <---- BEACAUSE WE SOP IS PRINTING NOT HOLDING THE VALUE TO RETURN MEANS VOID <--- USE VOID RETURN 
	    }
}


	class Run {
	    public static void main(String[] args) {
	       All.fun(8.0, 5.0);
	       All.fun();
	       System.out.println(All.meth());
	    }
	}
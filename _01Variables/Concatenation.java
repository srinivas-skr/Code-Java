package _01Variables;

public class Concatenation {

	public static void main(String[] args) {
		
		

			    
			System.out.println("WE HAVE 5 TYPES OF LITERALS ");

			System.out.println(20-420);
			
			System.out.println(1L+1l);
			
			System.out.println(20.5f+20);
			System.out.println(20.9+20); //NO AUTO VAlUE TYPE PrOMOTION AS JAVA IS DESIAGNED BASED ON REAL WORLD USE CASE
			
			System.out.println(40.4D+40.4d);
			
			
			
			System.out.println("Special Rule of java for STRING Concateination");
			
			System.out.println("The value is "+20+20);  /* JVM preference runs from left to right */
			System.out.println(20+ "is the value");
			System.out.println(20+20+"is the value"); /*operation then glue with string   */
			System.out.println("The value is"+ (20+20));
			
			System.out.println(true); //type of literal
			System.out.println(true && false);// refer the AND table 
			System.out.println(false && false);
			System.out.println(true && true);
			System.out.println(false && true );

			System.out.println(true || false);
			System.out.println(true||true);
			System.out.println(false||false);


			System.out.println("say me  " + (true | false) +" love");
			System.out.println("say me "+(true & false)+ " Love");

			System.out.println("Special Rule for char Unicode"); 
			System.out.println('j' +'a' + 'v'+'a');
			System.out.println('J'+'A'+'V'+'A');
			System.out.println("" + 'J'+'A'+'V'+'A');
			
			System.out.println("EVERY SYMBOL HAS UNICODE VALUE");
			System.out.println('+');
			System.out.println('+'+'-');
			
			
	}

}

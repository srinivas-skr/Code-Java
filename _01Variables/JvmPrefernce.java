package _01Variables;

public class JvmPrefernce {

	public static void main(String[] args) {
		
	        int a=90;
	        System.out.println(a); //jvm works top to bottom 
	        a =70;
	        System.out.println(a); 


	        int b=100; //reassigning
	        int bb=b;
	        System.out.println(bb+"\n");


	         int c =50;
	       int d,e,f,g;
	int z=d=e=f=g=c; //another way of doing the assignement with declartion 
	b=z=a;  // jvm works right to left
	
System.out.println("VALUE OF C IS 50\n BUT STILL SEE Z  ");
	       System.out.println(z+" "+d+" "+c);
	    }
	}



package _6_ReferenceVariable;

public class All {

	int a;
	public static void main(String[] args) {
		All ref1 = new All(); // First obj unique address
		
		All ref2 =new All(); //2nd obj unique address    <--- So only OBJECT IS MULTIPLE COPY 
		
		All ref3 = ref2; // YOU ARE CREATING REFERNCE VARIABLE BUT POINTING TO ALREADY CREATED OBJECT NOT UNIQUE
		
		System.out.println(ref2+"\n"+ref1+"\n"+ref3); //Fully qualified path 8 digit hexadecimal
		
System.out.println(ref1.a); //Multi copy
System.out.println(ref1.a=90);
	}

}

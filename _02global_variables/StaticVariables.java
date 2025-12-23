package _02global_variables;


class StaticVariables {
static int a;
// U can initialize global variables while declaring in first line only and once in class body , NOT IN NEXT LINE 
//a=0;   <----- not allowed
//a =90; <------ re assigning also not allowed 

	public static void main(String[] args) {
	
		System.out.println(a);
		a=90; //Reassigning is allowed in method or block or constructor only BUT NOT BEST PRACTICSE;
System.out.println(a);

	}

}

class b{
	// Scope is end of the class only but also depends on ACCESS SPECIFIER 
	
	// StaticVariables.a=00; <--- Rules just 1 line declaration in any classBody  allowed
	
	{
		StaticVariables.a=900; //outside the class due to ACCESS SPECIFIER
		
	}
	
}

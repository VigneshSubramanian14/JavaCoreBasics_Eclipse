package JavaBasic;

public class IfElseConcept {

	public static void main(String[] args) {
	
		int a=10;
		int b=100;
		
	    if (a>b) {  //Inside the if condition there is an boolean condition
	    	System.out.println("Print the value of a:"+10);
	    }
	    	else {
	    		System.out.println("Print the value of b:"+100);
	    		
	    		//Comparision opertators : < > <= >= == !=
	    }

	    double c=10;
	    double d=10;
	    if (c>=d) {
	    	System.out.println("Print the value of D");
	    }
	    else {
	    	System.out.println("Print the value of E");
	    }
        //If you want to satisfy the If condition both the condition must be true
	    // true & true = Condition satisfied
	   // true & false = Condition not satisfied
	   // false & false = Condition not satisfied
	    
	    int x=100;
	    int y=200;
	    int z=150;
	    if (x>y & x>z) {
	   //false & false = condition not satisfied
	    	System.out.println("print the value of x");
	    }
	    else if(y>z) {//true = condition satisfied 
	    	System.out.println("Print the value of y");
	    }
	    else {
	    	System.out.println("print the value of z");
	    }
	    
	    
	    
	}
	
	
	

}

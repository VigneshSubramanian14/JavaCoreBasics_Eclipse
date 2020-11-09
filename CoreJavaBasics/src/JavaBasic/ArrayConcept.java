package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
		//Array-To store similar data type values in array variable
		
		//[] -> One dimensional array
		
		//Disadvantage of Array
		//1. Size is fixed : if we declare int[5] we can only store 5 values
		//2. It will accept only one data-type : when we declare with int it can only take int values
		//                                       when we declare with double it can only take double values . When you pass char value it will throw error
		
		int i[]=new int[5]; //5 is the size of the array i.e we can store value from 0 to 4
		//lowest bound is 0
		//highest bound is n-1 (where n is the size of the array)
		
	     i[0]=20;
	     i[1]=50;
	     i[2]=70;
	     i[3]=23;
	     i[4]=90;
	     
	     
	     System.out.println(i[0]);
	     
	     System.out.println("**********");
	    
	     System.out.println(i[2]+i[4]);
	     
	     System.out.println("**********");
	     
	     System.out.println(i[4]-i[0]);
	     
	     System.out.println("**********");
	     
	     System.out.println(i[3]-i[4]);

	     System.out.println("**********");
	     
	    // System.out.println(i[5]); // This will throw ArrayIndexOutOfBoundsException error since the size it 4
	     
	     //To find the size of array use length method
	     
	     System.out.println(i.length); // The size which was declared at first
	     
	     System.out.println("***********");
	     
	     //To print all the values in array use loop concept : Understand this is important
	     
	     for(int j=0;j<5;j++) {
	    	 System.out.println(i[j]);
	    	 
	    	 System.out.println("**********");
	     } 
	     
	     
	     double d[] = new double[4];
	    	 d[0]=89.78;
	    	 d[1]=34.56;
	    	 d[2]=45.89;
	    	 d[3]=67.67;
	    	 
	     System.out.println(d[0]);
	     
	     System.out.println("************");
	     
	    for(int e=3;e>=0;e--) {
	    	System.out.println(d[e]);
	    }
	}

}

package JavaBasic; // This is an statement

public class DataTypes {

	// Data type must start with small letters
	// Class must start with capital letters
	// *** String is a class not data type ***
	// Primitive datatype : int,double,char,boolean
	// In Sysout - System is a class and println is a method
	// println means print in new line ; print means print on same line
	
	public static void main(String[] args) {
		//1.int - Integer Number
		
		int i=10; // Statement always ends with ;
		i=20;
		i=40;
		i= 90;
		int j=20;
		System.out.println(i+j);
		
		//2.double - Decimal Number
		
		double a=13.66;
		double b=17.22;
		b=17; //100 is taken as 100.00
		System.out.println(b);
		
		//3.Char - Letter , Number , Symbol
		
		char x='a';
		char y='b';
		y='b';
		System.out.println(x);
		
		//4.String - It is call not a data type ; Anything within double quotes
		
		String p="Today is monday";
		p="Today is thursday";
		String r="Tommorow is wendesday";
		System.out.println(p+r);
		
		//5.Boolean - Only true and false condition
		boolean b1=true;   //it is both values and keywords
		boolean a1=false;  //it is both values and keywords
		System.out.println(b1);
	}

}

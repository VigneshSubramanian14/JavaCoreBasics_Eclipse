package JavaBasic;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) 
	{
	    //Post Increment
		
		int i=1;
		int j=i++;
		
		//1. it will pass the value of i to j
		//2. Then it will increment
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("***************");
		
		//Pre-Increment
		
		int a=2;
		int b=++a;
		
		//1. it will first increment the value and pass to b
		//2. it will give the updated value to a 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("*****************");
		
		//Post Decrement
		
		int x=9;
		int y=x--;
		
		//1. it will first take the value of x to y
		//2. then it will decrement the value and pass to x
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("*****************");
		
		//Pre-Decrement
		
		int m=6;
		int n=--m;
		
		//1. it will first decrement the value and pass to n
		//2. the updated value will pass to m
		
		System.out.println(m);
		System.out.println(n);
		
		
		
		
	}

}

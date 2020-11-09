package JavaBasic;

public class LoopingConcept {

	public static void main(String[] args) {
		//while concept:
		int i=1; //initialization
		while(i<10) { // condition
			System.out.println(i); // 1
			i=i+1; //increment or decrement
			// Infinite loop will generate if you don't give incremental/decremental part is the disadvantage
		}

		//for loop
		System.out.println("****************");
		for(int j=1;j<=9;j++) // initialization,condition,incremental/decrement all in same line 
			//j++ means j=j+1
		{
			System.out.println(j); // 2 
		}
		//Decrement program
		System.out.println("*****************");
		for(int k = 10;k>=2;k--) {
			System.out.println(k);  // 3 
		}
	}

}

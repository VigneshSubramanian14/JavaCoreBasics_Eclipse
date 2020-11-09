package JavaBasic;

public class ObjectArray {

	public static void main(String[] args) {
	//Disadvt of Array: It stores only similar datatypes: To overcome this issue we use object Array
	
	// Object Array - (Object is a Super Class) - It is used to store different data-type values
		
		Object a[] = new Object[5];
		a[0]="SNO";
		a[1]='1';
		a[2]="Vignesh";
		a[3]=1995;
		a[4]="Villupuram";
		
		for(int i=4;i>=0;i--) {
			System.out.println(a[i]);
		}
		

	}

}

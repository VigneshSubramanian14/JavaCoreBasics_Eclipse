package JavaBasic;

public class StringConcatenation {

	public static void main(String[] args) {
	int a=100;
	int b=50;
	int c=200;
    String x="Hello";
    String y="Vignesh";
    
    System.out.println(a+b); //150
    System.out.println(x+y); //HelloVignesh
    System.out.println(a+b+x+y); //150HelloVignesh
    System.out.println(x+y+a+b); //HelloVignesh10050
    System.out.println(x+y+(a+b)); //HelloVignesh150
    System.out.println(x+a+y+b); //Hello100Vignesh50
    System.out.println(a+x+b+y); //100Hello50vignesh
    System.out.println("Print the value");
    System.out.println("Print the value of a:"+a);
    System.out.println("The addition of a and c is:"+(a+c)); //see the output
    System.out.println("The addition of a and c is:"+a+c); //see the output
    System.out.println("Hello Selenium");
    System.out.println("How are you");    //println means new line
    
    System.out.print("HelloSelenium");
    System.out.print("How are you"); //print means print on same line
    

	}

}

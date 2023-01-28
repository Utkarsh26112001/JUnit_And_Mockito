//Find the largest of the 3 numbers.
package demo_maven_cmd;
import java.util.Scanner;

public class Problem1 {
	public static void main(String [] args) 
	{
		Problem1 prob1= new Problem1();
		prob1.max3();				
	}
	public void max3()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number::");
		 int A= sc.nextInt();
		 System.out.print("Enter the Second Number::");
		 int B =sc.nextInt();
		 System.out.print("Enter the Third Number::");
		 int C =sc.nextInt();
		 sc.close();
		 if(A>B && A>C)
		 {
			 System.out.println("The largest No is::" + A);
		 }
		 if(B>A && B>C)
		 {
			 System.out.println("The largest No is::" + B);
		 }
		 if(C>A && C>B)
		 {
			 System.out.println("The largest No is::" + C);
		 }
		  
	}


}

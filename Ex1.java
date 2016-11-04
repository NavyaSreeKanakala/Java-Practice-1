/* Fibonnaci series */


package niit;
import java.util.Scanner;
public class Ex1 {
	public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any two numbers");
		 int a=sc.nextInt();
		 int b=sc.nextInt(); 
		 System.out.println("Enter the length of series:");
		 int l=sc.nextInt();
		 int c;
		 for(int i=0;i<l;i++)
		 {
			 c=a+b; 
			 System.out.println(c);
			 a=b;
			 b=c;

		 }
		 
		 

	}
}

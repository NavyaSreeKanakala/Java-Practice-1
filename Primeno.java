package niit;
import java.util.Scanner;
public class Primeno {
	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no till which the prime nos to be printed");
		int num = sc.nextInt();

	  for (int i = 1; i <= num; i++)
	  {
	   int count = 0;
	   for (int j = 2; j <= i / 2; j++) 
	   {
	    if (i % j == 0) 
	    {
	     count++;
	     break;
	    }
	   }

	   if (count == 0) 
	   {
	    System.out.println(i);
	   }
	 }
	  
}
}

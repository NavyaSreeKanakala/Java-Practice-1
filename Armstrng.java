package niit;
import java.util.Scanner;
import java.lang.*;
public class Armstrng {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int sum=0,r,a;
	double b[]=new double[10];
	double i=0;
	a=n;
	while(n!=0)
	{
		r=n%10;
		n=n/10;
		b[(int) i]=r;
		i++;
	}
	for(int j=0;j<i;j++)
	{
		sum+=Math.pow(b[j],i);
	}
	if(sum==a)
	{
		System.out.println("The number is armstrong");
	}
	else
	{
		System.out.println("The number is not an armstrong");
	}

	
}

private static int pow(double d, double i) {
	// TODO Auto-generated method stub
	return 0;
}
}

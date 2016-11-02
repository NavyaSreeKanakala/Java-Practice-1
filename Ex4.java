package niit;

public class Ex4 {
	
	    public static void main(String args[]){  
		String s1="navya";  
		String s2="kumar";  
		String s3="navya";
		String s4="gooDmoRNIng";
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));  
		
		System.out.println(s1.substring(2));
		System.out.println(s2.substring(2,4));
		
		s4=s4.toLowerCase();  
		System.out.println(s4);  
		
		s2=s2.toUpperCase();
		System.out.println(s2);
		
		String s5="  big data   ";  
		System.out.println(s5+"by niit");  
		System.out.println(s5.trim()+"by niit");
		
		System.out.println(s1.contains("vya"));

	}
	}


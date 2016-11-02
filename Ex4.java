package niit;

public class Ex4 {
	public static void main(String args[]){
	StringBuffer s=new StringBuffer("Hello ");  
	s.append("world"); 
	System.out.println(s); 
	
	StringBuilder s1=new StringBuilder("Hello ");  
	s1.append("world"); 
	System.out.println(s1); 
	
	
	String s2="hi";  
	s2.concat("this is navya");  
	System.out.println(s2);  
	s2=s2.concat("hi....this is navya");  
	System.out.println(s2);
	
}
}

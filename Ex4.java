package niit;

public class Ex4 {
	
	    String s1="java",s2="programming",s3="";
	    int l=s1.length(),m=s2.length(),i,j;
	    public String conca(String s1,String s2){
	        for(i=0;i<=l-1;i++){
	            s3+=s1.charAt(i);
	        }
	        for(j=0;j<=m-1;j++){
	            s3+=s2.charAt(j);
	        }
	        System.out.println(s3);
	return s3;
	    }
	    public static void main(String[] args) {

	        Ex4 obj1=new Ex4();
	        obj1.conca("java","programming");

	}
	}


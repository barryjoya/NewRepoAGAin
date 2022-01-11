import java.util.Scanner;

public class SDETF {

	
	
	static {
		System.out.println("Hello World");
		
        String str = "baryalai";
	 
        char[] ch = str.toCharArray();
       // System.out.println(ch);
        String str2 = "";
        
        for (int i = 0; i < ch.length; i++) {
			
			if(ch[i] !=' ') {
				str2 += ch[i];
			}
		}
        System.out.println(str2);
	//	System.out.println(str.replaceAll(" ", ""));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("yahoo");

		//transient int a;
		System.gc();
		System.out.println("enter a number"); 
		Scanner sc = new Scanner(System.in); 
		int num=sc.nextInt();
	
		boolean isPrime =true; 
		for(int i=2;i<num;i++) { 
			if(num%i==0) { 
				isPrime=false; 
			} 
			
			} if(isPrime) { 
				System.out.println("is a prime number"); 
					
				} else { System.out.println("not a prime number"); }
		num =sc.nextInt();
		
		
	}

}

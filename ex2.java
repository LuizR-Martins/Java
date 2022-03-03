package condicional;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int n1=54, n2=82, n3=47;
	
		
		if (n1> n2 && n2> n3) 
		{ System.out.println("a ordem correta é : " + n3 + n2 + n1);
			
		}
		if (n1> n3 && n3> n2) 
		{ System.out.println("a ordem correta é : "  + n2 + n3 + n1);
			
		}
		if (n2> n1 && n1> n3) 
		{ System.out.println("a ordem correta é : " + n3 + n1 + n2);
			
		}
		if (n2> n3 && n3> n1) 
		{ System.out.println("a ordem correta é : "  + n1 + n3 + n2);
			
		}
		if (n3> n1 && n1> n2) 
		{ System.out.println("a ordem correta é : " + n2 + n1 + n3);
			
		}
		if (n3> n2 && n2> n1) 
		{ System.out.println("a ordem correta é : " + n1 + n2 + n3);
			
		}
	

	}

}

package condicional;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int n1=54, n2=82, n3=47;
	
		
		if (n1> n2 && n2> n3) 
		{ System.out.println("a ordem correta � : " + n3 + n2 + n1);
			
		}
		if (n1> n3 && n3> n2) 
		{ System.out.println("a ordem correta � : "  + n2 + n3 + n1);
			
		}
		if (n2> n1 && n1> n3) 
		{ System.out.println("a ordem correta � : " + n3 + n1 + n2);
			
		}
		if (n2> n3 && n3> n1) 
		{ System.out.println("a ordem correta � : "  + n1 + n3 + n2);
			
		}
		if (n3> n1 && n1> n2) 
		{ System.out.println("a ordem correta � : " + n2 + n1 + n3);
			
		}
		if (n3> n2 && n2> n1) 
		{ System.out.println("a ordem correta � : " + n1 + n2 + n3);
			
		}
	

	}

}

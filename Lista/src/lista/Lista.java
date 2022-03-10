package lista;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {
	
	public static void main(String[] args) {
		
		String cerveja;
		String vodka;
		String whysky;
		String conhaque;
		String chevette;
		String cigarro;
		String seda;
		String tabaco;
		
		ArrayList<String>lista= new ArrayList();
		
		lista.add("cerveja"); //0
		lista.add("vodka"); //1
		lista.add("whysky"); //2
		lista.add("conhaque"); //3
		lista.add("chevette"); //4
		lista.add("cigarro"); //5
		lista.add("seda"); //6
		lista.add("tabaco"); //7
		
		Collections.sort(lista);
		
		System.out.println(lista);
		
		lista.remove(2);
		
		System.out.println(lista);

		lista.add(2, "tequila");
		
		System.out.println(lista);
	
		
		
	}


	

}

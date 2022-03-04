package repetição;

import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idad=0, contCal=0, contMner=0, contHagre=0, contOcal=0 , contNer40=0, contCal18=0, conTotal=2, cont=1;
		char sexo, opção, continua; 
		
		Scanner ler = new Scanner(System.in);
		
		while(cont<=conTotal) {
			System.out.println("insira sua idade ");
		idad= ler.nextInt();
		
		System.out.println("com qual genero você se identifica : 1-masculino, 2-feminino, 3-outro ");
		sexo= ler.next().charAt(0);
		
		System.out.println("como seu humor tem se manifestado ultimamente: 1-calmo, 2-nervoso, 3-agressivo ");
		opção= ler.next().charAt(0);
		
		if (opção== '1') {
			contCal++; }
		
		
		if(sexo=='2'&& opção=='2') {
			contMner++; }
		
		if (sexo=='1' && opção=='3') {
			contHagre++; }
	
		if (sexo=='3' && opção=='1') {
			contOcal++; }
		
		if (idad>=40 && opção=='2') {
			contNer40++; }
		
		if (idad<=18 && opção=='1') {
			contCal18++; }
		
		cont++;
		
		} System.out.println("Pessoas calmas: "+contCal);
        System.out.println("Mulheres Nervosas: "+contMner);
        System.out.println("Homens Agressivos: "+contHagre);
        System.out.println("Outros Calmos: "+contOcal);
        System.out.println("Pessoas nervosas com mais de 40 anos: "+contNer40);
        System.out.println("Pessoas Calmas com menos de 18 anos: "+contCal18);
        
		
			
		

	}

}

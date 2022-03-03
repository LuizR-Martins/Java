package condicional;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int n1=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("insira sua idade: ");
		n1= ler.nextInt();
		
		if(n1>=10 && n1<=14) {
			System.out.print("infantil" ); }
		
		if(n1>=15 && n1<=17) {
			System.out.print("juvenil" ); }
	
		if(n1>=18 && n1<=25) {
			System.out.print("adulto" ); }
		
		if(n1>25) {
			System.out.print(" Seu primo passou no concurso... e você?" ); }
		
		if(n1<10) {
			System.out.print("ALERTA DE CRIANÇA PERDIDA" ); }
		}
	

}

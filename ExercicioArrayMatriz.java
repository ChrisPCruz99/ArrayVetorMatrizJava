package DesenvolvimentoJava;

import java.util.Scanner;

public class ExercicioArrayMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num[][] ={{1,2,3},{4,5,6},{7,8,9}},linha,coluna,somaPrincipal=0,somaSecundaria=0;
		
		System.out.println("Elementos da Diagonal Principal: ");
		for(linha=0;linha<3;linha++){
			System.out.println(num[linha][linha]);
			somaPrincipal+=num[linha][3-1-linha];
		}
		System.out.println("Elementos da Diagonal Secundaria: ");
		for(linha=0;linha<3;linha++){
			System.out.println(num[linha][3-1-linha]);
			somaSecundaria+=num[linha][3-1-linha];
		}
		System.out.printf("\nSoma dos Elementos da Diagonal Principal: %d",somaPrincipal);
		System.out.printf("\nSoma dos Elementos da Diagonal Secundaria: %d",somaSecundaria);

	}

}

package DesenvolvimentoJava;

import java.util.Scanner;

public class ExercicioArrayVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[] = {2,5,1,3,4,9,7,8,10,6};
		int num;
		
		System.out.printf("\nDigite um numero: ");
		num=leia.nextInt();
			for(int x=0;x<10;x++){
			if(vet[x] == num){
				System.out.printf("\nNumero %d está localizado na posição %d",vet[x],x);
				break;
        	}
        	else if(x == 9)
        	System.out.printf("\n%d não foi encotrada ",num);
		}
	}
}

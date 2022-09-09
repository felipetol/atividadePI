package prova2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Insira o valor de índice: " + i + ": ");
			vetor[i] = sc.nextInt();
		}
		
		int maior = 0;
		int menor = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if(i == 0) {
				maior = vetor[i];
				menor = vetor[i];
			} else if (vetor[i] > maior) {
				maior = vetor[i];
			} else if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
		sc.close();
	}
}

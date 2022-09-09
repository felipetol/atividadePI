package prova2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a massa inicial em gramas: ");
        double massaInicial = sc.nextDouble();
        double massaFinal = massaInicial;
        int segundos = 0;
        
        while (massaFinal >= 0.5) {
            massaFinal /= 2;
            segundos += 50;
        }
        
        int tempo[] = new int[3];
        
        tempo[0] = segundos / 3600;
        segundos = segundos % 3600;
        tempo[1] = segundos / 60;
        tempo[2] = segundos % 60;

        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massaFinal);
        System.out.printf("Tempo: %d horas, %d minutos e %d segundos.", tempo[0], tempo[1], tempo[2]);
        
        sc.close();
    }
}

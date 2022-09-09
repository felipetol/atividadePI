package prova2;

public class Ex2 {

	public static void main(String[] args) {
        
        double anosSalarios[]  = new double[27];
        double salario = 1000;
        double aumentoPercentual = 0.015;

        for (int i = 0; i < anosSalarios.length; i++) {
            salario *= 1 + aumentoPercentual;
            aumentoPercentual *= 2;
            anosSalarios[i] = salario;
        }
        
        System.out.printf("Salário: %.2f", anosSalarios[26]);
    }
}

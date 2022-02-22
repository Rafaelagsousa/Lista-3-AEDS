import java.util.Scanner;

public class ExerA {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        double[] vetor = new double[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextDouble();
        }

        bubbleSort(vetor);
    }

    public static void bubbleSort(double[] vetor) {
        boolean troca = true;
        double aux;

        while (troca) {
            troca = false;

            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

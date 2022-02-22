import java.util.Scanner;

public class ExerC {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] vetor = new double[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextDouble();
        }

        selectionSort(vetor);
    }

    public static void selectionSort(double[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int menor = i;

            for (int j = menor + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }

            if (menor != i) {
                double t = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = t;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

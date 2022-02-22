import java.util.Scanner;

public class ExerB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] vetor = new double[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextDouble();
        }

        insertionSort(vetor);
    }

    public static void insertionSort(double[] vetor) {

        int i, j;
        double key;

        for ( j = 1; j < vetor.length; j++) {
            key = vetor[j];

            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }

            vetor[i + 1] = key;
        }

        for (int z = 0; z < vetor.length; z++) {
            System.out.print(vetor[z] + " ");
        }
    }
}

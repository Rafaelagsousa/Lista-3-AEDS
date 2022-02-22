import java.util.Scanner;

public class ExerD {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[] vetor = new double[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextDouble();
        }

        sort(vetor, 0, vetor.length - 1);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void sort(double[] arr, int l, int r) {

        if (l < r) {

            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void merge(double[] arr, int l, int m, int r) {

        double[] auxL = new double[m - l + 1];
        double[] auxR = new double[r - m];

        for (int i = 0; i < m - l + 1; i++) {
            auxL[i] = arr[l + i];
        }

        for (int j = 0; j < r - m; j++) {
            auxR[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < (m - l + 1) && j < (r - m)) {
            if (auxL[i] <= auxR[j]) {
                arr[k] = auxL[i];
                i++;
            } else {
                arr[k] = auxR[j];
                j++;
            }
            k++;
        }

        while (i < (m - l + 1)) {
            arr[k] = auxL[i];
            i++;
            k++;
        }

        while (j < (r - m)) {
            arr[k] = auxR[j];
            j++;
            k++;
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("basamak sayısını giriniz: ");
        n= input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (i + 1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * (n - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

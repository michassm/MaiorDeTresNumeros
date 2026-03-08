import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int maiorxy = (x+y + Math.abs(x-y)) / 2;
        int maior = (maiorxy + z + Math.abs(maiorxy - z)) /2;

        System.out.println(maior+" maior ");

        sc.close();


    }
}

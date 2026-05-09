import java.util.Scanner;

public class javamain {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int j = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();

            if (n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
                System.out.println("INVALID INPUT");
                return;
            }

            int bananaMonkeys = (m + k - 1) / k;
            int peanutMonkeys = (p + j - 1) / j;

            int monkeysLeft = n - (bananaMonkeys + peanutMonkeys);

            System.out.println("Number of Monkeys left on the tree:" + monkeysLeft);
        } finally {
            sc.close();
        }
    }
}

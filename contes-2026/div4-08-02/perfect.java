import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            
            // Just print numbers from 1 to n
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
                if (j < n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
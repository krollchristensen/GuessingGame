import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generer et tilfældigt tal mellem 1 og 10
        int randomNumber = (int)(Math.random() * 10) + 1;

        // Opret en Scanner til at læse brugerens input
        Scanner input = new Scanner(System.in);

        // Variabler til at gemme brugerens gæt og antal forsøg
        int guess1, guess2, guess3;

        // Første gæt
        System.out.print("Gæt et tal mellem 1 og 10: ");
        guess1 = input.nextInt();

        if (guess1 == randomNumber) {
            System.out.println("Tillykke! Du gættede det rigtige tal.");
        } else {
            System.out.println("Forkert gæt.");

            // Andet gæt
            System.out.print("Gæt igen: ");
            guess2 = input.nextInt();

            if (guess2 == randomNumber) {
                System.out.println("Tillykke! Du gættede det rigtige tal.");
            } else {
                System.out.println("Forkert gæt.");

                // Tredje gæt
                System.out.print("Sidste forsøg, gæt igen: ");
                guess3 = input.nextInt();

                if (guess3 == randomNumber) {
                    System.out.println("Tillykke! Du gættede det rigtige tal.");
                } else {
                    System.out.println("Forkert gæt. Det rigtige tal var " + randomNumber);
                }
            }
        }

        // Luk scanneren
        input.close();
    }
}

import java.util.*;

public class Studienberatung {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;

		System.out.println("Hast du Abitur?");
		answer = scanner.nextLine();

		if(answer.equalsIgnoreCase("n")) {
			System.out.println("Hast du Fachabitur?");
			answer = scanner.nextLine();

			if(answer.equalsIgnoreCase("j")) {
				System.out.println("Hast du eine Berufsausbildung?");
				answer = scanner.nextLine();
			}
		}
	}
}
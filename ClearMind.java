import java.util.Scanner;

public class ClearMind {

  // class variables
  static Scanner scanner = new Scanner(System.in);
  static int lastStressScore = 0;

  public static void main(String[] args) {

    // menu loop
    while (true) {
      printMenu();
      int choice = scanner.nextInt();

      switch(choice) {
        case 1: MentalHealthQuiz.takeStressCheck(); break;
        //case 2: dummyFunction(); break;
        //case 3: dummyFunction(); break;
        //case 4: dummyFunction(); break;
        //case 5: dummyFunction(); break;
        case 6: 
          System.out.println("\nGoodbye.");
          return; // stop the main function
        default: System.out.println("\nInvalid input. Please try again.");
      }
    }
  }

  public static void printMenu() {
    System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
            "██ ▄▄▀█ ██ ▄▄█ ▄▄▀█ ▄▄▀████ ▄▀▄ ██▄██ ▄▄▀█ ▄▀██\n" +
            "██ ████ ██ ▄▄█ ▀▀ █ ▀▀▄████ █ █ ██ ▄█ ██ █ █ ██\n" +
            "██ ▀▀▄█▄▄█▄▄▄█▄██▄█▄█▄▄████ ███ █▄▄▄█▄██▄█▄▄███\n" +
            "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\n");
    System.out.println("================== Main Menu ==================");
    System.out.println("1. Take Mental Health Quiz");
    System.out.println("2. View Personalized Recommendations");
    System.out.println("3. Daily Affirmation, random from array.");
    System.out.println("4. View Activity Summary & Stress Score");
    System.out.println("5. Browse Support Resources");
    System.out.println("6. Exit\n");
    System.out.print("Enter your choice: ");
  }

}

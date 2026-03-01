public class EquiMind {

  // global variables
  static Scanner scanner = new Scanner(System.in);
  static int lastStressScore = 0;

  public static void main(String[] args) {
    // menu loop
    while (true) {
      printMenu();
      int choice = scanner.nextInt();
      switch(choice) {
        //case 1: takeStressCheck(); break;
        //case 2: dummyFunction(); break;
        //case 3: dummyFunction(); break;
        //case 4: dummyFunction(); break;
        //case 5: dummyFunction(); break;
        case 6: return; // stop the while cycle
      }
    }
  }

  //public static void printMenu() {}

  //public static void takeStressCheck(lastStressScore) {}

  // add your code here

}

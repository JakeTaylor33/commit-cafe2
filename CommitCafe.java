public class CommitCafe {

    private static String barista = "Jake"; // STUDENT_TODO_1A: Change name\
    private static String nickname = "TopDawg";
    // STUDENT_TODO_1B: Add a nickname or title for the barista

    private static int cups = 0;

    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        // STUDENT_TODO_2B: Add a second brew-related improvement
        cups++;
        System.out.println(nickname + " brewed a " + drink);
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}

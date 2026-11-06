public class CommitCafe {

    private static String barista = "Jake"; // STUDENT_TODO_1A: Change name
    private static String nickname = "MainBarista";
    private static String title = "[Lead Barista]";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println(barista + " has brewed your " + drink);
        cups++;
        System.out.println("CoffeeBot brewed " + drink + ". Commit your coffee, not your code before it compiles.");
        System.out.println("[BOT CHECK] drink length = " + drink.length());
        System.out.println(barista + " brew count: " + cups);
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

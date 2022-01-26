package Game;

public class AI {
    public static void takeMatchesByAI(int num) {
        int matches = (4 - num);
        if (matches == 1) {
            System.out.print("Компьютер взял " + matches + " спичку. ");
        } else System.out.print("Компьютер взял " + matches + " спички. ");

        Conditions.amountOfMatches -= matches;
        ActionDescribe.printMatchesLeft();
    }
}
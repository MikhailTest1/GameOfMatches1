package Game;

import java.util.Scanner;

public class GameLogic {
    public static void Gamelogic() {
        ActionDescribe.printWelcomeWords();
        ActionDescribe.takeMatchesByAI();
        while (true) {
            Scanner scan = new Scanner(System.in);
            ActionDescribe.printPlayerTurn();
           int num = scan.nextInt();
            if (num < 0 || num > 3) {
                ActionDescribe.printWarning();
                continue;
            } else Player.takeMatchesByPlayer(num);
            ActionDescribe.printMatchesLeft();
            AI.takeMatchesByAI(num);
            if (Player.amountOfMatches == 1) {
                System.out.println("Для игрока осталась последняя спичка,вы проиграли!");
                scan.close();
                break;
            }
        }
    }
}
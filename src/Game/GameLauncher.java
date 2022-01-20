package Game;

import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args) {
        int m = 0;
        ActionDescribe ad = new ActionDescribe();
        AI ai = new AI();
        Player p = new Player();
        Scanner scan = new Scanner(System.in);

        ad.helloWords();
        ad.firstAITurn();


        {
            boolean isTurn = true;
            while (isTurn) {
                ad.playerTake();
                m = scan.nextInt();
                if (m < 0 || m > 3) {
                    ad.wrongNumber();
                    continue;
                }
                switch (m) {
                    case 1:
                        p.changeAmountOfMatches(m);
                        ad.matchesLeft();
                        ai.turnAI(m);
                        break;
                    case 2:
                        p.changeAmountOfMatches(m);
                        ad.matchesLeft();
                        ai.turnAI(m);
                        break;
                    case 3:
                        p.changeAmountOfMatches(m);
                        ad.matchesLeft();
                        ai.turnAI(m);
                        break;
                }
                if (p.amountOfMatches == 1) {
                    isTurn = false;
                    System.out.println("Для игрока осталась последняя спичка,вы проиграли!");
                    break;
                }
            }
        }
    }
}
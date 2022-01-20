package Game;

public class Player extends Conditions{
    public void changeAmountOfMatches(int num) {
        switch (num) {
            case 1:
                amountOfMatches -= 1;
                break;
            case 2:
                amountOfMatches -= 2;
                break;
            case 3:
                amountOfMatches -= 3;
                break;
        }
    }
}
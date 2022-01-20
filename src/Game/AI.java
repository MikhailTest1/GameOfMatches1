package Game;

public class AI extends ActionDescribe {

    public void turnAI(int num) {
        int cake = (4 - num);
        if (cake == 1) {
            System.out.print("Компьютер взял " + cake + " спичку. ");
        } else System.out.print("Компьютер взял " + cake + " спички. ");
        amountOfMatches -= cake;
        matchesLeft();
    }
}
package Game;

public class ActionDescribe extends Conditions {
    public void firstAITurn() {
        amountOfMatches -= 3;
        System.out.println("Компьютер взял 3 спички. На столе осталось 17 ");
    }
    public void helloWords(){
        System.out.println("Приветствую Вас в игре 20 спичек!!!" +
                "Вы с компьютером, по очереди берете от 1 до 3 спичек за раз.\n" +
                "Выигрывает тот игрок кому не досталась последняя спичка\n" +
                "Итак, на столе лежит 20 спичек:");
    }
    public void wrongNumber(){
        System.out.println("К сожалению Вы взяли неверное количество спичек. " +
                "Повторите ввод и введите число от 1 до 3");
    }
    public void playerTake(){
        System.out.println("Ход игрока. Пожалуйста возьмите спички");
    }
    public void matchesLeft(){
        if (amountOfMatches == 2 || amountOfMatches == 3 ){
            System.out.print("На столе осталось " + amountOfMatches + " спички\n");
        }
        else if(amountOfMatches == 1) System.out.println("На столе осталось " + amountOfMatches + " спичка");
        else System.out.println("На столе осталось " + amountOfMatches + " спичек");
    }
}

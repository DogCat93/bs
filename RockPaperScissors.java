import java.util.Scanner;
public class RockPaperScissors{
    public static void main(String[] args){
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Begin by choosing: Rock, Paper, or Sissors.");
        while (true){
            Scanner scan = new Scanner (System.in);
            String generated = robotChoice();
            String choice = isValidChoice();
            System.out.println("The robot chose " + generated);
            String winner = check(choice, generated);
            System.out.println("The winner is: " + winner);
            System.out.println("Would you like to play again? (yes or no)\n");
            String play = scan.nextLine();
            if (play.toLowerCase().equals("no")){
                break;
            }else{
                System.out.print("------------------------------------------------------------------\nLets go!\n");
            }
        }
        System.out.print("Hope you enjoyed!");
    }
    public static String check(String x, String y){
        String a = x.toLowerCase();
        String b = y.toLowerCase();
        String winner;
        if ((a.equals("paper") && b.equals("rock")) || (a.equals("scissors") && b.equals("paper")) || ( a.equals("rock") && b.equals("scissors"))){
            winner = "human";
        }else if((b.equals("paper") && a.equals("rock")) || (b.equals("scissors") && a.equals("paper")) || (b.equals("rock") && a.equals("scissors"))){
            winner = "robot";
        }else{
            winner = "draw!";
        }
        return winner;
    }
    public  static String isValidChoice(){
        String choice;
        Scanner scan = new Scanner(System.in);
        while (true){
            choice = scan.nextLine();
            if (!(choice.toLowerCase().equals("rock") || choice.toLowerCase().equals("paper") || choice.toLowerCase().equals("scissors"))){
                System.out.println("Enter a valid option.");
            }else{
                break;
            }
        }
        return choice;
    }
    public static String robotChoice(){
        String generated;
         int a =(int) (Math.random() * 3);
            if (a == 1){
                generated = "rock";
            }else if (a == 2){
                generated = "paper";
            }else{
                generated = "scissors";
            }
        return generated;
    }


}

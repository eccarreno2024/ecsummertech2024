import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        int score = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("There is 1, 2, and 3");
        System.out.println("Which one will you pick?");
        String choice = input.nextLine();
        int random = (int)(Math.random() * 3)+1;

        if(random == 1 && choice.equals("1")){
        System.out.print("Both players picked rock, so it is a tie");
        System.out.println(score);
        System.out.println("Score remains the same"); 
        }
        
        if(random == 1 && choice.equals("2")){
        System.out.print("Computer picked rock and user picked paper, so the user wins");
        System.out.println("Score increases on user");
        score ++;
        System.out.println(score);


        }
        if(random == 1 && choice.equals("3")){
        System.out.print("Computer picked rock and user picked scissors, so the computer wins");
        score --;
        System.out.println(score);
        
        }
        if(random == 2 && choice.equals("2")){
        System.out.print("Both players picked paper");
        System.out.println(score);
        }
        if(random == 2 && choice.equals("1")){
        System.out.print("Computer picked paper and user picked rock, so the computer wins");
        score --;
        System.out.println(score);
        
        }
        if(random == 2 && choice.equals("3")){
        System.out.print("Computer picked paper and user picked scissors, so the user wins");
        score ++;
        System.out.println(score);
        }
    }   
}
import java.util.Scanner;
import java.util.Random;

public class Main{
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
while (true) {
  String[] rps = {"rock", "paper", "scissors"};
  String computerMove = rps[new Random().nextInt(rps.length)];
  String playerMove = "";

  while(true) {
//Getting input from the user
    System.out.println("Please enter your move (rock, paper, or scissors)");
    playerMove = scanner.nextLine();
    if(playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")){
      break;
    }
// If the user does not enter rock, paper, or scissors, it will say the user to entered an invalid move
  System.out.println(playerMove + " is not a valid move.");
  }
  System.out.println("Computer played: " + computerMove);
//If the user and the computer play the same move, it will say it is a tie
  if (playerMove.equals(computerMove)) {
  System.out.println("The game was a tie!");
  }
//If the user plays rock and the computer plays paper, it will say the user lost
  else if (playerMove.equals("rock")){
    if (computerMove.equals("paper")){
      System.out.println("You lose!");
//If the user plays rock and the computer plays scissors, it will say the user won
    } else if (computerMove.equals("scissors")){
        System.out.println("You win!");
      }
  }
//If the user plays paper and the computer plays rock, it will say the user won
    else if (playerMove.equals("paper")){
      if (computerMove.equals("rock")){
        System.out.println("You win!");
//If the user plays paper and the computer plays scissors, it will say the user lost
  } else if (computerMove.equals("scissors")){
          System.out.println("You lose!");
        }
    }
//If the user plays scissors and the computer plays paper, it will say the user won
    else if (playerMove.equals("scissors")){
      if (computerMove.equals("paper")){
        System.out.println("You win!");
//If the user plays scissors and the computer plays rock, it will say the user lost
  } else if (computerMove.equals("rock")){
          System.out.println("You lose!");
        }
    }
//Asks the user if they want to play again
  System.out.println("Play again? (yes/no)");
  String playAgain = scanner.nextLine();
  if (!playAgain.equals("yes")) {
    break;
  }
  }
}
}
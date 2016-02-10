import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import java.util.Random;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {
  public static void main(String[] args) {}

  public static String twoPlayerGame(String personOneChoice, String personTwoChoice) {

    String outcome = "";
    if (personOneChoice == "Rock" && personTwoChoice == "Scissors" ||        personOneChoice == "Scissors" && personTwoChoice == "Paper" || personOneChoice == "Paper" && personTwoChoice == "Rock" ) {
      outcome = "Player 1 Wins";
    } else if (personOneChoice == "Rock" && personTwoChoice == "Paper" || personOneChoice == "Scissors" && personTwoChoice == "Rock" || personOneChoice == "Paper" && personTwoChoice == "Scissors") {
      outcome = "Player 2 Wins";
    } else {
      outcome = "Tie Game";
    }
      return outcome;
    }


  public static String onePlayerGame() {
    Random computerRandom = new Random();
    Integer computerInteger = computerRandom.nextInt(3);
    String computerChoice = "";
    String outcome = "";

    if (computerInteger == 0) {
      computerChoice = "Rock";
    } else if (computerInteger == 1) {
      computerChoice = "Scissors";
    } else {
      computerChoice = "Paper";
    }

    return computerChoice;

    // if (player == "Rock" && computerChoice == "Scissors" || player == "Scissors" && computerChoice == "Paper" || player == "Paper" && computerChoice == "Rock" ) {
    //   outcome = "Player 1 Wins";
    // } else if (player == "Rock" && computerChoice == "Paper" || player == "Scissors" && computerChoice == "Rock" || player == "Paper" && computerChoice == "Scissors") {
    //   outcome = "Computer Wins";
    // } else {
    //   outcome = "Tie Game";
    // }
    //   return outcome;
    }

  }

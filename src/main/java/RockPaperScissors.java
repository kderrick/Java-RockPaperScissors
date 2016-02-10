import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {
  public static void main(String[] args) {}

  public static String checkWinner(String personOneChoice, String personTwoChoice) {

    String outcome = "";
    if (personOneChoice == "Rock" && personTwoChoice == "Scissors"){
      outcome = "Player 1 Wins";
    } else {
      outcome = "Player 2 Wins";
      }
      return outcome;
    }
}

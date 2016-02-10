import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import java.util.Random;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request,response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request,response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/output.vtl");

      String playerOneChoice = request.queryParams("optionsRadios");
      String playerTwoChoice = request.queryParams("optionsRadiosTwo");
      String game = twoPlayerGame(playerOneChoice, playerTwoChoice);

      model.put("game", game);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
    }

  public static String twoPlayerGame(String personOneChoice, String personTwoChoice) {

    String outcome = "";
    if (personOneChoice.equals("Rock") && personTwoChoice.equals("Scissors") ||        personOneChoice.equals("Scissors") && personTwoChoice.equals("Paper") || personOneChoice.equals("Paper") && personTwoChoice.equals("Rock")) {
      outcome = "Player 1 Wins";
    } else if (personOneChoice.equals("Rock") && personTwoChoice.equals("Paper") || personOneChoice.equals("Scissors") && personTwoChoice.equals("Rock") || personOneChoice.equals("Paper") && personTwoChoice.equals("Scissors")) {
      outcome = "Player 2 Wins";
    } else {
      outcome = "Tie Game";
    }
      return outcome;
    }

  public static String computerOption() {
    Random computerRandom = new Random();
    Integer computerInteger = computerRandom.nextInt(3);
    String computerChoice;

    if (computerInteger == 0) {
      computerChoice = "Rock";
    } else if (computerInteger == 1) {
      computerChoice = "Scissors";
    } else {
      computerChoice = "Paper";
    }

      return computerChoice;
    }


    public static String onePlayerGame(String player) {
      String outcome = "";
      String computerChoice = computerOption();

      if (player.equals("Rock") && computerChoice.equals("Scissors") || player.equals("Scissors") && computerChoice.equals("Paper") || player.equals("Paper") && computerChoice.equals("Rock") ) {
        outcome = "Player 1 Wins";
      } else if (player.equals("Rock") && computerChoice.equals("Paper") || player.equals("Scissors") && computerChoice.equals("Rock") || player.equals("Paper") && computerChoice.equals("Scissors")) {
        outcome = "Computer Wins";
      } else {
        outcome = "Tie Game";
      }
      return outcome;
    }

  }

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {
  public static void main(String[] args) {}

  public static Boolean checkWinner(String personOneChoice, String personTwoChoice) {

    Boolean outcome = false;
    if (personOneChoice == "Rock" && personTwoChoice == "Scissors"){
      outcome = true;
    } else if ()

    return outcome;
  }
}

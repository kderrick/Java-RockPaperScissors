import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

public class RockPaperScissorsTest {

  @Test
  public void twoPlayerGame_rockBeatsScissors_player1() {
  RockPaperScissors testRockPaperScissors = new RockPaperScissors();
  String outcome = "Player 1 Wins";
  assertEquals(outcome, testRockPaperScissors.twoPlayerGame("Rock", "Scissors"));
  assertEquals(outcome, testRockPaperScissors.twoPlayerGame("Scissors", "Paper"));
  assertEquals(outcome, testRockPaperScissors.twoPlayerGame("Paper", "Rock"));
  }

  @Test
  public void twoPlayerGame_rockLosePaper_player2() {
  RockPaperScissors testRockPaperScissors = new RockPaperScissors();
  String outcome = "Player 2 Wins";
  assertEquals(outcome, testRockPaperScissors.twoPlayerGame("Rock", "Paper"));
  assertEquals(outcome, testRockPaperScissors.twoPlayerGame("Scissors", "Rock"));
  assertEquals(outcome, testRockPaperScissors.twoPlayerGame("Paper", "Scissors"));
  }

  @Test
  public void twoPlayerGame_rockTieRock_tie() {
  RockPaperScissors testRockPaperScissors = new RockPaperScissors();
  String outcome = "Tie Game";
  assertEquals(outcome, testRockPaperScissors.twoPlayerGame("Rock", "Rock"));
  }

//End of Two Player Game
//Start One Player Game Against Computer
  // @Test
  // public void computerOption_computerChoiceRandomNumberEqualsChoice_Choice() {
  // RockPaperScissors testRockPaperScissors = new RockPaperScissors();
  // Random computerRandom = new Random();
  // Integer computerInteger = computerRandom.nextInt(3);
  // String computerChoice;
  //   if (computerInteger == 0) {
  //     computerChoice = "Rock";
  //   } else if (computerInteger == 1) {
  //     computerChoice = "Scissors";
  //   } else {
  //     computerChoice = "Paper";
  //   }
  // assertEquals(computerChoice, testRockPaperScissors.computerOption());
  // }

  // @Test
  // public void onePlayerGame_rockBeatsScissors_player1() {
  // RockPaperScissors testRockPaperScissors = new RockPaperScissors();
  // String outcome = "Player 1 Wins";
  // String computerChoice = "Scissors";
  // assertEquals(outcome, testRockPaperScissors.onePlayerGame("Rock"));
  // }


}

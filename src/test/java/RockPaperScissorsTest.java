import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void checkWinner_rockBeatsScissors_player1() {
  RockPaperScissors testRockPaperScissors = new RockPaperScissors();
  String outcome = "Player 1 Wins";
  assertEquals(outcome, testRockPaperScissors.checkWinner("Rock", "Scissors"));
  }
  @Test
  public void checkWinner_rockLosePaper_player2() {
  RockPaperScissors testRockPaperScissors = new RockPaperScissors();
  String outcome = "Player 2 Wins";
  assertEquals(outcome, testRockPaperScissors.checkWinner("Rock", "Paper"));
  }
  @Test
  public void checkWinner_rockTieRock_tie() {
  RockPaperScissors testRockPaperScissors = new RockPaperScissors();
  String outcome = "Tie Game";
  assertEquals(outcome, testRockPaperScissors.checkWinner("Rock", "Rock"));
  }
}

import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567");
      assertThat(pageSource()).contains("Let's Play!");
  }
  @Test
  public void outputTestPLayer2() {

    goTo("http://localhost:4567");
    find("#optionsRadios1").click();
    find("#optionsRadios5").click();
    submit(".btn-info");
    assertThat(pageSource()).contains("Player 2 Wins");
  }
  @Test
  public void outputTestTie() {

    goTo("http://localhost:4567");
    find("#optionsRadios1").click();
    find("#optionsRadios4").click();
    submit(".btn-info");
    assertThat(pageSource()).contains("Tie Game");
  }
}

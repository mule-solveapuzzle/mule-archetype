package $package;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldIncrement() {
    
    App a = new App();
    int result = a.increment(3);
    assertEquals(4,result);
  }
}

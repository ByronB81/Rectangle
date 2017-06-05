import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {

  @Test
  public void newRectangle_instantiatesCorrectly(){
    Rectangle testRectangle = new Rectangle(2,4);
    assertEquals(true, testRectangle instanceof Rectangle);
  }

  @Test
  public void newRectangle_getsLength(){
    Rectangle testRectangle = new Rectangle(2,4);
    assertEquals(2, testRectangle.getLength());
  }

}

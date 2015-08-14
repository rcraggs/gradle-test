package rc.app;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddTest {

  @Test
  public void testAdd() {

    // MyClass is tested
    HelloWorld tester = new HelloWorld();

    // assert statements
    assertEquals(10, tester.add(10, 0));
    assertEquals(1, tester.add(1, 0));
    assertEquals(3, tester.add(2, 1));
  }

  @Test
  public void testInitialDbCount() {
    HelloWorld tester = new HelloWorld();
    assertEquals(1, tester.getNumberOfFeedbackComments());
  }

}

package automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 {
  @Test
  public void a() {
System.out.print("i am test from a");
  }
  @Test
  public void b() {System.out.print("i am test from b");
  }
  @BeforeTest
  public void beforeTest() {System.out.print("i am  before test");
  }

  @AfterTest
  public void afterTest() {System.out.print("i am test ");
  }

}

package automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void a() {System.out.print("i am test from a");
  }
  public void b() {System.out.print("i am test from b");
  }
  @BeforeMethod
  public void beforeMethod() {System.out.print("i am before from a");
  }

  @AfterMethod
  public void afterMethod() {System.out.print("i am after from a");
  }

}

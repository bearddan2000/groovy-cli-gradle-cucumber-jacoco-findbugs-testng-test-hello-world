import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

public class Greeting {

  String name, res;

  @Given("Name")
  public void createName() {
     name = "Steve";
  }

  @When("Pass name to function")
  public void passName() {
     res = example.Greeting.greeting(name);
  }

  @Then("Response should be hello world Steve")
  public void checkMessage() {
     Assert.assertEquals(res, "Hello World, Steve");
  }
}


import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.Project;
public class ProjectSteps {
    public ProjectSteps() {

    }
    String name;
    String Description;
    int ID;
    @Given("^User Tries to manage a project or create a new one$")
    public void createProject() {

    }

    @When("^He inputs project name: \"([^\"]*)\"$")
    public void heInputsProjectName(String arg0) throws Throwable {
       name = arg0;
    }

    @And("^He inputs project description: \"([^\"]*)\"$")
    public void heInputsProjectDescription(String arg0) throws Throwable {
       Description = arg0;
    }

    @And("^He inputs project ID: (\\d+)$")
    public void heInputsProjectID(int arg0) {
        ID = arg0;
    }

    @Then("^He creates a new project$")
    public void heCreatesANewProject() {
        Project proj = new Project(name,Description,ID);

    }
}

package steps;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestBase;
import utils.PropertiesUtil;

import java.net.MalformedURLException;
import java.util.Properties;

public class CreateNewTask extends TestBase {
    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;
    Properties properties = PropertiesUtil.loadTestData();

    @Given("Click Add New Task")
    public void clickAddNewTask() {
//        Android_Setup();
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage = new TasksListPage(driver);
        tasksListPage.clickAddTaskBtn();
    }

    @Given("Enter Task Name")
    public void enterTaskName() {
        String taskName = properties.getProperty("taskName");
        createTaskPage.enterTaskName(taskName);
    }

    @Given("Enter Task Description")
    public void enterTaskDescription() {
        String taskDesc = properties.getProperty("taskDesc");
        createTaskPage.enterTaskDesc(taskDesc);
    }

    @When("User click on Save Button")
    public void userClickOnSaveButton() {
        driver.hideKeyboard();
        createTaskPage.clickSaveBtn();
    }

    @Then("Task added successfully")
    public void taskAddedSuccessfully() {
        System.out.println("Task added successfully");
//        tearDown();
    }

    @Given("Enter {string} and {string}")
    public void enterAnd(String taskName, String taskDesc) {
        createTaskPage.enterTaskName(taskName);
        createTaskPage.enterTaskDesc(taskDesc);
    }
}

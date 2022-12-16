package tests;

import PageObjects.CreateTaskPage;
import PageObjects.TasksListPage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ToDo_Android extends TestBase{

    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;

    @Test
    public void addTask() throws MalformedURLException {
        Android_Setup();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        tasksListPage.clickAddTaskBtn();
        createTaskPage.enterTaskName("Appium Check");
        createTaskPage.enterTaskDesc("Application is running");
        driver.hideKeyboard();
        createTaskPage.clickSaveBtn();
        tearDown();
    }
}

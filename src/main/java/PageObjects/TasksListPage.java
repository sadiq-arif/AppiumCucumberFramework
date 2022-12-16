package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TasksListPage extends BasePage{
    public TasksListPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "fab")
    MobileElement addTaskBtn;

    public void clickAddTaskBtn() {
        click(addTaskBtn);
    }
}

package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTaskPage extends BasePage{
    public CreateTaskPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "editTextTitre")
    MobileElement taskNameTxt;

    @AndroidFindBy(id = "editTextNote")
    MobileElement taskDescTxt;

    @AndroidFindBy(id = "action_save")
    MobileElement saveBtn;

    public void enterTaskName(String taskName) {
        clear(taskNameTxt);
        sendText(taskNameTxt,taskName);
    }

    public void enterTaskDesc(String descTxt) {
        clear(taskDescTxt);
        sendText(taskDescTxt,descTxt);
    }

    public void clickSaveBtn() {
        clear(saveBtn);
    }
}

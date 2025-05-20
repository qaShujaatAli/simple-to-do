package page.iOS.SimpleToDo;

import core.utils.AppiumHook.AppiumRunner;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import page.Page;

import java.util.List;

public class PageSimpleToDoHome {

    private String HOME_ACC_ID = "SimpleTodoApp";
    private String TASK_DESC_ACC_ID = "Add a new task";
    private String ADD_TASK_ACC_ID = "Add Task";
    private String ADDED_TASK_ACC_ID = " Delete";
    private String ADDED_TASK_DESCRIPTION_ACC_ID = "ToDo - Task One";
    private String DELETE_TASK_ACC_ID = "Delete";
    private String NO_TASK_CREATED_ACC_ID = "Horizontal scroll bar, 1 page Vertical scroll bar, 1 page";

    public PageSimpleToDoHome(Page page) {}
    public WebElement getSimpleAppHome() { return AppiumRunner.getIOSDriver().findElement(AppiumBy.accessibilityId(HOME_ACC_ID)); }
    public WebElement getAddTaskDesc() { return AppiumRunner.getIOSDriver().findElement(AppiumBy.accessibilityId(TASK_DESC_ACC_ID)); }
    public WebElement getAddTask() { return AppiumRunner.getIOSDriver().findElement(AppiumBy.accessibilityId(ADD_TASK_ACC_ID)); }
    public WebElement getAddedTask(String addedTask) { return AppiumRunner.getIOSDriver().findElement(AppiumBy.accessibilityId(addedTask + ADDED_TASK_ACC_ID)); }
    public WebElement markTaskCompleted() { return AppiumRunner.getIOSDriver().findElement(AppiumBy.accessibilityId(ADDED_TASK_DESCRIPTION_ACC_ID)); }
    public WebElement closeKeyboard() { return AppiumRunner.getIOSDriver().findElement(AppiumBy.accessibilityId(ADD_TASK_ACC_ID)); }
    public WebElement deleteTask() { return AppiumRunner.getIOSDriver().findElement(AppiumBy.accessibilityId(DELETE_TASK_ACC_ID)); }
    public WebElement getNoTaskCreated() { return AppiumRunner.getIOSDriver().findElement(AppiumBy.accessibilityId(NO_TASK_CREATED_ACC_ID)); }

    public boolean isElementNotDisplayed(String element) {
        List<WebElement> elements = AppiumRunner.getIOSDriver().findElements(AppiumBy.accessibilityId(element + DELETE_TASK_ACC_ID));
        return elements.isEmpty();
    }

}

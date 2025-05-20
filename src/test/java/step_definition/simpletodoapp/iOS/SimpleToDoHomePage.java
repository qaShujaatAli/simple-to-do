package step_definition.simpletodoapp.iOS;

import core.utils.AppiumHook.AppiumRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import page.Page;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class SimpleToDoHomePage extends Page {

    @Given("^\\[ToDo Home Page] SimpleToDo App must be launched successfully$")
    public void launchToDoApp() throws MalformedURLException, InterruptedException
    {
        AppiumRunner.startAppiumServeriOS();
        Assert.assertEquals("SimpleTodoApp", getSimpleToDoHome().getSimpleAppHome().getText());
    }

    @And("^\\[ToDo Home Page] User add a new Task \"([^\"]*)\"$")
    public void typeNewTask(String taskDescription)
    {
        getSimpleToDoHome().getAddTaskDesc().sendKeys(taskDescription);
    }

    @And("^\\[ToDo Home Page] User taps on Add Task$")
    public void clickAddTask()
    {
        getSimpleToDoHome().getAddTask().click();
        getSimpleToDoHome().closeKeyboard().sendKeys(Keys.RETURN);
    }

    @Then("^\\[ToDo Home Page] Verify Task \"([^\"]*)\" has been added successfully$")
    public void verifyTaskAdded(String taskDescription)
    {
        Assert.assertTrue(getSimpleToDoHome().getAddedTask(taskDescription).isDisplayed());
    }

    @And("^\\[ToDo Home Page] User marks Task as completed$")
    public void markTaskCompleted()
    {
        getSimpleToDoHome().markTaskCompleted().click();
    }

    @And("^\\[ToDo Home Page] User deletes a Task$")
    public void deleteTask()
    {
        getSimpleToDoHome().deleteTask().click();
    }

    @Then("^\\[ToDo Home Page] Verify Task \"([^\"]*)\" is Deleted successfully$")
    public void verifyTaskDeleted(String taskDescription)
    {
        Assert.assertTrue(getSimpleToDoHome().isElementNotDisplayed(taskDescription));
    }

    @And("^\\[ToDo Home Page] User taps on Task description$")
    public void addEmptyTask()
    {
        getSimpleToDoHome().getAddTaskDesc().click();
    }

    @Then("^\\[ToDo Home Page] Verify user must NOT be allowed to create an empty Task$")
    public void verifyEmptyTask()
    {
        Assert.assertTrue(getSimpleToDoHome().getNoTaskCreated().isDisplayed());
    }

}

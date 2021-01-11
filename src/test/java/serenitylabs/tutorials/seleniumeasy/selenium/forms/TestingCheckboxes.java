package serenitylabs.tutorials.seleniumeasy.selenium.forms;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingCheckboxes extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("basic-checkbox-demo.html");
    }

    @Test
    public void singleCheckbox() {
        // TODO: Click on the first checkbox and check that a success message is displayed
        driver.findElement(By.id("isAgeSelected")).click();

        String result = driver.findElement(By.id("txtAge")).getText();

        assertThat(result).isEqualTo("Success - Check box is checked");
    }

    @Test
    public void multipleCheckboxes() {
        // TODO: Click on all the checkboxes and ensure that the button text is "Uncheck All"

        driver.findElements(By.cssSelector(".cb1-element")).forEach(WebElement::click);

        assertThat(driver.findElement(By.id("check1")).getAttribute("Value")).isEqualTo("Uncheck All");
    }
}

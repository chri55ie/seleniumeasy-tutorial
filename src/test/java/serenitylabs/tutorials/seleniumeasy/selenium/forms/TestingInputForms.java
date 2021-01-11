package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitWebElement;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingInputForms extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("basic-first-form-demo.html");
    }

    @Test
    public void enteringASingleInputForm() {
        // TODO: Enter a message in the Single Input Field and check that it is shown

        driver.findElement(By.id("user-message")).sendKeys("Hello");
        driver.findElement(By.cssSelector(("#get-input > button"))).sendKeys(Keys.RETURN); // TODO: Fix me

        assertThat(driver.findElement(By.id("display")).getText().contains("Hello"));
    }

    @Test
    public void enterTwoValues() {
        // TODO: Enter a number in each input field and verify the calculated total
        driver.findElement(By.id("sum1")).sendKeys("1");
        driver.findElement(By.id("sum2")).sendKeys("2");
        driver.findElement(By.cssSelector(("#gettotal > button"))).sendKeys(Keys.RETURN);

        assertThat(driver.findElement(By.id("displayvalue")).getText().contains("4"));
    }
}


// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test2() {
    // Test name: test2
    // Step # | name | target | value
    // 1 | open | https://sakshingp.github.io/assignment/home.html | 
    driver.get("https://sakshingp.github.io/assignment/home.html");
    // 2 | setWindowSize | 1296x688 | 
    driver.manage().window().setSize(new Dimension(1296, 688));
    // 3 | click | css=.btn-primary > span | 
    driver.findElement(By.cssSelector(".btn-primary > span")).click();
    // 4 | click | css=.btn-primary > span | 
    driver.findElement(By.cssSelector(".btn-primary > span")).click();
    // 5 | click | css=#totalBalance > .balance-link span | 
    driver.findElement(By.cssSelector("#totalBalance > .balance-link span")).click();
    // 6 | click | css=.has-sub-menu:nth-child(3) span | 
    driver.findElement(By.cssSelector(".has-sub-menu:nth-child(3) span")).click();
    // 7 | click | css=.selected span | 
    driver.findElement(By.cssSelector(".selected span")).click();
    // 8 | click | css=.has-sub-menu:nth-child(5) span | 
    driver.findElement(By.cssSelector(".has-sub-menu:nth-child(5) span")).click();
    // 9 | click | css=.has-sub-menu:nth-child(6) span | 
    driver.findElement(By.cssSelector(".has-sub-menu:nth-child(6) span")).click();
    // 10 | click | css=.top-icon > .os-icon | 
    driver.findElement(By.cssSelector(".top-icon > .os-icon")).click();
    // 11 | click | css=.top-icon > .os-icon | 
    driver.findElement(By.cssSelector(".top-icon > .os-icon")).click();
    // 12 | click | id=showExpensesChart | 
    driver.findElement(By.id("showExpensesChart")).click();
  }
}

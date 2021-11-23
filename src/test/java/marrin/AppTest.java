package marrin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver= new ChromeDriver();
    	
    	driver.get("google.com");
}
}

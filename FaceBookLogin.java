import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class FaceBookLogin {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //Enter First name on InputField
        driver.findElement(By.name("First name")).sendKeys("OnlyForText");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Enter Second name on InputField
        driver.findElement(By.name("lastname")).sendKeys("OnlyForText");
        driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS);
        //Enter your Email on InputField
        driver.findElement(By.name("reg_email")).sendKeys("OnlyForTestasaschoudhary49@gmail.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Enter your Password on InputField
        driver.findElement(By.name("reg_passwd__")).sendKeys("ashish123@123");

        //Select Month/Date/Year
        Select selectDate = new Select(driver.findElement(By.id("Date")));
        selectDate.deselectByVisibleText("17");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Select selectMonth = new Select(driver.findElement(By.id("Month")));
        selectMonth.deselectByVisibleText("Sep");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Select selectYear = new Select(driver.findElement(By.id("Year")));
        selectYear.deselectByVisibleText("1996");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Select Male Or Female
        driver.findElement(By.id("u_0_7")).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //Sumit the From by Clicking Creat Account
        driver.findElement(By.name("websubmit")).click();

        System.out.println("New facebook id is created");
    }
}

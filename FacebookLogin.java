import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {
    public static void main(String[] args) throws InterruptedException {

        //
        WebDriverManager.chromedriver().setup();
        //DRIVER OBJECT REFERENCE VARIABLE
        WebDriver driver = new ChromeDriver();
        //LAUNCH FACEBOOK
        driver.get("https://www.facebook.com/");
        //MAXIMIZE WINDOw
        driver.manage().window().maximize();

        //ENTER USERNAME
        WebElement userId = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        userId.sendKeys("aryankumar01@live.com");
        //ENTER PASSWORD
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        pass.sendKeys("ashish12345");
        //CLICK ON LOGIN BUTTON
        WebElement btnsunit = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
        btnsunit.click();

        //FIND THE STATUS TEXT AREA
        WebElement statusTextArea = driver.findElement(By.xpath("//div[@class='m9osqain a5q79mjw']"));
        statusTextArea.click();

        //ENTER THE STATUS MESSAGE AS HELLO FACEBOOK
        WebElement textBox = driver.findElement(By.xpath("//div[@class='gcieejh5 bn081pho humdl8nn izx4hr6d rq0escxv oo9gr5id t5a262vz o0t2es00 b1v8xokw datstx6m f530mmz5 lzcic4wl ecm0bbzt rz4wbd8a sj5x9vvc a8nywdso k4urcfbm o8yuz56k']//div[@class='rq0escxv datstx6m k4urcfbm a8c37x1j']//div[@class='_5rp7']//div[@class='_5rpb']//div[@class='notranslate _5rpu']//div//div//div[@class='_1mf _1mj']"));
        textBox.sendKeys("HELLO FACEBOOK");
        //WAIT
        Thread.sleep(1000);

        //CLICK ON PRIVACY
        WebElement privacyOnlyForMe = driver.findElement(By.xpath("//span[@class='l3itjdph cga1ltu']"));
        privacyOnlyForMe.click();
        //WAIT
        Thread.sleep(1000);

        //CLICK ON POST BUTTON
        WebElement btnPost = driver.findElement(By.xpath("//div[@class='oajrlxb2 s1i5eluu qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 pq6dq46d p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x cxgpxx05 d1544ag0 sj5x9vvc tw6a2znq oqcyycmt esuyzwwr f1sip0of lzcic4wl l9j0dhe7 abiwlrkh p8dawk7l ehryuci6 bp9cbjyn beltcj47 p86d2i9g aot14ch1 kzx2olss rt8b4zig n8ej3o3l agehan2d sk4xxmp2 lrazzd5p gigivrx4 sf5mxxl7 g0qnabr5 lrwzeq9o iqfcb0g7 lsqurvkf id6903cd jq4qci2q m5l1wtfr taijpn5t sn7ne77z oqhjfihn bwm1u5wc']"));
        btnPost.click();
    }

}
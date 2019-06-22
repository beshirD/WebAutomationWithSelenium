import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileWriter;

public class PortalTest {
    @Test
    public void testCase1() throws InterruptedException {

        WebDriver driver = new SafariDriver();


        driver.get("https://portal.aait.edu.et/");

        driver.findElement(By.name("UserName")).sendKeys ("Atr/3178/09");

        //Thread.sleep(1000);

        driver.findElement(By.name("Password")).sendKeys ("6148");

        Thread.sleep(1000);

        driver.findElement(By.className("btn-success")).click();

        Thread.sleep(1000);
        driver.navigate().to("https://portal.aait.edu.et/Grade/GradeReport/");

        driver.get("https://portal.aait.edu.et/Grade/GradeReport/");

        Thread.sleep(1000);

        String GradeReport = driver.findElement(By.className("table")).getText();
        Thread.sleep(1000);
        try
        {
            FileWriter fw =new FileWriter("/Users/beshir/GradeReport.txt");
            fw.write(GradeReport);
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Success...");
    }

    //driver.quit();


}

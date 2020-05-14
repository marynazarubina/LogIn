import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        driver.manage().window().maximize();

        WebElement signUp = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));
        signUp.click();

        WebElement zipCodeField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        zipCodeField.sendKeys("12345");

        WebElement btnContinue = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        btnContinue.click();

        WebElement firstName = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        firstName.sendKeys("Ivan");

        WebElement lastName = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        lastName.sendKeys("Ivanov");

        WebElement email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        email.sendKeys("ivan@mail.com");

        WebElement password = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        password.sendKeys("159753");

        WebElement confirmPassword = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        confirmPassword.sendKeys("159753");

        WebElement btnRegister = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));
        btnRegister.click();

        WebElement msgAccount = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));

        String text=msgAccount.getText();

        if (msgAccount.isEnabled() && text.contains("Account is created!"))
        {
            System.out.println("Successfully completed");
        }else{
            System.out.println("\"Account is created!\" not found");
        }

        driver.close();
        driver.quit();

    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser5 {
    /**
     * 1. Setup chrome browser.
     * 2. Open URL.
     * 3. Print the title of the page.
     * 4. Print the current url.
     * 5. Print the page source.
     * 6. Click on ‘Sign In’ link
     * 7. Print the current url
     * 8. Enter the email to email field.
     * 9. Enter the password to password field.
     * 10. Click on Login Button.
     * 11. Navigate to baseUrl.
     * 12. Navigate forward to Homepage.
     * 13. Navigate back to baseUrl.
     * 14. Refresh the page.
     * 15. Close the browser.
     */

    public static void main(String[] args) throws InterruptedException {
        String baseurl = "https://courses.ultimateqa.com/"; //I want to open this url

        //Launch the Chrome Browser- then How to create an object of chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the url into browser
        driver.get(baseurl);//or use directly the given url

        //To get the title of a website
        String title = driver.getTitle();
        System.out.println(" The title of the page " + title);

        //Get current url eg. login
        String currenturl = driver.getCurrentUrl();
        System.out.println("The current url : " + currenturl);

        //Get page source
        System.out.println("The source :" + driver.getPageSource());

        //Sign in click
        driver.findElement(By.linkText("Sign In")).click();

        //print the current url back
        System.out.println("Get current url :" + driver.getCurrentUrl());

        //Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com");;

        //Enter the password in a password field
        driver.findElement(By.id("user[password]")).sendKeys("1234");;

        // Assuming the login button has the name 'login'
        driver.findElement(By.className("button")).click();
        //loginButton.click();

        //Navigate to base url
        driver.navigate().to(baseurl);

        //Navigate forward to homepage
        driver.navigate().to(baseurl);

        //Navigate to base url
        driver.navigate().to(baseurl);

        //Refresh the page
        driver.navigate().refresh();

        //Close the browser
        driver.quit();
    }
}

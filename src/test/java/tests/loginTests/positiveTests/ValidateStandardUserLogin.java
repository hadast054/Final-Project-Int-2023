package tests.loginTests.positiveTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateStandardUserLogin {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        String baseUrl = "https://www.saucedemo.com/";
        driver.get(baseUrl);

        String actualUrl = driver.getCurrentUrl();

        if (baseUrl.equals(actualUrl)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();

        //• Validate (using if-else statement) the URL of the page

        String productsPageUrl = "https://www.saucedemo.com/inventory.html";
        actualUrl = driver.getCurrentUrl();

        if(productsPageUrl.equals(actualUrl)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        //Validate (using if-else statement) the title of the page

        String title = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        String expectedTitle = "Products";

        if(title.equals(expectedTitle)){
            System.out.println("title is correct");
        }
        else {
            System.out.println("title is incorrect");
        }

        //Execute the same scenario for other users:

        //test 1

        String baseUrlTest1 = "https://www.saucedemo.com/";
        driver.get(baseUrlTest1);

        String actualUrlTest1 = driver.getCurrentUrl();

        if (baseUrlTest1.equals(actualUrlTest1)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("problem_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();


        String productsPageUrlTest1 = "https://www.saucedemo.com/inventory.html";
        actualUrl = driver.getCurrentUrl();

        if(productsPageUrlTest1.equals(actualUrl)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        //test 2

        String baseUrlTest2 = "https://www.saucedemo.com/";
        driver.get(baseUrlTest2);

        String actualUrlTest2 = driver.getCurrentUrl();

        if (baseUrlTest2.equals(actualUrlTest2)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("performance_glitch_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();


        String productsPageUrlTest2 = "https://www.saucedemo.com/inventory.html";
        actualUrl = driver.getCurrentUrl();

        if(productsPageUrlTest2.equals(actualUrl)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        //test 3

        String baseUrlTest3 = "https://www.saucedemo.com/";
        driver.get(baseUrlTest3);

        String actualUrlTest3 = driver.getCurrentUrl();

        if (baseUrlTest3.equals(actualUrlTest3)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("error_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();


        String productsPageUrlTest3 = "https://www.saucedemo.com/inventory.html";
        actualUrl = driver.getCurrentUrl();

        if(productsPageUrlTest3.equals(actualUrl)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        //test 4

        String baseUrlTest4 = "https://www.saucedemo.com/";
        driver.get(baseUrlTest4);

        String actualUrlTest4 = driver.getCurrentUrl();

        if (baseUrlTest4.equals(actualUrlTest4)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("visual_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();


        String productsPageUrlTest4 = "https://www.saucedemo.com/inventory.html";
        actualUrl = driver.getCurrentUrl();

        if(productsPageUrlTest4.equals(actualUrl)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }


        driver.close();
        driver.quit();
    }
}

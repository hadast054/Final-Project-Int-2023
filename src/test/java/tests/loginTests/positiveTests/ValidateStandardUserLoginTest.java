package tests.loginTests.positiveTests;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateStandardUserLoginTest {

    @Test(testName = "Standard User Login Scenario")
            public void ValidateStandardUserLogin(){

        WebDriver driver = new ChromeDriver();


        String baseUrl = "https://www.saucedemo.com/";
        driver.get(baseUrl);

        String actualUrl = driver.getCurrentUrl();

//        if (baseUrl.equals(actualUrl)){
//            System.out.println("URL is correct");
//        }
//        else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(baseUrl,actualUrl, "The URL is different" );


        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();

        //• Validate (using if-else statement) the URL of the page

        String productsPageUrl = "https://www.saucedemo.com/inventory.html";
        actualUrl = driver.getCurrentUrl();

//        if(productsPageUrl.equals(actualUrl)){
//            System.out.println("URL is correct");
//        }
//        else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(productsPageUrl, actualUrl,"The URL is different." );


        //Validate (using if-else statement) the title of the page

        String title = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        String expectedTitle = "Products";

//        if(title.equals(expectedTitle)){
//            System.out.println("title is correct");
//        }
//        else {
//            System.out.println("title is incorrect");
//        }

        Assert.assertEquals(title, expectedTitle,"The title is different." );


        //Execute the same scenario for other users:

        //test 1

        String baseUrlTest1 = "https://www.saucedemo.com/";
        driver.get(baseUrlTest1);

        String actualUrlTest1 = driver.getCurrentUrl();

//        if (baseUrlTest1.equals(actualUrlTest1)){
//            System.out.println("URL is correct");
//        }
//        else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(baseUrlTest1,actualUrlTest1, "The URL is different" );


        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("problem_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();


        String productsPageUrlTest1 = "https://www.saucedemo.com/inventory.html";
        actualUrl = driver.getCurrentUrl();

//        if(productsPageUrlTest1.equals(actualUrl)){
//            System.out.println("URL is correct");
//        }
//        else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(productsPageUrlTest1, actualUrl,"The URL is different." );


        //test 2

        String baseUrlTest2 = "https://www.saucedemo.com/";
        driver.get(baseUrlTest2);

        String actualUrlTest2 = driver.getCurrentUrl();

//        if (baseUrlTest2.equals(actualUrlTest2)){
//            System.out.println("URL is correct");
//        }
//        else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(baseUrlTest2,actualUrlTest2, "The URL is different" );


        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("performance_glitch_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();


        String productsPageUrlTest2 = "https://www.saucedemo.com/inventory.html";
        actualUrl = driver.getCurrentUrl();

//        if(productsPageUrlTest2.equals(actualUrl)){
//            System.out.println("URL is correct");
//        }
//        else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(productsPageUrlTest2, actualUrl,"The URL is different." );


        //test 3

        String baseUrlTest3 = "https://www.saucedemo.com/";
        driver.get(baseUrlTest3);

        String actualUrlTest3 = driver.getCurrentUrl();

//        if (baseUrlTest3.equals(actualUrlTest3)){
//            System.out.println("URL is correct");
//        }
//        else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(baseUrlTest3,actualUrlTest3, "The URL is different" );


        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("error_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();


        String productsPageUrlTest3 = "https://www.saucedemo.com/inventory.html";
        actualUrl = driver.getCurrentUrl();

//        if(productsPageUrlTest3.equals(actualUrl)){
//            System.out.println("URL is correct");
//        }
//        else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(productsPageUrlTest3, actualUrl,"The URL is different." );


        //test 4

        String baseUrlTest4 = "https://www.saucedemo.com/";
        driver.get(baseUrlTest4);

        String actualUrlTest4 = driver.getCurrentUrl();

//        if (baseUrlTest4.equals(actualUrlTest4)){
//            System.out.println("URL is correct");
//        }
//        else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(baseUrlTest4,actualUrlTest4, "The URL is different" );


        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("visual_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();


        String productsPageUrlTest4 = "https://www.saucedemo.com/inventory.html";
        actualUrl = driver.getCurrentUrl();

//        if(productsPageUrlTest4.equals(actualUrl)){
//            System.out.println("URL is correct");
//        }
//        else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(productsPageUrlTest4, actualUrl,"The URL is different." );



        driver.close();
        driver.quit();
    }
}

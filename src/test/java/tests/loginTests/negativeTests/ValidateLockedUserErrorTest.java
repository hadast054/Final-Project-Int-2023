package tests.loginTests.negativeTests;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateLockedUserErrorTest {

   @Test(testName = "Locked User Error")
           public  void ValidateLockedUserError(){

        WebDriver driver = new ChromeDriver();

        //• Validate (using if-else statement) the text of the error message:


        String baseUrl = "https://www.saucedemo.com/";
        driver.get(baseUrl);

        String actualUrl = driver.getCurrentUrl();

//        if (baseUrl.equals(actualUrl)) {
//            System.out.println("URL is correct");
//        } else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(baseUrl,actualUrl, "The URL is different" );


        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("locked_out_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();


        String textOfErrorMessage = driver.findElement(By.cssSelector("[data-test=\"error\"]")).getText();
        String errorMessage = "Epic sadface: Sorry, this user has been locked out.";

//        if (textOfErrorMessage.equals(errorMessage)) {
//            System.out.println("errorMessage is correct");
//        } else {
//            System.out.println("errorMessage is incorrect");
//        }

        Assert.assertEquals(textOfErrorMessage,errorMessage, "The errorMessage is different" );


        // Execute login scenarios with the following combinations:

        //• username correct + password incorrect


        String baseUrlTest1 = "https://www.saucedemo.com/";
        driver.get(baseUrlTest1);

        String actualUrlTest1 = driver.getCurrentUrl();

//        if (baseUrlTest1.equals(actualUrlTest1)) {
//            System.out.println("URL is correct");
//        } else {
//            System.out.println("URL is incorrect");
//        }

        Assert.assertEquals(baseUrlTest1,actualUrlTest1, "The URL is different" );


        driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("123456");
        driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();

        //• Validate error message (by using an if-else statement) for each one of the scenarios

        //scenario1

        String textOfErrorMessagescenario1 = driver.findElement(By.cssSelector("[data-test=\"error\"]")).getText();
        String errorMessagescenario1= "Epic sadface: Username and password do not match any user in this service";

//        if (textOfErrorMessagescenario1.equals(errorMessagescenario1)) {
//            System.out.println("errorMessage is correct");
//        } else {
//            System.out.println("errorMessage is incorrect");
//        }

            Assert.assertEquals(textOfErrorMessagescenario1,errorMessagescenario1, "The errorMessage is different" );



        //• username incorrect + password correct

            String baseUrlTest2 = "https://www.saucedemo.com/";
            driver.get(baseUrlTest2);

            String actualUrlTest2 = driver.getCurrentUrl();

//            if (baseUrlTest2.equals(actualUrlTest2)) {
//                System.out.println("URL is correct");
//            } else {
//                System.out.println("URL is incorrect");
//            }

            Assert.assertEquals(baseUrlTest2,actualUrlTest2, "The URL is different" );


            driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("hadas");
            driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
            driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();

            //• username incorrect + password incorrect

            String baseUrlTest3 = "https://www.saucedemo.com/";
            driver.get(baseUrlTest3);

            String actualUrlTest3 = driver.getCurrentUrl();

//            if (baseUrlTest3.equals(actualUrlTest3)) {
//                System.out.println("URL is correct");
//            } else {
//                System.out.println("URL is incorrect");
//            }

            Assert.assertEquals(baseUrlTest3,actualUrlTest3, "The URL is different" );


            driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("hadas");
            driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("123456");
            driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();

            //• username empty + password correct

            String baseUrlTest4 = "https://www.saucedemo.com/";
            driver.get(baseUrlTest4);

            String actualUrlTest4 = driver.getCurrentUrl();

//            if (baseUrlTest4.equals(actualUrlTest4)) {
//                System.out.println("URL is correct");
//            } else {
//                System.out.println("URL is incorrect");
//            }

            Assert.assertEquals(baseUrlTest4,actualUrlTest4, "The URL is different" );


            driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("");
            driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
            driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();

        //• Validate error message (by using an if-else statement) for each one of the scenarios

        //scenario2

        String textOfErrorMessagescenario2 = driver.findElement(By.cssSelector("[data-test=\"error\"]")).getText();
        String errorMessagescenario2= "Epic sadface: Username is required";

//        if (textOfErrorMessagescenario2.equals(errorMessagescenario2)) {
//            System.out.println("errorMessage is correct");
//        } else {
//            System.out.println("errorMessage is incorrect");
//        }

            Assert.assertEquals(textOfErrorMessagescenario2,errorMessagescenario2, "The errorMessage is different" );



        //• username correct + password empty

            String baseUrlTest5 = "https://www.saucedemo.com/";
            driver.get(baseUrlTest5);

            String actualUrlTest5 = driver.getCurrentUrl();

//            if (baseUrlTest5.equals(actualUrlTest5)) {
//                System.out.println("URL is correct");
//            } else {
//                System.out.println("URL is incorrect");
//            }

            Assert.assertEquals(baseUrlTest5,actualUrlTest5, "The URL is different" );


            driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");
            driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("");
            driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();

        //• Validate error message (by using an if-else statement) for each one of the scenarios

        //scenario3

        String textOfErrorMessagescenario3 = driver.findElement(By.cssSelector("[data-test=\"error\"]")).getText();
        String errorMessagescenario3= "Epic sadface: Password is required";

//        if (textOfErrorMessagescenario3.equals(errorMessagescenario3)) {
//            System.out.println("errorMessage is correct");
//        } else {
//            System.out.println("errorMessage is incorrect");
//        }

          Assert.assertEquals(textOfErrorMessagescenario3,errorMessagescenario3, "The errorMessage is different" );



        //• username empty + password empty

            String baseUrlTest6 = "https://www.saucedemo.com/";
            driver.get(baseUrlTest6);

            String actualUrlTest6 = driver.getCurrentUrl();

//            if (baseUrlTest6.equals(actualUrlTest6)) {
//                System.out.println("URL is correct");
//            } else {
//                System.out.println("URL is incorrect");
//            }

             Assert.assertEquals(baseUrlTest6,actualUrlTest6, "The URL is different" );


            driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("");
            driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("");
            driver.findElement(By.cssSelector("[data-test=\"login-button\"]")).click();








            driver.close();
            driver.quit();

        }
    }


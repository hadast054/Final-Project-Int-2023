package tests.sanityTests;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanityScenario {
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

        driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-onesie']")).click();

        //Validate the cart icon presents a correct number of items (2).

        WebElement ShoppingCartBadge = driver.findElement(By.cssSelector("[class='shopping_cart_badge']"));

        int actualNumberOfItem = Integer.parseInt(ShoppingCartBadge.getText());
        int expectedNumberOfItem = 2;

        if(actualNumberOfItem == expectedNumberOfItem) {
            System.out.println("The number of item is correct");
        }
        else {
            System.out.println("The number of item is incorrect");
        }

        ShoppingCartBadge.click();

        //Validate shopping Cart page URL

        String shoppingCartUrl = "https://www.saucedemo.com/cart.html";
        actualUrl = driver.getCurrentUrl();

        if(shoppingCartUrl.equals(actualUrl)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        //Validate shopping Cart page title:

        String yourCartTitle = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        String expectedTitleOfShoppingCart = "Your Cart";

        if(yourCartTitle.equals(expectedTitleOfShoppingCart)){
            System.out.println("title is correct");
        }
        else {
            System.out.println("title is incorrect");
        }

        //Validate a correct number of items (2)

        //Assert.assertEquals(actualNumberOfItems, expectedNumberOfItems, "Number of Items is different.");






        driver.findElement(By.cssSelector("[data-test='checkout']")).click();

        //Validate your Information Page URL

        String  yourInformationPageUrl = "https://www.saucedemo.com/checkout-step-one.html";
        actualUrl = driver.getCurrentUrl();

        if(yourInformationPageUrl.equals(actualUrl)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        //Validate your Information page title

        String InformationPageTitle = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        String expectedTitleOfInformationPage = "Checkout: Your Information";

        if(InformationPageTitle.equals(expectedTitleOfInformationPage)){
            System.out.println("title is correct");
        }
        else {
            System.out.println("title is incorrect");
        }

        driver.findElement(By.cssSelector("[data-test=\"firstName\"]")).sendKeys("hadas");
        driver.findElement(By.cssSelector("[data-test=\"lastName\"]")).sendKeys("zabahon");
        driver.findElement(By.cssSelector("[data-test=\"postalCode\"]")).sendKeys("8445316");
        driver.findElement(By.cssSelector("[data-test=\"continue\"]")).click();

        //Validate overview Page URL

        String  overviewPageUrl = "https://www.saucedemo.com/checkout-step-two.html";
        actualUrl = driver.getCurrentUrl();

        if(overviewPageUrl.equals(actualUrl)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        //Validate overview Page title

        String overviewTitle = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        String expectedTitleOfOverviewPage = "Checkout: Overview";

        if(overviewTitle.equals(expectedTitleOfOverviewPage)){
            System.out.println("title is correct");
        }
        else {
            System.out.println("title is incorrect");
        }

        driver.findElement(By.cssSelector("[data-test=\"finish\"]")).click();

        //Validate complete Page URL

        String  completePageUrl = "https://www.saucedemo.com/checkout-complete.html";
        actualUrl = driver.getCurrentUrl();

        if(completePageUrl.equals(actualUrl)){
            System.out.println("URL is correct");
        }
        else {
            System.out.println("URL is incorrect");
        }

        //Validate complete Page title

        String completePageTitle = driver.findElement(By.cssSelector("[class=\"title\"]")).getText();
        String expectedTitleOfCompletePage = "Checkout: Complete!";

        if(completePageTitle.equals(expectedTitleOfCompletePage)){
            System.out.println("title is correct");
        }
        else {
            System.out.println("title is incorrect");
        }

        //• Validate a text of each one of the presented messages

        String completeHeader = driver.findElement(By.cssSelector("[class=\"complete-header\"]")).getText();
        String expectedCompleteHeader = "Thank you for your order!";

        if(completeHeader.equals(expectedCompleteHeader)){
            System.out.println("The text is correct");
        }
        else {
            System.out.println("The text is incorrect");
        }

        //• Validate a text of each one of the presented messages

        String completeText = driver.findElement(By.cssSelector("[class=\"complete-text\"]")).getText();
        String expectedCompleteText = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";

        if(completeText.equals(expectedCompleteText)){
            System.out.println("The text is correct");
        }
        else {
            System.out.println("The text is incorrect");
        }




        driver.close();
        driver.quit();
    }

}

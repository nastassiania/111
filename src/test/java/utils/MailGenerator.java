package utils;

import com.github.javafaker.Faker;
import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class MailGenerator {

//    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
//    private Waiter waiter = new Waiter();
//
//    public String getTemporaryEmail(){
//        driver.get("https://temprmail.com/");
//        waiter.waitVisibilityOfElementLocated("//input[@class='w-full block border border-gray-100 shadow-sm text-2xl md:text-3xl text-center rounded px-3 py-3 mb-3']", "");
//        driver.findElement(By.xpath("//button[@title='Copy email address']")).click();
//        String tempEmail = Keys.CONTROL + "v";
//        return tempEmail;
//    }

    public static String getTemporaryEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

}

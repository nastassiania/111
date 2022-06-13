package utils;

import driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MailGenerator {

    public static String getTemporaryEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }
}

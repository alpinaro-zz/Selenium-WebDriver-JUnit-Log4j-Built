package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.AmazonPages;
import utilities.Base;
import utilities.Driver;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class Sample01Amazon extends Base {

    AmazonPages amazon = new AmazonPages();

    @Test
    @Order(1)
    void isTitleContains() {

        String expectedTitle = "Amazon";
        String actualTitle = Driver.getDriver().getTitle();

        Assertions.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Test
    @Order(2)
    void isSearchBoxEnabled() {

        Assertions.assertTrue(amazon.searchBox.isEnabled());
    }

    @Test
    @Order(3)
    void search() {

        String keyword = "java";
        amazon.searchBox.sendKeys(keyword + Keys.ENTER);

        String expectedResult = keyword;
        String actualResult = amazon.searchResult.getText();

        Assertions.assertTrue(actualResult.contains(expectedResult));
    }
}
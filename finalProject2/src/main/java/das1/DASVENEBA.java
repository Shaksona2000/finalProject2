package das1;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class DASVENEBA {

    public void hovr() {
        $("#body > div.container-fluid.menu-outer > div > div > nav > ul > li.cat-2.cat").hover();

    }

    public void ski() {
        $("#body > div.container-fluid.menu-outer > div > div > nav > ul > li.cat-2.cat > div > div > ul > li:nth-child(14) > a").click();

    }

    public void price() {


        SelenideElement elem2 = $("#sidebar > div > div > div > section > div > div.price-filter");

        elem2.shouldBe(visible).scrollIntoView(true);
    }

    public void minMAx() {
        $("#sidebar > div > div > div > section > div > div.price-filter > div").find(By.id("minprice")).sendKeys("0");
        $("#sidebar > div > div > div > section > div > div.price-filter > div").find(By.id("maxprice")).sendKeys("100");
    }

    public void serch() {
        $("#sidebar > div > div > div > section > div > div.submit-form > div.submit-button").click();

    }

    public void check() {
        $(".deal-voucher-price").scrollTo();
        SelenideElement elem = $(".items").find(By.className("special-offer")).find(By.className("deal-description")).find(By.className("voucher-counts")).find(By.className("outs-and-shorts"))
                .find(By.className("discounted-prices")).find(By.className("deal-voucher-price"));
        elem.getText();
        String a = elem.getText();
       int z= Integer.parseInt(a.substring(0,2));


        int b = 100;

        if (b > z) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }
}
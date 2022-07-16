package gartoba;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class gart {
    public void click1(){
        $("#body > div.container-fluid.menu-outer > div > div > nav > ul > li.cat-5.cat > a > label").click();
    }
    public void image(){
        $$(".special-offer").first().click();
    }
    public void img(){
        $("#body > section.container-fluid.detailed__background > div:nth-child(5) > div > div.col-6.main-img").click();
    }
    public void last(){
        SelenideElement elem = $(".lb-number");
        int ele= 16;
        int n=0;
        while (elem.isEnabled()){
            $(".lb-next").click();
            n++;
            System.out.println(elem.getText());
            if(n ==ele){
                break;
            }

        }
    }
}

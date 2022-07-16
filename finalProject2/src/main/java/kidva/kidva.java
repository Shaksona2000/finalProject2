package kidva;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class kidva {
    public void kveba(){
        $("#body > div.container-fluid.menu-outer > div > div > nav > ul > li.cat-3.cat > a").click();
    }
    public void first(){
        $$(".special-offer ").first().click();
    }
    public void count(){
        $(".checkout__button").scrollTo();
      SelenideElement elem= $(".details-voucher-price");
//        $("#body").find(By.className(".container-fluid detailed__background")).find(By.className(".container")).find(By.className(".row"))
//                .find(By.className(".col-3")).find(By.className(".right__side")).find(By.className(".amount-box")).find(By.className(".detailed__basket")).find(By.className(".amount-box")).find(By.className(".amount-box-button amount-box-add")).click();
          $("#body > section.container-fluid.detailed__background > div:nth-child(6) > div > div.col-3 > div > div.detailed__basket > div.amount-box > button.amount-box-button.amount-box-add").click();
         SelenideElement ele=  $(".details-voucher-price");
      int elem1= Integer.parseInt(elem.getText());
      int ele1 = Integer.parseInt(ele.getText());
        if (ele1== 2* elem1){
            System.out.println("correct");
        }else {
            System.out.println("incorrect");
        }

    }
    public void price(){
        $(".checkout__button").click();
       SelenideElement element= $(".totals__value");
       SelenideElement ele=$(".basket-item__price");
       String ele1 =ele.getText();

       int a= Integer.parseInt(ele1.substring(0,2));
       if(a==2 && a==50){
           System.out.println("correct");
       }else{
           System.out.println("incorrect");
       }
       $(".basket-sidebar").find(By.className(".totals")).find(By.className(".totals__button")).click();

    }

}

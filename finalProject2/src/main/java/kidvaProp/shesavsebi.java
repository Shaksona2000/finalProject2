package kidvaProp;

import com.codeborne.selenide.Condition;
import com.sun.jna.Structure;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;

public class shesavsebi {
    public void registration(){
        $(".profile-tabs__item ui-state-default ui-corner-top ui-tabs-active ui-state-active").click();
    }
    public void iuridiuli(){
        $(".profile-tabs__item ui-state-default ui-corner-top ui-tabs-active ui-state-active").find(By.className(".profile-tabs__link")).click();

    }
    public void kompania(String text){

        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText(" კომპანიის დასახელება")).sendKeys(text);
    }
    public void IDcode(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("საიდენთიფიკაციო კოდი")).sendKeys(a);
    }

    public void address(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("მისამართი")).sendKeys(a);
    }
    public void city(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("ქალაქი")).scrollTo().sendKeys(a);
    }
    public  void posta(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("საფოსტო ინდექსი")).scrollTo().sendKeys(a);
    }
    public void www(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("ვებ-გვერდის მისამართი")).scrollTo().sendKeys(a);

    }
    public void bank(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("ბანკი")).scrollTo().sendKeys(a);
    }
    public void BAGAGE(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("საბანკო ანგარიში")).scrollTo().sendKeys(a);
    }
    public void email(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("ელ-ფოსტა")).scrollTo().sendKeys(a);
    }
    public void password(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("პაროლი")).scrollTo().sendKeys(a);
    }
    public  void repassword(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("დაადასტურე პაროლი")).scrollTo().sendKeys(a);
    }
    public void Name(String text){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("სახელი გვარი")).scrollTo().sendKeys(text);
    }
    public void gender( ){
        $(".dashbord-mail dashbord-five-margin dashbord-fifteen-margin").find(By.className("mail-input dashbord-input-style"), 1).scrollTo();
    }
    public void date(String a){
        $(".dashbord-mail dashbord-five-margin dashbord-fifteen-margin").find(By.className(".birthday-picker mail-input")).scrollTo().sendKeys(a);
    }
    public void ID(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("პირადი ნომერი")).scrollTo().sendKeys(a);
    }
    public void mobile(String a){
        $(".dashbord-mail ").find(By.className(".mail-input")).find(By.partialLinkText("ტელეფონის ნომერი")).scrollTo().sendKeys(a);
    }
    public void click(){
        $(byValue("რეგისტრაცია"));
    }
    public void exeption(){
        $("physicalInfoMassage").shouldBe(Condition.appear);
    }

}

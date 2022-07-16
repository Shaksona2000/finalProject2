
import com.codeborne.selenide.Configuration;
import das1.DASVENEBA;
import das_act.act;
import gartobaACt.gartact;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import kidva.kidva;
import kidvaSteps.kidvaSteps;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.open;
@Listeners({ screenshot.screenshots.class })
@Epic("Regression Tests")
@Feature("swoop Tests")
public class mainclass {
    act actt=new act();


    public  mainclass(){

       // Configuration.baseUrl="https://www.swoop.ge/";
        Configuration.timeout=20000;
        Configuration.browserSize="2000x1080";
        WebDriverManager.chromedriver().setup();
    }
    @Description("Test description:first task ")

    @Severity(SeverityLevel.NORMAL)
    @Story("checking filters")
    @Test(groups = {"Resgression1"})
    public void dasveneba(){

        open("https://www.swoop.ge/");
        actt.hov()
                .clck()
                .prc()
                .prcmin()
                .srch()
                .check();
    }
    @Description("Test description: task2 ")

    @Severity(SeverityLevel.NORMAL)
    @Story("cheking food sector")
    @Test(groups = {"Resgression1"})
    public void gartoba(){
        open("https://www.swoop.ge/");
        gartact gartoba= new gartact();
            gartoba.firstMOve()
                    .secondMove()
                    .thirdMove()
                    .fourthMove();
    }
    @Description("Test description: registration ")

    @Severity(SeverityLevel.NORMAL)
    @Story("checking registrtion parameters")
    @Test(groups = {"Resgression2"})
    public void kidva() throws SQLException {
        open("https://www.swoop.ge/");

        kidvaSteps kid= new kidvaSteps();
        kid.click()
                .click2()
                .click3()
                .click4()
                .click5();
    }
}

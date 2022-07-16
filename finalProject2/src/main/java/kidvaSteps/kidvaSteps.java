package kidvaSteps;

import io.qameta.allure.Step;
import kidva.kidva;
import kidvaProp.emali;
import kidvaProp.shesavsebi;
import kidvaSteps.kidreg.kidvaregistration;

import java.sql.SQLException;

public class kidvaSteps {

    kidva kid = new kidva();
    emali em=new emali();
    shesavsebi shes= new shesavsebi();
    kidvaregistration regg= new kidvaregistration();

    @Step
    public kidvaSteps click() {
        kid.kveba();
        return this;
    }

    @Step
    public kidvaSteps click2() {
        kid.first();
        return this;
    }

    @Step
    public kidvaSteps click3() {
        kid.count();
        return this;
    }
    @Step
    public kidvaSteps click4(){
        kid.price();
        return this;
    }
    @Step
    public  kidvaSteps click5() throws SQLException {

regg.reg();
        return this;
    }

}
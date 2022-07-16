package das_act;

import das1.DASVENEBA;
import io.qameta.allure.Step;

public class act {
    DASVENEBA das= new DASVENEBA();
    @Step
    public act hov(){
        das.hovr();
        return this;
    }
    @Step
    public act clck(){
        das.ski();
        return this;
    }
    @Step
    public act prc(){
        das.price();
        return this;
    }
    @Step
    public act prcmin(){
        das.minMAx();
        return this;
    }
    @Step
    public act srch(){
        das.serch();
        return this;
    }
    @Step
    public act check(){
        das.check();
        return this;
    }
}

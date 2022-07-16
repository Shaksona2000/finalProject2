package gartobaACt;

import gartoba.gart;
import io.qameta.allure.Step;

public class gartact {
    gart gartt=new gart();
    @Step
    public gartact firstMOve(){
       gartt.click1();
       return this;
    }
    @Step
    public gartact secondMove(){
        gartt.image();
        return this;
    }
    @Step
    public gartact thirdMove(){
        gartt.img();
        return this;
    }
    @Step
    public gartact fourthMove(){
        gartt.last();
        return this;
    }
}

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class screenshot {
    public class screenshots  implements ITestListener {
        private static String GetTestMethodName(ITestResult ITestresult){
            return ITestresult.getMethod().getConstructorOrMethod().getName();

        }
        @Attachment(value="Take screenshot", type = "image/png")
        public byte[] saveScreenShootPNG(WebDriver driver){
            return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

        }
        @Attachment(value = "{0}",type = "text/plain")
        public static String saveTextLog(String message){
            return message;
        }
        @Override
        public void onTestFailure(ITestResult iTestResult) {
            Object Testclass = iTestResult.getInstance();

            WebDriver driver = ((mainclass)Testclass ).getDriver;
            if (driver != null) {
                System.out.println("Screenshot captured for test case:" + GetTestMethodName(iTestResult));
                saveScreenShootPNG(driver);
            }


        }
    }
}

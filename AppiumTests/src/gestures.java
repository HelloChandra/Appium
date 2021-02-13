import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class gestures extends base 
{

	public static void main(String[] args) throws MalformedURLException 
	{
		 AndroidDriver<AndroidElement>	driver=Capabilities();  
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		 TouchAction t=new TouchAction(driver);
		 WebElement expandList=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		 t.tap(tapOptions().withElement(element(expandList))).perform();
		 driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		 WebElement peoplenames=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		 t.longPress(longPressOptions().withElement(element(peoplenames)).withDuration(ofSeconds(2))).release().perform();
		 System.out.println(driver.findElementById("android:id/title").isDisplayed());
		 
		 
		 
		 
		 }

}

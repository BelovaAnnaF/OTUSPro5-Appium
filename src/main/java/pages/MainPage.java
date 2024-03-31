package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import jakarta.inject.Inject;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends AbsBasePage<MainPage>{
    private SelenideElement dwaitDownloadMainPage = $("[text = 'Chat to improve your English']");

}
//android.widget.TextView[@text="Chat to improve your English"]
//android.widget.TextView[@text="Next"]
//android.widget.TextView[@text="Learn new words and grammar"]
//android.widget.TextView[@text="7 days FREE"]
//android.widget.TextView[@text="Skip >"]
//android.widget.TextView[@resource-id="android:id/message"]
//android.widget.Button[@resource-id="android:id/button1"]
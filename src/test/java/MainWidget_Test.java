import extensions.AndroidExtension;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;

@ExtendWith(AndroidExtension.class)
public class MainWidget_Test {
    @Inject
    private MainPage mainPage;
    @Test
    public void navigationMainPageWidget() {
        mainPage.open();
    }
}

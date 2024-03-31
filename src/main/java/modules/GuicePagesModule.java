package modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import pages.MainPage;

public class GuicePagesModule extends AbstractModule {

    @Provides
    public MainPage getMainPage() {
        return new MainPage();
    }

}

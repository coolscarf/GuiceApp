package simpleexample;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class GuiceModule extends AbstractModule {

    private String configItem;
    private final String fooServerAddress;

    public GuiceModule(String configItem, String fooServerAddress) {
        this.configItem = configItem;
        this.fooServerAddress = fooServerAddress;
    }

    protected void configure() {
        bind(Config.class).toInstance(new Config(this.configItem));

        //with this annotation - any class in the graph can use this
        bindConstant().annotatedWith(FooServerAddress.class).to(fooServerAddress);
    }
}

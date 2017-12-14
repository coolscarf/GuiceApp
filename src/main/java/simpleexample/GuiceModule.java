package simpleexample;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

public class GuiceModule extends AbstractModule {

    private String configItem;
    private final String fooServerAddress;
    private String myNamedPort;

    public GuiceModule(String configItem, String fooServerAddress, String myNamedPort) {
        this.configItem = configItem;
        this.fooServerAddress = fooServerAddress;
        this.myNamedPort = myNamedPort;
    }

    protected void configure() {
        bind(Config.class).toInstance(new Config(this.configItem));

        //any class in the graph can use these
        bindConstant().annotatedWith(FooServerAddress.class).to(this.fooServerAddress);  // <-- requires 'FooServerAddress' interface file to be defined
        bindConstant().annotatedWith(Names.named("MyNamedPort")).to(this.myNamedPort);   // <-- simpler - no interface file
    }
}

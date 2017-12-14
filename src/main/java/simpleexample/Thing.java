package simpleexample;

import com.google.inject.Inject;

public class Thing {

    private final Config config;
    private final ServiceOne serviceOne;
    private final SetterInjectionExample setterInjectionExample;
    private final String fooServerAddress;

    @Inject
    public Thing(Config config, ServiceOne serviceOne, SetterInjectionExample setterInjectionExample, @FooServerAddress String fooServerAddress) {
        this.config = config;
        this.serviceOne = serviceOne;
        this.setterInjectionExample = setterInjectionExample;
        this.fooServerAddress = fooServerAddress;
    }

    public String configUrl() {
        return config.getUrl();
    }

    public String getServiceOne() {
        return serviceOne.toString();
    }

    public String getSetterInjectionExample() {
        return setterInjectionExample.getRandoObj();
    }

    public String getFooServerAddress() {
        return fooServerAddress;
    }
}

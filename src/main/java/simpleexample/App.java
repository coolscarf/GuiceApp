package simpleexample;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class App {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new GuiceModule("somevalue", "https://server.address"));

        // Thing can be instantiated like this
        // because it's constructor is annotated with @Inject
        Thing thing = injector.getInstance(Thing.class);

        String url = thing.configUrl();
        System.out.println(url);

        String s1 = thing.getServiceOne();
        System.out.println(s1);

        String sie = thing.getSetterInjectionExample();
        System.out.println(sie);

        String fooServerAddress = thing.getFooServerAddress();
        System.out.println(fooServerAddress);
    }
}

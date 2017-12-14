package simpleexample;

import com.google.inject.Inject;

public class SetterInjectionExample {

    @Inject
    RandoObj randoObj;    // <-- Setter Injection

    public String getRandoObj() {
        return randoObj.toString();
    }
}

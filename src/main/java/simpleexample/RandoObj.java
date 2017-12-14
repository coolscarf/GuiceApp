package simpleexample;

import com.google.inject.Inject;

public class RandoObj {

    private final String fooServerAddress;

    @Inject
    public RandoObj(@FooServerAddress String fooServerAddress) {
        this.fooServerAddress = fooServerAddress;
    }

    @Override
    public String toString() {
        return "I'm a RandoObj " + this.fooServerAddress;
    }
}

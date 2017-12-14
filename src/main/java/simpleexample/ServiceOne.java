package simpleexample;

import com.google.inject.Inject;

public class ServiceOne {

    private final SubService subService;

    @Inject
    public ServiceOne(SubService subService) {
        this.subService = subService;
    }

    @Override
    public String toString() {
        return "I am a ServiceOne";
    }
}

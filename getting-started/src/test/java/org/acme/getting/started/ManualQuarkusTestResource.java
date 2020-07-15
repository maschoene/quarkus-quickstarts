package org.acme.getting.started;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import java.util.Map;

public class ManualQuarkusTestResource implements QuarkusTestResourceLifecycleManager {
    @Override
    public Map<String, String> start() {
        // Manual steps needed before this test resource is used, throws exception if not executed.
        throw new RuntimeException("manual steps not executed");
    }

    @Override
    public void stop() {
    }
}

package org.acme.getting.started;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import java.util.Map;

public class GreetingResourceTestResourceLifecycleManager implements QuarkusTestResourceLifecycleManager {
    @Override
    public Map<String, String> start() {
        return Map.of("config.arbitrary.manager", "manager");
    }

    @Override
    public void stop() {

    }
}

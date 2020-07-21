package org.acme.getting.started;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CustomQuarkusTestResourceLifecycleManager implements QuarkusTestResourceLifecycleManager {

    @Override
    public Map<String, String> start() {
        LoggerFactory.getLogger(CustomQuarkusTestResourceLifecycleManager.class).error("Recvd error, throwing RTE");
        throw new RuntimeException("RTE");
    }

    @Override
    public void stop() {
    }
}

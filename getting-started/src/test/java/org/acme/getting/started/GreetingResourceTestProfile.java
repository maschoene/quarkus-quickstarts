package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTestProfile;

import java.util.Map;

public class GreetingResourceTestProfile implements QuarkusTestProfile {
    @Override
    public Map<String, String> getConfigOverrides() {
        return Map.of("config.arbitrary.codeprofile", "codeprofile");
    }
}

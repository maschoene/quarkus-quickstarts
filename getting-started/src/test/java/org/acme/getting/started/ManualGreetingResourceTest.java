package org.acme.getting.started;

import io.quarkus.test.common.QuarkusTestResource;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

// Manual test, some preparation needed, uses some QuarkusTestResource.
@QuarkusTestResource(ManualQuarkusTestResource.class)
@Tag("manual")
public class ManualGreetingResourceTest {
    @Test
    public void test(){
        // No errors, hooray!
    }
}

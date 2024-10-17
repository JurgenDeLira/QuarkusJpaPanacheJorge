package org.agoncal.quarkus.panache;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import org.agoncal.quarkus.panache.repository.PublisherRepositoryTest;

@QuarkusIntegrationTest
class PublisherRepository extends PublisherRepositoryTest {
    // Execute the same tests but in packaged mode.
}

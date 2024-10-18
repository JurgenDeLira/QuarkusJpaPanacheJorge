package org.agoncal.quarkus.panache.repository;

import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.agoncal.quarkus.jdbc.Artist;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class ArtistRepositoryTest {

    @Inject
    ArtistRepository repository;

    @Test
    @TestTransaction
    public void shouldCreateAndFindAnArtist() throws SQLException {
        Artist artist = new Artist("name", "bio");

        repository.persist(artist);
        assertNotNull(artist.getId());

        artist = repository.findById(artist.getId());
        assertEquals("name", artist.getName());
    }
}
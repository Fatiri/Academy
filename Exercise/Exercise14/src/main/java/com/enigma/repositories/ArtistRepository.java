package com.enigma.repositories;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository <Artist, Integer> {

}

package com.yasmeen.lookify.repositories;

import org.springframework.data.repository.CrudRepository;

import com.yasmeen.lookify.models.Song;

public interface LookifyRepository extends CrudRepository<Song, Long>{

}

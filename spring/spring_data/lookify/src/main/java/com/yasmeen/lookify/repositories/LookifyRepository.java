package com.yasmeen.lookify.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yasmeen.lookify.models.Song;

@Repository
public interface LookifyRepository extends CrudRepository<Song, Long>{

}

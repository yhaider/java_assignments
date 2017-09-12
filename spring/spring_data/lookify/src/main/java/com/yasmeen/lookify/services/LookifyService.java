package com.yasmeen.lookify.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yasmeen.lookify.models.Song;
import com.yasmeen.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {

	private LookifyRepository lookifyRepository;
	
	public LookifyService(LookifyRepository lookifyRepository) {
		this.lookifyRepository = lookifyRepository;
	}
	// Initializing the Lookify repository
	
	
	public List<Song> getAll(){
		return (List<Song>) lookifyRepository.findAll();
	}
	// This grabs all the songs and returns them as a list
	
	public Song getOne(Long id) {
		return lookifyRepository.findOne(id);
	}
	// This grabs one song based on id
	
	public void addSong(Song song) {
		lookifyRepository.save(song);
	}
	// This adds a song
	
	public void updateSong(Song song) {
		lookifyRepository.save(song);
	}
	// This updates and saves a song to the database
	
	public void deleteSong(Long id) {
		lookifyRepository.delete(id);
	}
	// This deletes a song from the database
	// based on the id
	
	public List<Song> topTen(){
		ArrayList<Song> songs = (ArrayList<Song>) lookifyRepository.findAll();
		Collections.sort(songs, Comparator.comparingInt(Song::getRating).reversed());
		for(int i = 0; i < songs.size(); i++) {
			if(i > 9) {
				songs.remove(i);
			}
		}
		return songs;
	}
	// This grabs the top ten songs 
}

package com.lavender.service;

import com.lavender.domain.Album;
import com.lavender.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    AlbumRepository albumRepository;

    public List<Album> findAlbums(){
        return albumRepository.findAll();
    }


    public List<Album> findByAlbumName(String albumName){
        return albumRepository.findAlbumsByAlbumName(albumName);
    }
}

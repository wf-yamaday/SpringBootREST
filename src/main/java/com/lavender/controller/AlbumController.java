package com.lavender.controller;

import com.lavender.domain.Album;
import com.lavender.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlbumController {

    @Autowired
    AlbumService albumService;

    @GetMapping(value = "/albums")
    @Transactional
    public List<Album> getAlbums(){
        return albumService.findAlbums();
    }

}

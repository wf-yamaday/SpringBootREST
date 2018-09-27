package com.lavender.repository;

import com.lavender.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album,Integer>{
    List<Album> findAlbumsByAlbumName(String albumName);
}

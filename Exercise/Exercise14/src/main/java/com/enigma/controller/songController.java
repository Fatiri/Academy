package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repositories.ArtistRepository;
import com.enigma.repositories.SongRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.swing.text.View;
import java.util.List;

@Controller
public class songController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    ArtistRepository artistRepository;

    @GetMapping("/song")
    public String goToSong(Model model){
        List<Song> songs = songRepository.findAll();
        model.addAttribute("listSong",songs);
        return "song/song-view";
    }
    @GetMapping("/save-song")
    public ModelAndView addSong(Model model){
        List<Artist> artists = artistRepository.findAll();
        model.addAttribute("artisan",artists);
        return new ModelAndView("song/song-form","song", new Song());
    }

    @PostMapping("/save-song")
    public String songSave(@ModelAttribute("song") Song song, Model model){
      songRepository.save(song);
       return "redirect:/song";
    }

    @GetMapping("/song-form")
    public ModelAndView songDetail(@RequestParam Integer id, Model model){
        Song songs = songRepository.getOne(id);
        model.addAttribute("detailSong",songs);

        return new ModelAndView("song/song-form","songs", songs);
    }



}

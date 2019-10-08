package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class artistController {

    @Autowired
    ArtistRepository artistRepository;

    @GetMapping ("/artist")
    public String gotoArtist(Model model){

        List<Artist> artists = artistRepository.findAll();
        model.addAttribute("artistList", artists);
        return "artist/artist-view";
    }

    @GetMapping("/add-form")
    public ModelAndView gotoFormArtist(){

        return new ModelAndView("artist/artis-form","artist", new Artist());
    }

    @PostMapping("/add-form")
    public String addArtist(@ModelAttribute("artist") Artist artist, Model model){

        artistRepository.save(artist);
        return "redirect:/artist";
    }

    @GetMapping("/get-artist")
    public ModelAndView getById(@RequestParam Integer id, Model model){

        Artist artists = artistRepository.getOne(id);
        model.addAttribute("artist", artists);
        return new ModelAndView("artist/artis-form","artist", artists);
    }
}

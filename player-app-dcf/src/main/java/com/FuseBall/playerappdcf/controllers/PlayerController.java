package com.FuseBall.playerappdcf.controllers;


import com.FuseBall.playerappdcf.entity.Player;
import com.FuseBall.playerappdcf.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerRepo playerRepo;

    @PostMapping
    public Player addPlayer(@RequestBody Player player){
        return playerRepo.save(player);
    }

    @GetMapping("/{name}")
    public List<Player> getPlayer(@PathVariable("name") String name){
        return playerRepo.findByName(name);
    }
}

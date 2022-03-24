package com.FuseBall.playerappdcf.controllers;


import com.FuseBall.playerappdcf.entity.Player;
import com.FuseBall.playerappdcf.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("players")
public class PlayerController {

    @Autowired
    private PlayerRepo playerRepo;

    @PostMapping
    public Player addPlayer(@RequestBody Player player){
        return playerRepo.save(player);
    }

    @GetMapping("/{jerseyNum}")
    public Player getPlayer(@PathVariable("jerseyNum") Integer jerseyNum){
        return playerRepo.findById(jerseyNum).get();
    }
}

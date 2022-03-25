package com.FuseBall.playerappdcf.repository;

import com.FuseBall.playerappdcf.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PlayerRepo extends JpaRepository<Player, Integer> {
    List<Player> findByName(String name);
}

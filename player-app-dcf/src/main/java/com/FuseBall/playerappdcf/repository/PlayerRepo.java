package com.FuseBall.playerappdcf.repository;

import com.FuseBall.playerappdcf.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player, Integer> {
}

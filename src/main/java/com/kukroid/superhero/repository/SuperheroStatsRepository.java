package com.kukroid.superhero.repository;

import com.kukroid.superhero.entity.SuperheroStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperheroStatsRepository extends JpaRepository<SuperheroStats, Integer> {

}

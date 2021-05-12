package com.kukroid.superhero.controller;

import com.kukroid.superhero.dao.Hero;
import com.kukroid.superhero.dao.TestSuperHero;
import com.kukroid.superhero.entity.Superhero;
import com.kukroid.superhero.entity.SuperheroStats;
import com.kukroid.superhero.repository.SuperheroRepository;
import com.kukroid.superhero.repository.SuperheroStatsRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperheroController {

  @Autowired
  private SuperheroRepository repository;

  @Autowired
  private SuperheroStatsRepository statsRepository;

  @GetMapping("/gethero/all")
  public List<TestSuperHero> getSuperheroes() {

    List<Superhero> superheroList = repository.findAll();
    List<TestSuperHero> testSuperHeroList = new ArrayList<>();
    for (Superhero superhero : superheroList) {
      Hero hero = new Hero();
      hero.setAge(0);
      hero.setId(superhero.getId());
      hero.setName(superhero.getName());
      TestSuperHero testSuperHero = new TestSuperHero(hero);
      testSuperHeroList.add(testSuperHero);
    }
    return testSuperHeroList;
  }

  @GetMapping("/gethero/stats/{id}")
  public void getSuperHeroStats(@PathVariable int id) {
    Optional<SuperheroStats> superheroStats = statsRepository.findById(id);
    System.out.println("********** :" + superheroStats.get());
  }
}

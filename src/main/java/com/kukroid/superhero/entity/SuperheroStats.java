package com.kukroid.superhero.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "superhero_stats")
public class SuperheroStats {

  @Id
  @GeneratedValue
  private int stats_id;

  private int superhero_id;

  private int intelligence;

  public SuperheroStats() {

  }

  public SuperheroStats(int stats_id, int intelligence) {
    this.stats_id = stats_id;
    this.intelligence = intelligence;
  }


  public int getStats_id() {
    return stats_id;
  }

  public void setStats_id(int stats_id) {
    this.stats_id = stats_id;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }
}

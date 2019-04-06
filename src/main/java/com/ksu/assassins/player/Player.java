package com.ksu.assassins.player;

public class Player {

  private String name;
  private Player target;
  private boolean isDead;

  public Player() {
    this.name = "";
    this.target = null;
    this.isDead = false;
  }

  public Player(String name, Player target, boolean isDead) {
    this.name = name;
    this.target = target;
    this.isDead = isDead;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Player getTarget() {
    return target;
  }

  public void setTarget(Player target) {
    this.target = target;
  }

  public boolean isDead() {
    return isDead;
  }

  public void setDead(boolean dead) {
    isDead = dead;
  }

  @Override
  public String toString() {
    return "Player{" +
        "name='" + name + '\'' +
        ", target=" + target +
        ", isDead=" + isDead +
        '}';
  }
}

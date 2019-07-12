public class Hero extends Creature {
  private int gainedExp;

  public Hero(String name, int hp, int attack, int ac, int damage, int gainedExp) {
    super(name, hp, attack, ac, damage);
    this.gainedExp = gainedExp;
  }

  public int getGainedExp() {
    return this.gainedExp;
  }

  public void setGainedExp(int g) {
    this.gainedExp = g;
  }
}

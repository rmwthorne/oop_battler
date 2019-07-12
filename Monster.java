public class Monster extends Creature {
  private int exp;

  public Monster(String name, int hp, int attack, int ac, int damage, int exp) {
    super(name, hp, attack, ac, damage);
    this.exp = exp;
  }

  public int getExp() {
    return this.exp;
  }

  public void setExp(int e) {
    exp = e;
  }
}

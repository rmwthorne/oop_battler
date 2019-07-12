public class Creature {
  protected String name;
  protected int hp;
  protected int attack;
  protected int ac;
  protected int damage;

  public Creature(String name, int hp, int attack, int ac, int damage) {
    this.name = name;
    this.hp = hp;
    this.attack = attack;
    this.ac = ac;
    this.damage = damage;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String n) {
    name = n;
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int h) {
    hp = h;
  }

  public int getAttack() {
    return this.attack;
  }

  public void setAttack(int a) {
    attack = a;
  }

  public int getAc() {
    return this.ac;
  }

  public void setAc(int a) {
    ac = a;
  }

  public int getDamage() {
    return this.damage;
  }

  public void setDamage(int d) {
    damage = d;
  }

}

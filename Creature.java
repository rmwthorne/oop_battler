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

  public int getDamage(int d) {
    return this.damage;
  }

  public void setDamage(int d) {
    damage = d;
  }

  public boolean isAlive() {
    if (hp > 0) {
      return true;
    } else {
      return false;
    }
  }

  public void attackCreature(Creature target) {
    int result = Utils.roll(20, attack);
    if (result > target.ac) {
      // Hit
      target.setHp(target.getHp() - damage);
    }
  }
}

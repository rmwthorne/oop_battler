public class Battlefield {
  public static void main(String[] args) {
    Hero h = new Hero("Elf", 30, 6, 10, 5, 0);
    Monster m = new Monster("Goblin", 5, 2, 10, 2, 25);

    h.attackCreature(m);
    m.attackCreature(h);

    System.out.println(h.getHp());
  }

}

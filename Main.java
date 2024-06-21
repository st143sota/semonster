public class Main {
  public static void main(String[] args) {
    System.out.println("SEMonster!");
    System.out.println("SEMONSTER GAME");
    System.out.println("Show draw monster!");
    Player player = new Player();
    player.drawMonsters();
    player.showDeck();
    Monster monster = new Monster();
    System.out.println(monster.toString());
  }
}
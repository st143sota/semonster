public class Main {
  public static void main(String[] args) {
    System.out.println("SEMonster!");

    // Playerクラスのオブジェクトを作成
    Player player = new Player();

    // モンスターをドロー
    player.drawMonsters();

    // デッキを表示
    player.showDeck();
  }
}
